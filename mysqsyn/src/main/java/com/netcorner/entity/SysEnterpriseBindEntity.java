package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_enterprise_bind", schema = "testssx", catalog = "")
public class SysEnterpriseBindEntity {
    private int id;
    private Integer bindEntId1;
    private Integer bindEntId2;
    private String description;
    private Integer addUserId;
    private Integer addUserRoleId;
    private Timestamp addTime;
    private String addEntName;
    private String bindEntName1;
    private String bindEntName2;
    private String type;
    private String addUserName;
    private String addUserEntName;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BindEntID1")
    public Integer getBindEntId1() {
        return bindEntId1;
    }

    public void setBindEntId1(Integer bindEntId1) {
        this.bindEntId1 = bindEntId1;
    }

    @Basic
    @Column(name = "BindEntID2")
    public Integer getBindEntId2() {
        return bindEntId2;
    }

    public void setBindEntId2(Integer bindEntId2) {
        this.bindEntId2 = bindEntId2;
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
    @Column(name = "AddUserID")
    public Integer getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    @Basic
    @Column(name = "AddUserRoleID")
    public Integer getAddUserRoleId() {
        return addUserRoleId;
    }

    public void setAddUserRoleId(Integer addUserRoleId) {
        this.addUserRoleId = addUserRoleId;
    }

    @Basic
    @Column(name = "AddTime")
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "AddEntName")
    public String getAddEntName() {
        return addEntName;
    }

    public void setAddEntName(String addEntName) {
        this.addEntName = addEntName;
    }

    @Basic
    @Column(name = "BindEntName1")
    public String getBindEntName1() {
        return bindEntName1;
    }

    public void setBindEntName1(String bindEntName1) {
        this.bindEntName1 = bindEntName1;
    }

    @Basic
    @Column(name = "BindEntName2")
    public String getBindEntName2() {
        return bindEntName2;
    }

    public void setBindEntName2(String bindEntName2) {
        this.bindEntName2 = bindEntName2;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "AddUserName")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "AddUserEntName")
    public String getAddUserEntName() {
        return addUserEntName;
    }

    public void setAddUserEntName(String addUserEntName) {
        this.addUserEntName = addUserEntName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysEnterpriseBindEntity that = (SysEnterpriseBindEntity) o;

        if (id != that.id) return false;
        if (bindEntId1 != null ? !bindEntId1.equals(that.bindEntId1) : that.bindEntId1 != null) return false;
        if (bindEntId2 != null ? !bindEntId2.equals(that.bindEntId2) : that.bindEntId2 != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (addUserId != null ? !addUserId.equals(that.addUserId) : that.addUserId != null) return false;
        if (addUserRoleId != null ? !addUserRoleId.equals(that.addUserRoleId) : that.addUserRoleId != null)
            return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (addEntName != null ? !addEntName.equals(that.addEntName) : that.addEntName != null) return false;
        if (bindEntName1 != null ? !bindEntName1.equals(that.bindEntName1) : that.bindEntName1 != null) return false;
        if (bindEntName2 != null ? !bindEntName2.equals(that.bindEntName2) : that.bindEntName2 != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addUserEntName != null ? !addUserEntName.equals(that.addUserEntName) : that.addUserEntName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bindEntId1 != null ? bindEntId1.hashCode() : 0);
        result = 31 * result + (bindEntId2 != null ? bindEntId2.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (addUserId != null ? addUserId.hashCode() : 0);
        result = 31 * result + (addUserRoleId != null ? addUserRoleId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (addEntName != null ? addEntName.hashCode() : 0);
        result = 31 * result + (bindEntName1 != null ? bindEntName1.hashCode() : 0);
        result = 31 * result + (bindEntName2 != null ? bindEntName2.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (addUserName != null ? addUserName.hashCode() : 0);
        result = 31 * result + (addUserEntName != null ? addUserEntName.hashCode() : 0);
        return result;
    }
}
