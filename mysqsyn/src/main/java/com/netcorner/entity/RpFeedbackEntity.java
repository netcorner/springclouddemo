package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "rp_feedback", schema = "testssx", catalog = "")
public class RpFeedbackEntity {
    private int id;
    private String serialNum;
    private Integer areaId;
    private String areaName;
    private String repairType;
    private String description;
    private Double pubLat;
    private Double pubLon;
    private Integer status;
    private Integer entId;
    private Integer userId;
    private Timestamp addTime;
    private Integer isDeleted;
    private Timestamp updateTime;
    private Integer acceptEntId;
    private Integer acceptUserId;
    private Timestamp acceptTime;
    private Timestamp completeTime;
    private String exeDescription;
    private Integer completeUserId;
    private String pubEntName;
    private String pubRealName;
    private String acceptEntName;
    private String acceptRealName;
    private String completeEntName;
    private String completeRealName;
    private Integer updateUserId;
    private String pubPhoto;
    private String completePhoto;
    private String pubAddress;
    private Integer evaluationId;
    private Integer deviceId;
    private Integer isAppoint;
    private Integer appointUserId;
    private Timestamp appointTime;
    private String appointRealName;
    private String appointEntName;
    private String appointDescription;
    private Integer isAppointEnt;
    private Integer appointEntUserId;
    private Timestamp appointEntTime;
    private String appointEntRealName;
    private String appointEntEntName;
    private String appointEntDescription;
    private Integer replyUserId;
    private Timestamp replyTime;
    private String replyRealName;
    private String replyEntName;
    private String replyDescription;
    private Integer replyEntId;
    private String deviceName;
    private Integer appointEntAreaId;
    private String appointEntAreaName;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SerialNum")
    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    @Basic
    @Column(name = "AreaID")
    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "AreaName")
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "RepairType")
    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
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
    @Column(name = "IsDeleted")
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "UpdateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "AcceptEntID")
    public Integer getAcceptEntId() {
        return acceptEntId;
    }

    public void setAcceptEntId(Integer acceptEntId) {
        this.acceptEntId = acceptEntId;
    }

    @Basic
    @Column(name = "AcceptUserID")
    public Integer getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(Integer acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    @Basic
    @Column(name = "AcceptTime")
    public Timestamp getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Timestamp acceptTime) {
        this.acceptTime = acceptTime;
    }

    @Basic
    @Column(name = "CompleteTime")
    public Timestamp getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Timestamp completeTime) {
        this.completeTime = completeTime;
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
    @Column(name = "CompleteUserID")
    public Integer getCompleteUserId() {
        return completeUserId;
    }

    public void setCompleteUserId(Integer completeUserId) {
        this.completeUserId = completeUserId;
    }

    @Basic
    @Column(name = "PubEntName")
    public String getPubEntName() {
        return pubEntName;
    }

    public void setPubEntName(String pubEntName) {
        this.pubEntName = pubEntName;
    }

    @Basic
    @Column(name = "PubRealName")
    public String getPubRealName() {
        return pubRealName;
    }

    public void setPubRealName(String pubRealName) {
        this.pubRealName = pubRealName;
    }

    @Basic
    @Column(name = "AcceptEntName")
    public String getAcceptEntName() {
        return acceptEntName;
    }

    public void setAcceptEntName(String acceptEntName) {
        this.acceptEntName = acceptEntName;
    }

    @Basic
    @Column(name = "AcceptRealName")
    public String getAcceptRealName() {
        return acceptRealName;
    }

    public void setAcceptRealName(String acceptRealName) {
        this.acceptRealName = acceptRealName;
    }

    @Basic
    @Column(name = "CompleteEntName")
    public String getCompleteEntName() {
        return completeEntName;
    }

    public void setCompleteEntName(String completeEntName) {
        this.completeEntName = completeEntName;
    }

    @Basic
    @Column(name = "CompleteRealName")
    public String getCompleteRealName() {
        return completeRealName;
    }

    public void setCompleteRealName(String completeRealName) {
        this.completeRealName = completeRealName;
    }

    @Basic
    @Column(name = "UpdateUserID")
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Basic
    @Column(name = "PubPhoto")
    public String getPubPhoto() {
        return pubPhoto;
    }

    public void setPubPhoto(String pubPhoto) {
        this.pubPhoto = pubPhoto;
    }

    @Basic
    @Column(name = "CompletePhoto")
    public String getCompletePhoto() {
        return completePhoto;
    }

    public void setCompletePhoto(String completePhoto) {
        this.completePhoto = completePhoto;
    }

    @Basic
    @Column(name = "PubAddress")
    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }

    @Basic
    @Column(name = "EvaluationID")
    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    @Basic
    @Column(name = "DeviceID")
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "IsAppoint")
    public Integer getIsAppoint() {
        return isAppoint;
    }

    public void setIsAppoint(Integer isAppoint) {
        this.isAppoint = isAppoint;
    }

    @Basic
    @Column(name = "AppointUserID")
    public Integer getAppointUserId() {
        return appointUserId;
    }

    public void setAppointUserId(Integer appointUserId) {
        this.appointUserId = appointUserId;
    }

    @Basic
    @Column(name = "AppointTime")
    public Timestamp getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Timestamp appointTime) {
        this.appointTime = appointTime;
    }

    @Basic
    @Column(name = "AppointRealName")
    public String getAppointRealName() {
        return appointRealName;
    }

    public void setAppointRealName(String appointRealName) {
        this.appointRealName = appointRealName;
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
    @Column(name = "AppointDescription")
    public String getAppointDescription() {
        return appointDescription;
    }

    public void setAppointDescription(String appointDescription) {
        this.appointDescription = appointDescription;
    }

    @Basic
    @Column(name = "IsAppointEnt")
    public Integer getIsAppointEnt() {
        return isAppointEnt;
    }

    public void setIsAppointEnt(Integer isAppointEnt) {
        this.isAppointEnt = isAppointEnt;
    }

    @Basic
    @Column(name = "AppointEntUserID")
    public Integer getAppointEntUserId() {
        return appointEntUserId;
    }

    public void setAppointEntUserId(Integer appointEntUserId) {
        this.appointEntUserId = appointEntUserId;
    }

    @Basic
    @Column(name = "AppointEntTime")
    public Timestamp getAppointEntTime() {
        return appointEntTime;
    }

    public void setAppointEntTime(Timestamp appointEntTime) {
        this.appointEntTime = appointEntTime;
    }

    @Basic
    @Column(name = "AppointEntRealName")
    public String getAppointEntRealName() {
        return appointEntRealName;
    }

    public void setAppointEntRealName(String appointEntRealName) {
        this.appointEntRealName = appointEntRealName;
    }

    @Basic
    @Column(name = "AppointEntEntName")
    public String getAppointEntEntName() {
        return appointEntEntName;
    }

    public void setAppointEntEntName(String appointEntEntName) {
        this.appointEntEntName = appointEntEntName;
    }

    @Basic
    @Column(name = "AppointEntDescription")
    public String getAppointEntDescription() {
        return appointEntDescription;
    }

    public void setAppointEntDescription(String appointEntDescription) {
        this.appointEntDescription = appointEntDescription;
    }

    @Basic
    @Column(name = "ReplyUserID")
    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    @Basic
    @Column(name = "ReplyTime")
    public Timestamp getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Timestamp replyTime) {
        this.replyTime = replyTime;
    }

    @Basic
    @Column(name = "ReplyRealName")
    public String getReplyRealName() {
        return replyRealName;
    }

    public void setReplyRealName(String replyRealName) {
        this.replyRealName = replyRealName;
    }

    @Basic
    @Column(name = "ReplyEntName")
    public String getReplyEntName() {
        return replyEntName;
    }

    public void setReplyEntName(String replyEntName) {
        this.replyEntName = replyEntName;
    }

    @Basic
    @Column(name = "ReplyDescription")
    public String getReplyDescription() {
        return replyDescription;
    }

    public void setReplyDescription(String replyDescription) {
        this.replyDescription = replyDescription;
    }

    @Basic
    @Column(name = "ReplyEntID")
    public Integer getReplyEntId() {
        return replyEntId;
    }

    public void setReplyEntId(Integer replyEntId) {
        this.replyEntId = replyEntId;
    }

    @Basic
    @Column(name = "DeviceName")
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Basic
    @Column(name = "AppointEntAreaID")
    public Integer getAppointEntAreaId() {
        return appointEntAreaId;
    }

    public void setAppointEntAreaId(Integer appointEntAreaId) {
        this.appointEntAreaId = appointEntAreaId;
    }

    @Basic
    @Column(name = "AppointEntAreaName")
    public String getAppointEntAreaName() {
        return appointEntAreaName;
    }

    public void setAppointEntAreaName(String appointEntAreaName) {
        this.appointEntAreaName = appointEntAreaName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RpFeedbackEntity that = (RpFeedbackEntity) o;

        if (id != that.id) return false;
        if (serialNum != null ? !serialNum.equals(that.serialNum) : that.serialNum != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;
        if (repairType != null ? !repairType.equals(that.repairType) : that.repairType != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (pubLat != null ? !pubLat.equals(that.pubLat) : that.pubLat != null) return false;
        if (pubLon != null ? !pubLon.equals(that.pubLon) : that.pubLon != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (acceptEntId != null ? !acceptEntId.equals(that.acceptEntId) : that.acceptEntId != null) return false;
        if (acceptUserId != null ? !acceptUserId.equals(that.acceptUserId) : that.acceptUserId != null) return false;
        if (acceptTime != null ? !acceptTime.equals(that.acceptTime) : that.acceptTime != null) return false;
        if (completeTime != null ? !completeTime.equals(that.completeTime) : that.completeTime != null) return false;
        if (exeDescription != null ? !exeDescription.equals(that.exeDescription) : that.exeDescription != null)
            return false;
        if (completeUserId != null ? !completeUserId.equals(that.completeUserId) : that.completeUserId != null)
            return false;
        if (pubEntName != null ? !pubEntName.equals(that.pubEntName) : that.pubEntName != null) return false;
        if (pubRealName != null ? !pubRealName.equals(that.pubRealName) : that.pubRealName != null) return false;
        if (acceptEntName != null ? !acceptEntName.equals(that.acceptEntName) : that.acceptEntName != null)
            return false;
        if (acceptRealName != null ? !acceptRealName.equals(that.acceptRealName) : that.acceptRealName != null)
            return false;
        if (completeEntName != null ? !completeEntName.equals(that.completeEntName) : that.completeEntName != null)
            return false;
        if (completeRealName != null ? !completeRealName.equals(that.completeRealName) : that.completeRealName != null)
            return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (pubPhoto != null ? !pubPhoto.equals(that.pubPhoto) : that.pubPhoto != null) return false;
        if (completePhoto != null ? !completePhoto.equals(that.completePhoto) : that.completePhoto != null)
            return false;
        if (pubAddress != null ? !pubAddress.equals(that.pubAddress) : that.pubAddress != null) return false;
        if (evaluationId != null ? !evaluationId.equals(that.evaluationId) : that.evaluationId != null) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (isAppoint != null ? !isAppoint.equals(that.isAppoint) : that.isAppoint != null) return false;
        if (appointUserId != null ? !appointUserId.equals(that.appointUserId) : that.appointUserId != null)
            return false;
        if (appointTime != null ? !appointTime.equals(that.appointTime) : that.appointTime != null) return false;
        if (appointRealName != null ? !appointRealName.equals(that.appointRealName) : that.appointRealName != null)
            return false;
        if (appointEntName != null ? !appointEntName.equals(that.appointEntName) : that.appointEntName != null)
            return false;
        if (appointDescription != null ? !appointDescription.equals(that.appointDescription) : that.appointDescription != null)
            return false;
        if (isAppointEnt != null ? !isAppointEnt.equals(that.isAppointEnt) : that.isAppointEnt != null) return false;
        if (appointEntUserId != null ? !appointEntUserId.equals(that.appointEntUserId) : that.appointEntUserId != null)
            return false;
        if (appointEntTime != null ? !appointEntTime.equals(that.appointEntTime) : that.appointEntTime != null)
            return false;
        if (appointEntRealName != null ? !appointEntRealName.equals(that.appointEntRealName) : that.appointEntRealName != null)
            return false;
        if (appointEntEntName != null ? !appointEntEntName.equals(that.appointEntEntName) : that.appointEntEntName != null)
            return false;
        if (appointEntDescription != null ? !appointEntDescription.equals(that.appointEntDescription) : that.appointEntDescription != null)
            return false;
        if (replyUserId != null ? !replyUserId.equals(that.replyUserId) : that.replyUserId != null) return false;
        if (replyTime != null ? !replyTime.equals(that.replyTime) : that.replyTime != null) return false;
        if (replyRealName != null ? !replyRealName.equals(that.replyRealName) : that.replyRealName != null)
            return false;
        if (replyEntName != null ? !replyEntName.equals(that.replyEntName) : that.replyEntName != null) return false;
        if (replyDescription != null ? !replyDescription.equals(that.replyDescription) : that.replyDescription != null)
            return false;
        if (replyEntId != null ? !replyEntId.equals(that.replyEntId) : that.replyEntId != null) return false;
        if (deviceName != null ? !deviceName.equals(that.deviceName) : that.deviceName != null) return false;
        if (appointEntAreaId != null ? !appointEntAreaId.equals(that.appointEntAreaId) : that.appointEntAreaId != null)
            return false;
        if (appointEntAreaName != null ? !appointEntAreaName.equals(that.appointEntAreaName) : that.appointEntAreaName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (serialNum != null ? serialNum.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (repairType != null ? repairType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (pubLat != null ? pubLat.hashCode() : 0);
        result = 31 * result + (pubLon != null ? pubLon.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (acceptEntId != null ? acceptEntId.hashCode() : 0);
        result = 31 * result + (acceptUserId != null ? acceptUserId.hashCode() : 0);
        result = 31 * result + (acceptTime != null ? acceptTime.hashCode() : 0);
        result = 31 * result + (completeTime != null ? completeTime.hashCode() : 0);
        result = 31 * result + (exeDescription != null ? exeDescription.hashCode() : 0);
        result = 31 * result + (completeUserId != null ? completeUserId.hashCode() : 0);
        result = 31 * result + (pubEntName != null ? pubEntName.hashCode() : 0);
        result = 31 * result + (pubRealName != null ? pubRealName.hashCode() : 0);
        result = 31 * result + (acceptEntName != null ? acceptEntName.hashCode() : 0);
        result = 31 * result + (acceptRealName != null ? acceptRealName.hashCode() : 0);
        result = 31 * result + (completeEntName != null ? completeEntName.hashCode() : 0);
        result = 31 * result + (completeRealName != null ? completeRealName.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (pubPhoto != null ? pubPhoto.hashCode() : 0);
        result = 31 * result + (completePhoto != null ? completePhoto.hashCode() : 0);
        result = 31 * result + (pubAddress != null ? pubAddress.hashCode() : 0);
        result = 31 * result + (evaluationId != null ? evaluationId.hashCode() : 0);
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (isAppoint != null ? isAppoint.hashCode() : 0);
        result = 31 * result + (appointUserId != null ? appointUserId.hashCode() : 0);
        result = 31 * result + (appointTime != null ? appointTime.hashCode() : 0);
        result = 31 * result + (appointRealName != null ? appointRealName.hashCode() : 0);
        result = 31 * result + (appointEntName != null ? appointEntName.hashCode() : 0);
        result = 31 * result + (appointDescription != null ? appointDescription.hashCode() : 0);
        result = 31 * result + (isAppointEnt != null ? isAppointEnt.hashCode() : 0);
        result = 31 * result + (appointEntUserId != null ? appointEntUserId.hashCode() : 0);
        result = 31 * result + (appointEntTime != null ? appointEntTime.hashCode() : 0);
        result = 31 * result + (appointEntRealName != null ? appointEntRealName.hashCode() : 0);
        result = 31 * result + (appointEntEntName != null ? appointEntEntName.hashCode() : 0);
        result = 31 * result + (appointEntDescription != null ? appointEntDescription.hashCode() : 0);
        result = 31 * result + (replyUserId != null ? replyUserId.hashCode() : 0);
        result = 31 * result + (replyTime != null ? replyTime.hashCode() : 0);
        result = 31 * result + (replyRealName != null ? replyRealName.hashCode() : 0);
        result = 31 * result + (replyEntName != null ? replyEntName.hashCode() : 0);
        result = 31 * result + (replyDescription != null ? replyDescription.hashCode() : 0);
        result = 31 * result + (replyEntId != null ? replyEntId.hashCode() : 0);
        result = 31 * result + (deviceName != null ? deviceName.hashCode() : 0);
        result = 31 * result + (appointEntAreaId != null ? appointEntAreaId.hashCode() : 0);
        result = 31 * result + (appointEntAreaName != null ? appointEntAreaName.hashCode() : 0);
        return result;
    }
}
