package com.netcorner.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by shijiufeng on 2022/1/23.
 */
public class SysRoleActionEntityPK implements Serializable {
    private int roleId;
    private int actionId;

    @Column(name = "RoleID")
    @Id
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column(name = "ActionID")
    @Id
    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRoleActionEntityPK that = (SysRoleActionEntityPK) o;

        if (roleId != that.roleId) return false;
        if (actionId != that.actionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + actionId;
        return result;
    }
}
