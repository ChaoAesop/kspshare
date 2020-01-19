package cn.kspshare.controller;

import cn.kspshare.common.restful.ResultBean;
import cn.kspshare.domain.KspRole;
import cn.kspshare.dto.KspRoleDto;
import cn.kspshare.service.KspRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@Slf4j
@Api(tags = "角色管理")
public class RoleController {
    @Autowired
    private KspRoleService kspRoleService;

    /**
     * 添加角色
     * @param dto
     * @return
     */
    @ApiOperation("添加角色")
    @PostMapping("/role")
    public ResultBean add(@RequestBody @Validated KspRoleDto dto) {
        return kspRoleService.add(dto);
    }

    /**
     * 更新角色
     * @param dto
     * @return
     */
    @ApiOperation("更新角色")
    @PutMapping(value = "/role/{oid}")
    public ResultBean update(@RequestBody @Validated KspRoleDto dto, @PathVariable Long oid) {
        return kspRoleService.update(dto, oid);
    }

    /**
     * 删除角色
     * @param oid
     * @return
     */
    @ApiOperation("删除角色")
    @DeleteMapping("/role/{oid}")
    public ResultBean delete(@PathVariable Long oid) {
        return kspRoleService.delete(oid);
    }

    /**
     * 根据用户查找角色列表
     * @return
     */
    @ApiOperation("根据用户查找角色列表")
    @GetMapping("/perm/list/{resourceId}")
    public ResultBean listByAdminUserId(@PathVariable Long resourceId) {
        List<KspRole> kspRoles = kspRoleService.listByAdminUserId(resourceId);
        return ResultBean.SUCCESS(kspRoles);
    }
}
