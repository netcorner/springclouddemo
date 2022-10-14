package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "tp_parcel_of_land", schema = "testssx", catalog = "")
public class TpParcelOfLandEntity {
    private int id;
    private String serialNum;
    private Integer areaId;
    private String areaName;
    private String name;
    private String parcelOfLandArea;
    private String parcelOfLandRuleArea;
    private String projectName;
    private Double centerLat;
    private Double centerLon;
    private Integer status;
    private Integer entId;
    private Integer userId;
    private Timestamp addTime;
    private String description;
    private Integer isDeleted;
    private Timestamp updateTime;
    private Timestamp declareTime;
    private Integer inviteTotal;
    private Timestamp lastInviteTime;
    private Integer households;

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
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ParcelOfLandArea")
    public String getParcelOfLandArea() {
        return parcelOfLandArea;
    }

    public void setParcelOfLandArea(String parcelOfLandArea) {
        this.parcelOfLandArea = parcelOfLandArea;
    }

    @Basic
    @Column(name = "ParcelOfLandRuleArea")
    public String getParcelOfLandRuleArea() {
        return parcelOfLandRuleArea;
    }

    public void setParcelOfLandRuleArea(String parcelOfLandRuleArea) {
        this.parcelOfLandRuleArea = parcelOfLandRuleArea;
    }

    @Basic
    @Column(name = "ProjectName")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "CenterLat")
    public Double getCenterLat() {
        return centerLat;
    }

    public void setCenterLat(Double centerLat) {
        this.centerLat = centerLat;
    }

    @Basic
    @Column(name = "CenterLon")
    public Double getCenterLon() {
        return centerLon;
    }

    public void setCenterLon(Double centerLon) {
        this.centerLon = centerLon;
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
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "DeclareTime")
    public Timestamp getDeclareTime() {
        return declareTime;
    }

    public void setDeclareTime(Timestamp declareTime) {
        this.declareTime = declareTime;
    }

    @Basic
    @Column(name = "InviteTotal")
    public Integer getInviteTotal() {
        return inviteTotal;
    }

    public void setInviteTotal(Integer inviteTotal) {
        this.inviteTotal = inviteTotal;
    }

    @Basic
    @Column(name = "LastInviteTime")
    public Timestamp getLastInviteTime() {
        return lastInviteTime;
    }

    public void setLastInviteTime(Timestamp lastInviteTime) {
        this.lastInviteTime = lastInviteTime;
    }

    @Basic
    @Column(name = "Households")
    public Integer getHouseholds() {
        return households;
    }

    public void setHouseholds(Integer households) {
        this.households = households;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpParcelOfLandEntity that = (TpParcelOfLandEntity) o;

        if (id != that.id) return false;
        if (serialNum != null ? !serialNum.equals(that.serialNum) : that.serialNum != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parcelOfLandArea != null ? !parcelOfLandArea.equals(that.parcelOfLandArea) : that.parcelOfLandArea != null)
            return false;
        if (parcelOfLandRuleArea != null ? !parcelOfLandRuleArea.equals(that.parcelOfLandRuleArea) : that.parcelOfLandRuleArea != null)
            return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (centerLat != null ? !centerLat.equals(that.centerLat) : that.centerLat != null) return false;
        if (centerLon != null ? !centerLon.equals(that.centerLon) : that.centerLon != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (declareTime != null ? !declareTime.equals(that.declareTime) : that.declareTime != null) return false;
        if (inviteTotal != null ? !inviteTotal.equals(that.inviteTotal) : that.inviteTotal != null) return false;
        if (lastInviteTime != null ? !lastInviteTime.equals(that.lastInviteTime) : that.lastInviteTime != null)
            return false;
        if (households != null ? !households.equals(that.households) : that.households != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (serialNum != null ? serialNum.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parcelOfLandArea != null ? parcelOfLandArea.hashCode() : 0);
        result = 31 * result + (parcelOfLandRuleArea != null ? parcelOfLandRuleArea.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (centerLat != null ? centerLat.hashCode() : 0);
        result = 31 * result + (centerLon != null ? centerLon.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (declareTime != null ? declareTime.hashCode() : 0);
        result = 31 * result + (inviteTotal != null ? inviteTotal.hashCode() : 0);
        result = 31 * result + (lastInviteTime != null ? lastInviteTime.hashCode() : 0);
        result = 31 * result + (households != null ? households.hashCode() : 0);
        return result;
    }
}
