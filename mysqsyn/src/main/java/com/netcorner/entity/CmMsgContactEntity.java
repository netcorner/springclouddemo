package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_msg_contact", schema = "testssx", catalog = "")
public class CmMsgContactEntity {
    private int id;
    private Integer contactUserId;
    private String realName;
    private String userName;
    private String description;
    private String realNamePinYinIndex;
    private String userPhoto;
    private Integer userId;
    private Timestamp addTime;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "RealName")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
    @Column(name = "RealNamePinYinIndex")
    public String getRealNamePinYinIndex() {
        return realNamePinYinIndex;
    }

    public void setRealNamePinYinIndex(String realNamePinYinIndex) {
        this.realNamePinYinIndex = realNamePinYinIndex;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmMsgContactEntity that = (CmMsgContactEntity) o;

        if (id != that.id) return false;
        if (contactUserId != null ? !contactUserId.equals(that.contactUserId) : that.contactUserId != null)
            return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (realNamePinYinIndex != null ? !realNamePinYinIndex.equals(that.realNamePinYinIndex) : that.realNamePinYinIndex != null)
            return false;
        if (userPhoto != null ? !userPhoto.equals(that.userPhoto) : that.userPhoto != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (contactUserId != null ? contactUserId.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (realNamePinYinIndex != null ? realNamePinYinIndex.hashCode() : 0);
        result = 31 * result + (userPhoto != null ? userPhoto.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        return result;
    }
}
