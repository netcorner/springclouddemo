package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_dev_module_action", schema = "testssx", catalog = "")
public class SysDevModuleActionEntity {
    private int id;
    private int moduleId;
    private String moduleOperateName;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ModuleID")
    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    @Basic
    @Column(name = "ModuleOperateName")
    public String getModuleOperateName() {
        return moduleOperateName;
    }

    public void setModuleOperateName(String moduleOperateName) {
        this.moduleOperateName = moduleOperateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysDevModuleActionEntity that = (SysDevModuleActionEntity) o;

        if (id != that.id) return false;
        if (moduleId != that.moduleId) return false;
        if (moduleOperateName != null ? !moduleOperateName.equals(that.moduleOperateName) : that.moduleOperateName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + moduleId;
        result = 31 * result + (moduleOperateName != null ? moduleOperateName.hashCode() : 0);
        return result;
    }
}
