package cn.kspshare.service.impl;

import cn.kspshare.common.id.IDGenerator;
import cn.kspshare.common.restful.ResultBean;
import cn.kspshare.domain.KspBbsSession;
import cn.kspshare.dto.BaseSearchDto;
import cn.kspshare.mapper.KspBbsSessionDynamicSqlSupport;
import cn.kspshare.mapper.KspBbsSessionMapper;
import cn.kspshare.service.BbsSessionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BbsSessionServiceImpl implements BbsSessionService {
    @Autowired
    private KspBbsSessionMapper bbsSessionMapper;

    @Override
    @Transactional(rollbackFor = Exception.class )
    public ResultBean add(KspBbsSession po) {
        KspBbsSession exist = this.queryByName(po.getName());
        if(exist!=null) {
            return ResultBean.FAIL("模块名称已存在！");
        }

        po.setOid(IDGenerator.id());
        po.setCreateTime(LocalDateTime.now());
        po.setUpdateUser(null);
        po.setUpdateTime(null);

        int i = bbsSessionMapper.insertSelective(po);
        return ResultBean.SUCCESS(i);
    }

    @Override
    @Transactional(rollbackFor = Exception.class )
    public ResultBean update(KspBbsSession po) {
        if(po.getOid()==null) {
            return ResultBean.PRIMARY_KEY_ONT_NULL();
        }
        po.setCreateTime(null);
        po.setCreateUser(null);
        po.setUpdateTime(LocalDateTime.now());
        int i = bbsSessionMapper.updateByPrimaryKeySelective(po);
        return ResultBean.SUCCESS(i);
    }

    @Override
    @Transactional(rollbackFor = Exception.class )
    public ResultBean delete(Long oid) {
        int i = bbsSessionMapper.deleteByPrimaryKey(oid);
        return ResultBean.SUCCESS(i);
    }

    @Override
    public ResultBean queryCondition(BaseSearchDto param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<KspBbsSession> select = bbsSessionMapper.select(c ->
                c.where(KspBbsSessionDynamicSqlSupport.name, SqlBuilder.isLike("%"+param.getSearchText()+"%"))
                .or(KspBbsSessionDynamicSqlSupport.profile, SqlBuilder.isLike("%"+param.getSearchText()+"%")));

        PageInfo<KspBbsSession> pageInfo = new PageInfo<>(select);
        return ResultBean.SUCCESS(pageInfo);
    }

    @Override
    public KspBbsSession queryByName(String name) {
        List<KspBbsSession> select = bbsSessionMapper.select(c -> c.where(KspBbsSessionDynamicSqlSupport.name, SqlBuilder.isEqualTo(name)));
        return CollectionUtils.isEmpty(select) ? null : select.get(0);
    }
}
