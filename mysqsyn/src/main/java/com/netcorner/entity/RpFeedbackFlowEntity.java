package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "rp_feedback_flow", schema = "testssx", catalog = "")
public class RpFeedbackFlowEntity {
    private int id;
    private Integer feedbackId;
    private String description;
    private Double pubLat;
    private Double pubLon;
    private Integer status;
    private Integer entId;
    private Integer userId;
    private Timestamp addTime;
    private String exeDescription;
    private String entName;
    private String realName;
    private Integer appointType;
    private String appointEntName;
    private String appointEntRealName;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FeedbackID")
    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
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
    @Column(name = "PubLat")
    public Double getPubLat() {
        return pubLat;
    }

    public void setPubLat(Double pubLat) {
        this.pubLat = pubLat;
    }

    @Basic
    @Column(name = "PubLon")
    public Double getPubLon() {
        return pubLon;
    }

    public void setPubLon(Double pubLon) {
        this.pubLon = pubLon;
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
    @Column(name = "EntID")
    public Integer getEntId() {
        return entId;
    }

    public void setEntId(Integer entId) {
        this.entId = entId;
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
    @Column(name = "ExeDescription")
    public String getExeDescription() {
        return exeDescription;
    }

    public void setExeDescription(String exeDescription) {
        this.exeDescription = exeDescription;
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
    @Column(name = "RealName")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "AppointType")
    public Integer getAppointType() {
        return appointType;
    }

    public void setAppointType(Integer appointType) {
        this.appointType = appointType;
    }

    @Basic
    @Column(name = "AppointEntName")
    public String getAppointEntName() {
        return appointEntName;
    }

    public void setAppointEntName(String appointEntName) {
        this.appointEntName = appointEntName;
    }

    @Basic
    @Column(name = "AppointEntRealName")
    public String getAppointEntRealName() {
        return appointEntRealName;
    }

    public void setAppointEntRealName(String appointEntRealName) {
        this.appointEntRealName = appointEntRealName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RpFeedbackFlowEntity that = (RpFeedbackFlowEntity) o;

        if (id != that.id) return false;
        if (feedbackId != null ? !feedbackId.equals(that.feedbackId) : that.feedbackId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (pubLat != null ? !pubLat.equals(that.pubLat) : that.pubLat != null) return false;
        if (pubLon != null ? !pubLon.equals(that.pubLon) : that.pubLon != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (exeDescription != null ? !exeDescription.equals(that.exeDescription) : that.exeDescription != null)
            return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (appointType != null ? !appointType.equals(that.appointType) : that.appointType != null) return false;
        if (appointEntName != null ? !appointEntName.equals(that.appointEntName) : that.appointEntName != null)
            return false;
        if (appointEntRealName != null ? !appointEntRealName.equals(that.appointEntRealName) : that.appointEntRealName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (feedbackId != null ? feedbackId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (pubLat != null ? pubLat.hashCode() : 0);
        result = 31 * result + (pubLon != null ? pubLon.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (exeDescription != null ? exeDescription.hashCode() : 0);
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (appointType != null ? appointType.hashCode() : 0);
        result = 31 * result + (appointEntName != null ? appointEntName.hashCode() : 0);
        result = 31 * result + (appointEntRealName != null ? appointEntRealName.hashCode() : 0);
        return result;
    }
}
