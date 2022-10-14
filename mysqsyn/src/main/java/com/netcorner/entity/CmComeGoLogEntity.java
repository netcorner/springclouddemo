package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_come_go_log", schema = "testssx", catalog = "")
public class CmComeGoLogEntity {
    private int id;
    private Integer userId;
    private String name;
    private Integer entId;
    private String entName;
    private Timestamp getPassportTime;
    private Double getLat;
    private Double getLon;
    private String country;
    private String province;
    private String city;
    private String district;
    private String township;
    private String address;
    private Integer status;
    private Integer bookingType;
    private String bookingTypeName;
    private String targetLocation;
    private String description;
    private String photo;
    private String mobile;
    private String openId;
    private String appId;
    private String unionId;
    private Integer type;
    private String temperature;

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
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "EntName")
    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    @Basic
    @Column(name = "GetPassportTime")
    public Timestamp getGetPassportTime() {
        return getPassportTime;
    }

    public void setGetPassportTime(Timestamp getPassportTime) {
        this.getPassportTime = getPassportTime;
    }

    @Basic
    @Column(name = "GetLat")
    public Double getGetLat() {
        return getLat;
    }

    public void setGetLat(Double getLat) {
        this.getLat = getLat;
    }

    @Basic
    @Column(name = "GetLon")
    public Double getGetLon() {
        return getLon;
    }

    public void setGetLon(Double getLon) {
        this.getLon = getLon;
    }

    @Basic
    @Column(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "Province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "District")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "Township")
    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    @Column(name = "BookingType")
    public Integer getBookingType() {
        return bookingType;
    }

    public void setBookingType(Integer bookingType) {
        this.bookingType = bookingType;
    }

    @Basic
    @Column(name = "BookingTypeName")
    public String getBookingTypeName() {
        return bookingTypeName;
    }

    public void setBookingTypeName(String bookingTypeName) {
        this.bookingTypeName = bookingTypeName;
    }

    @Basic
    @Column(name = "TargetLocation")
    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
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
    @Column(name = "Photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "Mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "OpenID")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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
    @Column(name = "UnionID")
    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
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
    @Column(name = "Temperature")
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmComeGoLogEntity that = (CmComeGoLogEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (getPassportTime != null ? !getPassportTime.equals(that.getPassportTime) : that.getPassportTime != null)
            return false;
        if (getLat != null ? !getLat.equals(that.getLat) : that.getLat != null) return false;
        if (getLon != null ? !getLon.equals(that.getLon) : that.getLon != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (township != null ? !township.equals(that.township) : that.township != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (bookingType != null ? !bookingType.equals(that.bookingType) : that.bookingType != null) return false;
        if (bookingTypeName != null ? !bookingTypeName.equals(that.bookingTypeName) : that.bookingTypeName != null)
            return false;
        if (targetLocation != null ? !targetLocation.equals(that.targetLocation) : that.targetLocation != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (openId != null ? !openId.equals(that.openId) : that.openId != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (unionId != null ? !unionId.equals(that.unionId) : that.unionId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (getPassportTime != null ? getPassportTime.hashCode() : 0);
        result = 31 * result + (getLat != null ? getLat.hashCode() : 0);
        result = 31 * result + (getLon != null ? getLon.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (township != null ? township.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (bookingType != null ? bookingType.hashCode() : 0);
        result = 31 * result + (bookingTypeName != null ? bookingTypeName.hashCode() : 0);
        result = 31 * result + (targetLocation != null ? targetLocation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (openId != null ? openId.hashCode() : 0);
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (unionId != null ? unionId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        return result;
    }
}
