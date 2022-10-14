package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_role_action", schema = "testssx", catalog = "")
@IdClass(SysRoleActionEntityPK.class)
public class SysRoleActionEntity {
    private int roleId;
    private int actionId;
    private int moduleId;

    @Id
    @Column(name = "RoleID")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "ActionID")
    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    @Basic
    @Column(name = "ModuleID")
    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRoleActionEntity that = (SysRoleActionEntity) o;

        if (roleId != that.roleId) return false;
        if (actionId != that.actionId) return false;
        if (moduleId != that.moduleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + actionId;
        result = 31 * result + moduleId;
        return result;
    }
}
