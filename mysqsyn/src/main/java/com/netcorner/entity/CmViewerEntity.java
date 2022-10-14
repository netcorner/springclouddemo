package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_viewer", schema = "testssx", catalog = "")
public class CmViewerEntity {
    private int id;
    private int userId;
    private Timestamp lastViewTime;
    private String type;
    private String targetId;
    private Integer viewTotal;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "LastViewTime")
    public Timestamp getLastViewTime() {
        return lastViewTime;
    }

    public void setLastViewTime(Timestamp lastViewTime) {
        this.lastViewTime = lastViewTime;
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
    @Column(name = "TargetID")
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Basic
    @Column(name = "ViewTotal")
    public Integer getViewTotal() {
        return viewTotal;
    }

    public void setViewTotal(Integer viewTotal) {
        this.viewTotal = viewTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmViewerEntity that = (CmViewerEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (lastViewTime != null ? !lastViewTime.equals(that.lastViewTime) : that.lastViewTime != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (targetId != null ? !targetId.equals(that.targetId) : that.targetId != null) return false;
        if (viewTotal != null ? !viewTotal.equals(that.viewTotal) : that.viewTotal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + (lastViewTime != null ? lastViewTime.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (targetId != null ? targetId.hashCode() : 0);
        result = 31 * result + (viewTotal != null ? viewTotal.hashCode() : 0);
        return result;
    }
}
