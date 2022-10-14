package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_msg_last", schema = "testssx", catalog = "")
public class CmMsgLastEntity {
    private int id;
    private Integer msgId;
    private Integer userId;
    private Integer contactUserId;
    private Integer type;
    private Integer unReadTotal;
    private String msg;
    private Timestamp sendTime;
    private Integer msgType;
    private String appId;
    private String contactRealName;
    private String contactUserPhoto;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MsgID")
    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    @Basic
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ContactUserID")
    public Integer getContactUserId() {
        return contactUserId;
    }

    public void setContactUserId(Integer contactUserId) {
        this.contactUserId = contactUserId;
    }

    @Basic
    @Column(name = "Type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "UnReadTotal")
    public Integer getUnReadTotal() {
        return unReadTotal;
    }

    public void setUnReadTotal(Integer unReadTotal) {
        this.unReadTotal = unReadTotal;
    }

    @Basic
    @Column(name = "Msg")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Basic
    @Column(name = "SendTime")
    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Basic
    @Column(name = "MsgType")
    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    @Basic
    @Column(name = "AppID")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "ContactRealName")
    public String getContactRealName() {
        return contactRealName;
    }

    public void setContactRealName(String contactRealName) {
        this.contactRealName = contactRealName;
    }

    @Basic
    @Column(name = "ContactUserPhoto")
    public String getContactUserPhoto() {
        return contactUserPhoto;
    }

    public void setContactUserPhoto(String contactUserPhoto) {
        this.contactUserPhoto = contactUserPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmMsgLastEntity that = (CmMsgLastEntity) o;

        if (id != that.id) return false;
        if (msgId != null ? !msgId.equals(that.msgId) : that.msgId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (contactUserId != null ? !contactUserId.equals(that.contactUserId) : that.contactUserId != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (unReadTotal != null ? !unReadTotal.equals(that.unReadTotal) : that.unReadTotal != null) return false;
        if (msg != null ? !msg.equals(that.msg) : that.msg != null) return false;
        if (sendTime != null ? !sendTime.equals(that.sendTime) : that.sendTime != null) return false;
        if (msgType != null ? !msgType.equals(that.msgType) : that.msgType != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (contactRealName != null ? !contactRealName.equals(that.contactRealName) : that.contactRealName != null)
            return false;
        if (contactUserPhoto != null ? !contactUserPhoto.equals(that.contactUserPhoto) : that.contactUserPhoto != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (msgId != null ? msgId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (contactUserId != null ? contactUserId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (unReadTotal != null ? unReadTotal.hashCode() : 0);
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        result = 31 * result + (sendTime != null ? sendTime.hashCode() : 0);
        result = 31 * result + (msgType != null ? msgType.hashCode() : 0);
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (contactRealName != null ? contactRealName.hashCode() : 0);
        result = 31 * result + (contactUserPhoto != null ? contactUserPhoto.hashCode() : 0);
        return result;
    }
}
