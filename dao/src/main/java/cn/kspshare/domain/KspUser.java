package cn.kspshare.domain;

import java.time.LocalDateTime;
import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ksp_user
 */
public class KspUser {
    /**
     * Database Column Remarks:
     *   主键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.oid")
    private Long oid;

    /**
     * Database Column Remarks:
     *   账号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.username")
    private String username;

    /**
     * Database Column Remarks:
     *   密码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.password")
    private String password;

    /**
     * Database Column Remarks:
     *   昵称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.nickname")
    private String nickname;

    /**
     * Database Column Remarks:
     *   身份权限
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.roles")
    private String roles;

    /**
     * Database Column Remarks:
     *   邮箱
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.create_time")
    private LocalDateTime createTime;

    /**
     * Database Column Remarks:
     *   是可以登录 true1启用 false0禁用
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.enabled")
    private Boolean enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.nickname")
    public String getNickname() {
        return nickname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.roles")
    public String getRoles() {
        return roles;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.roles")
    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.create_time")
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.create_time")
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ksp_user.enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}