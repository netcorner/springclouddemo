package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_device", schema = "testssx", catalog = "")
public class CmDeviceEntity {
    private int id;
    private Integer entId;
    private String deviceType;
    private String brand;
    private String model;
    private String productiveTime;
    private String description;
    private String sn;
    private String ip;
    private Integer status;
    private Integer userId;
    private Timestamp addTime;
    private Timestamp updateTime;
    private Integer updateUserId;
    private String userAndLocation;
    private Double lat;
    private Double lng;
    private String addUserRealName;
    private String addUserPhoto;
    private String entName;
    private Integer areaId;
    private String areaName;
    private String deviceTypeName;
    private String photo;
    private String updateUserRealName;
    private String updateUserPhoto;
    private String item;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "DeviceType")
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Basic
    @Column(name = "Brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "Model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "ProductiveTime")
    public String getProductiveTime() {
        return productiveTime;
    }

    public void setProductiveTime(String productiveTime) {
        this.productiveTime = productiveTime;
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
    @Column(name = "SN")
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Basic
    @Column(name = "IP")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
    @Column(name = "UpdateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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
    @Column(name = "UserAndLocation")
    public String getUserAndLocation() {
        return userAndLocation;
    }

    public void setUserAndLocation(String userAndLocation) {
        this.userAndLocation = userAndLocation;
    }

    @Basic
    @Column(name = "Lat")
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "Lng")
    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Basic
    @Column(name = "AddUserRealName")
    public String getAddUserRealName() {
        return addUserRealName;
    }

    public void setAddUserRealName(String addUserRealName) {
        this.addUserRealName = addUserRealName;
    }

    @Basic
    @Column(name = "AddUserPhoto")
    public String getAddUserPhoto() {
        return addUserPhoto;
    }

    public void setAddUserPhoto(String addUserPhoto) {
        this.addUserPhoto = addUserPhoto;
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
    @Column(name = "DeviceTypeName")
    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
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
    @Column(name = "UpdateUserRealName")
    public String getUpdateUserRealName() {
        return updateUserRealName;
    }

    public void setUpdateUserRealName(String updateUserRealName) {
        this.updateUserRealName = updateUserRealName;
    }

    @Basic
    @Column(name = "UpdateUserPhoto")
    public String getUpdateUserPhoto() {
        return updateUserPhoto;
    }

    public void setUpdateUserPhoto(String updateUserPhoto) {
        this.updateUserPhoto = updateUserPhoto;
    }

    @Basic
    @Column(name = "Item")
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmDeviceEntity that = (CmDeviceEntity) o;

        if (id != that.id) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (deviceType != null ? !deviceType.equals(that.deviceType) : that.deviceType != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (productiveTime != null ? !productiveTime.equals(that.productiveTime) : that.productiveTime != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (sn != null ? !sn.equals(that.sn) : that.sn != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (userAndLocation != null ? !userAndLocation.equals(that.userAndLocation) : that.userAndLocation != null)
            return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lng != null ? !lng.equals(that.lng) : that.lng != null) return false;
        if (addUserRealName != null ? !addUserRealName.equals(that.addUserRealName) : that.addUserRealName != null)
            return false;
        if (addUserPhoto != null ? !addUserPhoto.equals(that.addUserPhoto) : that.addUserPhoto != null) return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;
        if (deviceTypeName != null ? !deviceTypeName.equals(that.deviceTypeName) : that.deviceTypeName != null)
            return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (updateUserRealName != null ? !updateUserRealName.equals(that.updateUserRealName) : that.updateUserRealName != null)
            return false;
        if (updateUserPhoto != null ? !updateUserPhoto.equals(that.updateUserPhoto) : that.updateUserPhoto != null)
            return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (deviceType != null ? deviceType.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (productiveTime != null ? productiveTime.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (sn != null ? sn.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (userAndLocation != null ? userAndLocation.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lng != null ? lng.hashCode() : 0);
        result = 31 * result + (addUserRealName != null ? addUserRealName.hashCode() : 0);
        result = 31 * result + (addUserPhoto != null ? addUserPhoto.hashCode() : 0);
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (deviceTypeName != null ? deviceTypeName.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (updateUserRealName != null ? updateUserRealName.hashCode() : 0);
        result = 31 * result + (updateUserPhoto != null ? updateUserPhoto.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        return result;
    }
}
