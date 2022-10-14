package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_module_action", schema = "testssx", catalog = "")
public class SysModuleActionEntity {
    private int id;
    private String moduleOperateName;
    private String code;
    private Integer sort;
    private String icon;
    private String description;
    private int moduleId;
    private String shutcutKey;
    private String codeType;
    private Integer width;
    private Integer height;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ModuleOperateName")
    public String getModuleOperateName() {
        return moduleOperateName;
    }

    public void setModuleOperateName(String moduleOperateName) {
        this.moduleOperateName = moduleOperateName;
    }

    @Basic
    @Column(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "Sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "Icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "ShutcutKey")
    public String getShutcutKey() {
        return shutcutKey;
    }

    public void setShutcutKey(String shutcutKey) {
        this.shutcutKey = shutcutKey;
    }

    @Basic
    @Column(name = "CodeType")
    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    @Basic
    @Column(name = "Width")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Basic
    @Column(name = "Height")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysModuleActionEntity that = (SysModuleActionEntity) o;

        if (id != that.id) return false;
        if (moduleId != that.moduleId) return false;
        if (moduleOperateName != null ? !moduleOperateName.equals(that.moduleOperateName) : that.moduleOperateName != null)
            return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (shutcutKey != null ? !shutcutKey.equals(that.shutcutKey) : that.shutcutKey != null) return false;
        if (codeType != null ? !codeType.equals(that.codeType) : that.codeType != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (moduleOperateName != null ? moduleOperateName.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + moduleId;
        result = 31 * result + (shutcutKey != null ? shutcutKey.hashCode() : 0);
        result = 31 * result + (codeType != null ? codeType.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }
}
