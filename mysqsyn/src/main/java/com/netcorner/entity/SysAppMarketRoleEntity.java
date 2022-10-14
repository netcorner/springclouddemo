package com.netcorner.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_app_market_role", schema = "testssx", catalog = "")
public class SysAppMarketRoleEntity {
    private Integer roleId;
    private Integer appMarketId;

    @Basic
    @Column(name = "RoleID")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "AppMarketID")
    public Integer getAppMarketId() {
        return appMarketId;
    }

    public void setAppMarketId(Integer appMarketId) {
        this.appMarketId = appMarketId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysAppMarketRoleEntity that = (SysAppMarketRoleEntity) o;

        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (appMarketId != null ? !appMarketId.equals(that.appMarketId) : that.appMarketId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (appMarketId != null ? appMarketId.hashCode() : 0);
        return result;
    }
}
