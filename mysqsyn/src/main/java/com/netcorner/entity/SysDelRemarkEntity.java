package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_del_remark", schema = "testssx", catalog = "")
public class SysDelRemarkEntity {
    private int id;
    private Integer managerId;
    private String delTable;
    private Integer delId;
    private Timestamp delTime;
    private String remark;
    private Integer isDeleted;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ManagerID")
    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "DelTable")
    public String getDelTable() {
        return delTable;
    }

    public void setDelTable(String delTable) {
        this.delTable = delTable;
    }

    @Basic
    @Column(name = "DelID")
    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }

    @Basic
    @Column(name = "DelTime")
    public Timestamp getDelTime() {
        return delTime;
    }

    public void setDelTime(Timestamp delTime) {
        this.delTime = delTime;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "IsDeleted")
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysDelRemarkEntity that = (SysDelRemarkEntity) o;

        if (id != that.id) return false;
        if (managerId != null ? !managerId.equals(that.managerId) : that.managerId != null) return false;
        if (delTable != null ? !delTable.equals(that.delTable) : that.delTable != null) return false;
        if (delId != null ? !delId.equals(that.delId) : that.delId != null) return false;
        if (delTime != null ? !delTime.equals(that.delTime) : that.delTime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (managerId != null ? managerId.hashCode() : 0);
        result = 31 * result + (delTable != null ? delTable.hashCode() : 0);
        result = 31 * result + (delId != null ? delId.hashCode() : 0);
        result = 31 * result + (delTime != null ? delTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        return result;
    }
}
