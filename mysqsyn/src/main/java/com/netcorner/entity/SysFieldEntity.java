package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_field", schema = "testssx", catalog = "")
public class SysFieldEntity {
    private int id;
    private String fieldDisplay;
    private String fieldValue;
    private int fieldTypeId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FieldDisplay")
    public String getFieldDisplay() {
        return fieldDisplay;
    }

    public void setFieldDisplay(String fieldDisplay) {
        this.fieldDisplay = fieldDisplay;
    }

    @Basic
    @Column(name = "FieldValue")
    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Basic
    @Column(name = "FieldTypeID")
    public int getFieldTypeId() {
        return fieldTypeId;
    }

    public void setFieldTypeId(int fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysFieldEntity that = (SysFieldEntity) o;

        if (id != that.id) return false;
        if (fieldTypeId != that.fieldTypeId) return false;
        if (fieldDisplay != null ? !fieldDisplay.equals(that.fieldDisplay) : that.fieldDisplay != null) return false;
        if (fieldValue != null ? !fieldValue.equals(that.fieldValue) : that.fieldValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fieldDisplay != null ? fieldDisplay.hashCode() : 0);
        result = 31 * result + (fieldValue != null ? fieldValue.hashCode() : 0);
        result = 31 * result + fieldTypeId;
        return result;
    }
}
