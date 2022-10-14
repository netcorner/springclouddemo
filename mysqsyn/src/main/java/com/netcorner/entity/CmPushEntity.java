package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_push", schema = "testssx", catalog = "")
public class CmPushEntity {
    private int id;
    private String type;
    private String targetId;
    private String pushType;
    private Timestamp addTime;
    private Integer status;
    private Integer addUserId;
    private Integer sendEntId;
    private Integer sendUserId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "PushType")
    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType;
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
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    @Column(name = "SendEntID")
    public Integer getSendEntId() {
        return sendEntId;
    }

    public void setSendEntId(Integer sendEntId) {
        this.sendEntId = sendEntId;
    }

    @Basic
    @Column(name = "SendUserID")
    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmPushEntity that = (CmPushEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (targetId != null ? !targetId.equals(that.targetId) : that.targetId != null) return false;
        if (pushType != null ? !pushType.equals(that.pushType) : that.pushType != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (addUserId != null ? !addUserId.equals(that.addUserId) : that.addUserId != null) return false;
        if (sendEntId != null ? !sendEntId.equals(that.sendEntId) : that.sendEntId != null) return false;
        if (sendUserId != null ? !sendUserId.equals(that.sendUserId) : that.sendUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (targetId != null ? targetId.hashCode() : 0);
        result = 31 * result + (pushType != null ? pushType.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (addUserId != null ? addUserId.hashCode() : 0);
        result = 31 * result + (sendEntId != null ? sendEntId.hashCode() : 0);
        result = 31 * result + (sendUserId != null ? sendUserId.hashCode() : 0);
        return result;
    }
}
