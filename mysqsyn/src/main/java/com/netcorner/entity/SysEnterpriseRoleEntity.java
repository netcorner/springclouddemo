package com.netcorner.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_enterprise_role", schema = "testssx", catalog = "")
public class SysEnterpriseRoleEntity {
    private int entId;
    private int roleId;
    private String roleKey;
    private int isRegMain;

    @Basic
    @Column(name = "EntID")
    public int getEntId() {
        return entId;
    }

    public void setEntId(int entId) {
        this.entId = entId;
    }

    @Basic
    @Column(name = "RoleID")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "RoleKey")
    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    @Basic
    @Column(name = "IsRegMain")
    public int getIsRegMain() {
        return isRegMain;
    }

    public void setIsRegMain(int isRegMain) {
        this.isRegMain = isRegMain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysEnterpriseRoleEntity that = (SysEnterpriseRoleEntity) o;

        if (entId != that.entId) return false;
        if (roleId != that.roleId) return false;
        if (isRegMain != that.isRegMain) return false;
        if (roleKey != null ? !roleKey.equals(that.roleKey) : that.roleKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entId;
        result = 31 * result + roleId;
        result = 31 * result + (roleKey != null ? roleKey.hashCode() : 0);
        result = 31 * result + isRegMain;
        return result;
    }
}
