package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_msg_room_status", schema = "testssx", catalog = "")
public class CmMsgRoomStatusEntity {
    private int id;
    private Integer userId;
    private Integer roomId;
    private Integer msgId;
    private Integer status;
    private Integer isReceiveDelete;
    private Timestamp receiveDeleteTime;
    private String realName;
    private String userPhoto;

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
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "MsgID")
    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
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
    @Column(name = "IsReceiveDelete")
    public Integer getIsReceiveDelete() {
        return isReceiveDelete;
    }

    public void setIsReceiveDelete(Integer isReceiveDelete) {
        this.isReceiveDelete = isReceiveDelete;
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
    @Column(name = "RealName")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "UserPhoto")
    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmMsgRoomStatusEntity that = (CmMsgRoomStatusEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (roomId != null ? !roomId.equals(that.roomId) : that.roomId != null) return false;
        if (msgId != null ? !msgId.equals(that.msgId) : that.msgId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (isReceiveDelete != null ? !isReceiveDelete.equals(that.isReceiveDelete) : that.isReceiveDelete != null)
            return false;
        if (receiveDeleteTime != null ? !receiveDeleteTime.equals(that.receiveDeleteTime) : that.receiveDeleteTime != null)
            return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (userPhoto != null ? !userPhoto.equals(that.userPhoto) : that.userPhoto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (roomId != null ? roomId.hashCode() : 0);
        result = 31 * result + (msgId != null ? msgId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (isReceiveDelete != null ? isReceiveDelete.hashCode() : 0);
        result = 31 * result + (receiveDeleteTime != null ? receiveDeleteTime.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (userPhoto != null ? userPhoto.hashCode() : 0);
        return result;
    }
}
