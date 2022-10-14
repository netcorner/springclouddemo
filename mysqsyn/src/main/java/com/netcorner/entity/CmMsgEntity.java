package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_msg", schema = "testssx", catalog = "")
public class CmMsgEntity {
    private int id;
    private String msg;
    private Timestamp sendTime;
    private Integer sendUserId;
    private Integer receiveUserId;
    private Timestamp receiveTime;
    private Integer status;
    private Integer msgType;
    private Integer roomId;
    private Double second;
    private Integer isReceiveRead;
    private Integer isEphemerality;
    private Integer isSendDelete;
    private Integer isReceiveDelete;
    private Timestamp sendDeleteTime;
    private Timestamp receiveDeleteTime;
    private Double pubLat;
    private Double pubLng;
    private Timestamp getTime;
    private String downPath;
    private String appId;
    private String targetId;
    private String sendRealName;
    private String sendUserPhoto;
    private String receiveRealName;
    private String receiveUserPhoto;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "SendUserID")
    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    @Basic
    @Column(name = "ReceiveUserID")
    public Integer getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    @Basic
    @Column(name = "ReceiveTime")
    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
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
    @Column(name = "MsgType")
    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    @Basic
    @Column(name = "RoomID")
    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    @Basic
    @Column(name = "Second")
    public Double getSecond() {
        return second;
    }

    public void setSecond(Double second) {
        this.second = second;
    }

    @Basic
    @Column(name = "IsReceiveRead")
    public Integer getIsReceiveRead() {
        return isReceiveRead;
    }

    public void setIsReceiveRead(Integer isReceiveRead) {
        this.isReceiveRead = isReceiveRead;
    }

    @Basic
    @Column(name = "IsEphemerality")
    public Integer getIsEphemerality() {
        return isEphemerality;
    }

    public void setIsEphemerality(Integer isEphemerality) {
        this.isEphemerality = isEphemerality;
    }

    @Basic
    @Column(name = "IsSendDelete")
    public Integer getIsSendDelete() {
        return isSendDelete;
    }

    public void setIsSendDelete(Integer isSendDelete) {
        this.isSendDelete = isSendDelete;
    }

    @Basic
    @Column(name = "IsReceiveDelete")
    public Integer getIsReceiveDelete() {
        return isReceiveDelete;
    }

    public void setIsReceiveDelete(Integer isReceiveDelete) {
        this.isReceiveDelete = isReceiveDelete;
    }

    @Basic
    @Column(name = "SendDeleteTime")
    public Timestamp getSendDeleteTime() {
        return sendDeleteTime;
    }

    public void setSendDeleteTime(Timestamp sendDeleteTime) {
        this.sendDeleteTime = sendDeleteTime;
    }

    @Basic
    @Column(name = "ReceiveDeleteTime")
    public Timestamp getReceiveDeleteTime() {
        return receiveDeleteTime;
    }

    public void setReceiveDeleteTime(Timestamp receiveDeleteTime) {
        this.receiveDeleteTime = receiveDeleteTime;
    }

    @Basic
    @Column(name = "PubLat")
    public Double getPubLat() {
        return pubLat;
    }

    public void setPubLat(Double pubLat) {
        this.pubLat = pubLat;
    }

    @Basic
    @Column(name = "PubLng")
    public Double getPubLng() {
        return pubLng;
    }

    public void setPubLng(Double pubLng) {
        this.pubLng = pubLng;
    }

    @Basic
    @Column(name = "GetTime")
    public Timestamp getGetTime() {
        return getTime;
    }

    public void setGetTime(Timestamp getTime) {
        this.getTime = getTime;
    }

    @Basic
    @Column(name = "DownPath")
    public String getDownPath() {
        return downPath;
    }

    public void setDownPath(String downPath) {
        this.downPath = downPath;
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
    @Column(name = "TargetID")
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Basic
    @Column(name = "SendRealName")
    public String getSendRealName() {
        return sendRealName;
    }

    public void setSendRealName(String sendRealName) {
        this.sendRealName = sendRealName;
    }

    @Basic
    @Column(name = "SendUserPhoto")
    public String getSendUserPhoto() {
        return sendUserPhoto;
    }

    public void setSendUserPhoto(String sendUserPhoto) {
        this.sendUserPhoto = sendUserPhoto;
    }

    @Basic
    @Column(name = "ReceiveRealName")
    public String getReceiveRealName() {
        return receiveRealName;
    }

    public void setReceiveRealName(String receiveRealName) {
        this.receiveRealName = receiveRealName;
    }

    @Basic
    @Column(name = "ReceiveUserPhoto")
    public String getReceiveUserPhoto() {
        return receiveUserPhoto;
    }

    public void setReceiveUserPhoto(String receiveUserPhoto) {
        this.receiveUserPhoto = receiveUserPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmMsgEntity that = (CmMsgEntity) o;

        if (id != that.id) return false;
        if (msg != null ? !msg.equals(that.msg) : that.msg != null) return false;
        if (sendTime != null ? !sendTime.equals(that.sendTime) : that.sendTime != null) return false;
        if (sendUserId != null ? !sendUserId.equals(that.sendUserId) : that.sendUserId != null) return false;
        if (receiveUserId != null ? !receiveUserId.equals(that.receiveUserId) : that.receiveUserId != null)
            return false;
        if (receiveTime != null ? !receiveTime.equals(that.receiveTime) : that.receiveTime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (msgType != null ? !msgType.equals(that.msgType) : that.msgType != null) return false;
        if (roomId != null ? !roomId.equals(that.roomId) : that.roomId != null) return false;
        if (second != null ? !second.equals(that.second) : that.second != null) return false;
        if (isReceiveRead != null ? !isReceiveRead.equals(that.isReceiveRead) : that.isReceiveRead != null)
            return false;
        if (isEphemerality != null ? !isEphemerality.equals(that.isEphemerality) : that.isEphemerality != null)
            return false;
        if (isSendDelete != null ? !isSendDelete.equals(that.isSendDelete) : that.isSendDelete != null) return false;
        if (isReceiveDelete != null ? !isReceiveDelete.equals(that.isReceiveDelete) : that.isReceiveDelete != null)
            return false;
        if (sendDeleteTime != null ? !sendDeleteTime.equals(that.sendDeleteTime) : that.sendDeleteTime != null)
            return false;
        if (receiveDeleteTime != null ? !receiveDeleteTime.equals(that.receiveDeleteTime) : that.receiveDeleteTime != null)
            return false;
        if (pubLat != null ? !pubLat.equals(that.pubLat) : that.pubLat != null) return false;
        if (pubLng != null ? !pubLng.equals(that.pubLng) : that.pubLng != null) return false;
        if (getTime != null ? !getTime.equals(that.getTime) : that.getTime != null) return false;
        if (downPath != null ? !downPath.equals(that.downPath) : that.downPath != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (targetId != null ? !targetId.equals(that.targetId) : that.targetId != null) return false;
        if (sendRealName != null ? !sendRealName.equals(that.sendRealName) : that.sendRealName != null) return false;
        if (sendUserPhoto != null ? !sendUserPhoto.equals(that.sendUserPhoto) : that.sendUserPhoto != null)
            return false;
        if (receiveRealName != null ? !receiveRealName.equals(that.receiveRealName) : that.receiveRealName != null)
            return false;
        if (receiveUserPhoto != null ? !receiveUserPhoto.equals(that.receiveUserPhoto) : that.receiveUserPhoto != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        result = 31 * result + (sendTime != null ? sendTime.hashCode() : 0);
        result = 31 * result + (sendUserId != null ? sendUserId.hashCode() : 0);
        result = 31 * result + (receiveUserId != null ? receiveUserId.hashCode() : 0);
        result = 31 * result + (receiveTime != null ? receiveTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (msgType != null ? msgType.hashCode() : 0);
        result = 31 * result + (roomId != null ? roomId.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (isReceiveRead != null ? isReceiveRead.hashCode() : 0);
        result = 31 * result + (isEphemerality != null ? isEphemerality.hashCode() : 0);
        result = 31 * result + (isSendDelete != null ? isSendDelete.hashCode() : 0);
        result = 31 * result + (isReceiveDelete != null ? isReceiveDelete.hashCode() : 0);
        result = 31 * result + (sendDeleteTime != null ? sendDeleteTime.hashCode() : 0);
        result = 31 * result + (receiveDeleteTime != null ? receiveDeleteTime.hashCode() : 0);
        result = 31 * result + (pubLat != null ? pubLat.hashCode() : 0);
        result = 31 * result + (pubLng != null ? pubLng.hashCode() : 0);
        result = 31 * result + (getTime != null ? getTime.hashCode() : 0);
        result = 31 * result + (downPath != null ? downPath.hashCode() : 0);
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (targetId != null ? targetId.hashCode() : 0);
        result = 31 * result + (sendRealName != null ? sendRealName.hashCode() : 0);
        result = 31 * result + (sendUserPhoto != null ? sendUserPhoto.hashCode() : 0);
        result = 31 * result + (receiveRealName != null ? receiveRealName.hashCode() : 0);
        result = 31 * result + (receiveUserPhoto != null ? receiveUserPhoto.hashCode() : 0);
        return result;
    }
}
