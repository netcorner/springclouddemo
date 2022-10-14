package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_msg_room", schema = "testssx", catalog = "")
public class CmMsgRoomEntity {
    private int id;
    private Integer userId;
    private Timestamp addTime;
    private String name;
    private String photo;
    private Integer isTop;
    private Integer total;
    private Timestamp lastPubTime;
    private String lastPubUserName;
    private String lastMsg;
    private Integer entId;
    private String contact;
    private String userPhoto;
    private Integer isDeleted;
    private Integer deleteUserId;
    private Timestamp deleteTime;

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
    @Column(name = "AddTime")
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "IsTop")
    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    @Basic
    @Column(name = "Total")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Basic
    @Column(name = "LastPubTime")
    public Timestamp getLastPubTime() {
        return lastPubTime;
    }

    public void setLastPubTime(Timestamp lastPubTime) {
        this.lastPubTime = lastPubTime;
    }

    @Basic
    @Column(name = "LastPubUserName")
    public String getLastPubUserName() {
        return lastPubUserName;
    }

    public void setLastPubUserName(String lastPubUserName) {
        this.lastPubUserName = lastPubUserName;
    }

    @Basic
    @Column(name = "LastMsg")
    public String getLastMsg() {
        return lastMsg;
    }

    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
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
    @Column(name = "Contact")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "UserPhoto")
    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Basic
    @Column(name = "IsDeleted")
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "DeleteUserID")
    public Integer getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(Integer deleteUserId) {
        this.deleteUserId = deleteUserId;
    }

    @Basic
    @Column(name = "DeleteTime")
    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmMsgRoomEntity that = (CmMsgRoomEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (isTop != null ? !isTop.equals(that.isTop) : that.isTop != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (lastPubTime != null ? !lastPubTime.equals(that.lastPubTime) : that.lastPubTime != null) return false;
        if (lastPubUserName != null ? !lastPubUserName.equals(that.lastPubUserName) : that.lastPubUserName != null)
            return false;
        if (lastMsg != null ? !lastMsg.equals(that.lastMsg) : that.lastMsg != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (contact != null ? !contact.equals(that.contact) : that.contact != null) return false;
        if (userPhoto != null ? !userPhoto.equals(that.userPhoto) : that.userPhoto != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (deleteUserId != null ? !deleteUserId.equals(that.deleteUserId) : that.deleteUserId != null) return false;
        if (deleteTime != null ? !deleteTime.equals(that.deleteTime) : that.deleteTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (isTop != null ? isTop.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (lastPubTime != null ? lastPubTime.hashCode() : 0);
        result = 31 * result + (lastPubUserName != null ? lastPubUserName.hashCode() : 0);
        result = 31 * result + (lastMsg != null ? lastMsg.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (userPhoto != null ? userPhoto.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (deleteUserId != null ? deleteUserId.hashCode() : 0);
        result = 31 * result + (deleteTime != null ? deleteTime.hashCode() : 0);
        return result;
    }
}
