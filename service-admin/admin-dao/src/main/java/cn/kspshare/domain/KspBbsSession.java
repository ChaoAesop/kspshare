package cn.kspshare.domain;

import java.time.LocalDateTime;
import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ksp_bbs_session
 */
public class KspBbsSession {
    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.oid")
    private Long oid;

    /**
     * Database Column Remarks:
     *   板块名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.name")
    private String name;

    /**
     * Database Column Remarks:
     *   板块主题、简要
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.profile")
    private String profile;

    /**
     * Database Column Remarks:
     *   总发帖数
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.topic_count")
    private Integer topicCount;

    /**
     * Database Column Remarks:
     *   总浏览量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.view_count")
    private Integer viewCount;

    /**
     * Database Column Remarks:
     *   总点击率
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.click_rate")
    private Float clickRate;

    /**
     * Database Column Remarks:
     *   排序
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.sort")
    private Integer sort;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.create_time")
    private LocalDateTime createTime;

    /**
     * Database Column Remarks:
     *   创建人ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.create_user")
    private Long createUser;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.update_time")
    private LocalDateTime updateTime;

    /**
     * Database Column Remarks:
     *   更新人ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.update_user")
    private Long updateUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.profile")
    public String getProfile() {
        return profile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.topic_count")
    public Integer getTopicCount() {
        return topicCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.topic_count")
    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.view_count")
    public Integer getViewCount() {
        return viewCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.view_count")
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.click_rate")
    public Float getClickRate() {
        return clickRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.click_rate")
    public void setClickRate(Float clickRate) {
        this.clickRate = clickRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.sort")
    public Integer getSort() {
        return sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.create_time")
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.create_time")
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.create_user")
    public Long getCreateUser() {
        return createUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.create_user")
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.update_time")
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.update_time")
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.update_user")
    public Long getUpdateUser() {
        return updateUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_bbs_session.update_user")
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }
}