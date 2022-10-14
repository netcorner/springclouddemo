package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_enterprise_bind_tag_history", schema = "testssx", catalog = "")
public class SysEnterpriseBindTagHistoryEntity {
    private int id;
    private Integer entId;
    private String tagId;
    private Timestamp addTime;
    private Integer addUserId;
    private String tagName;
    private String entName;
    private String type;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "EntID")
    public Integer getEntId() {
        return entId;
    }

    public void setEntId(Integer entId) {
        this.entId = entId;
    }

    @Basic
    @Column(name = "TagID")
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
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
    @Column(name = "AddUserID")
    public Integer getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    @Basic
    @Column(name = "TagName")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Basic
    @Column(name = "EntName")
    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysEnterpriseBindTagHistoryEntity that = (SysEnterpriseBindTagHistoryEntity) o;

        if (id != that.id) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (tagId != null ? !tagId.equals(that.tagId) : that.tagId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (addUserId != null ? !addUserId.equals(that.addUserId) : that.addUserId != null) return false;
        if (tagName != null ? !tagName.equals(that.tagName) : that.tagName != null) return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (tagId != null ? tagId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (addUserId != null ? addUserId.hashCode() : 0);
        result = 31 * result + (tagName != null ? tagName.hashCode() : 0);
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
