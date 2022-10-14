package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_enterprise_tag_bind", schema = "testssx", catalog = "")
public class SysEnterpriseTagBindEntity {
    private int id;
    private int tagId;
    private String tagName;
    private int tagedId;
    private String tagedName;
    private Timestamp addTime;
    private Integer userId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TagID")
    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
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
    @Column(name = "TagedID")
    public int getTagedId() {
        return tagedId;
    }

    public void setTagedId(int tagedId) {
        this.tagedId = tagedId;
    }

    @Basic
    @Column(name = "TagedName")
    public String getTagedName() {
        return tagedName;
    }

    public void setTagedName(String tagedName) {
        this.tagedName = tagedName;
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
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysEnterpriseTagBindEntity that = (SysEnterpriseTagBindEntity) o;

        if (id != that.id) return false;
        if (tagId != that.tagId) return false;
        if (tagedId != that.tagedId) return false;
        if (tagName != null ? !tagName.equals(that.tagName) : that.tagName != null) return false;
        if (tagedName != null ? !tagedName.equals(that.tagedName) : that.tagedName != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tagId;
        result = 31 * result + (tagName != null ? tagName.hashCode() : 0);
        result = 31 * result + tagedId;
        result = 31 * result + (tagedName != null ? tagedName.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
