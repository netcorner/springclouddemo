package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "hs_enterprise_house", schema = "testssx", catalog = "")
public class HsEnterpriseHouseEntity {
    private int id;
    private String entName;
    private Integer entId;
    private String city;
    private String houseAreas;
    private String idCard;
    private String realName;
    private String liveAddress;
    private String nationality;
    private String realGender;
    private String idCardPhoto;
    private String cardPhoto;
    private Timestamp regTime;
    private Integer isReward;
    private Integer userId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "EntID")
    public Integer getEntId() {
        return entId;
    }

    public void setEntId(Integer entId) {
        this.entId = entId;
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
    @Column(name = "HouseAreas")
    public String getHouseAreas() {
        return houseAreas;
    }

    public void setHouseAreas(String houseAreas) {
        this.houseAreas = houseAreas;
    }

    @Basic
    @Column(name = "IdCard")
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
    @Column(name = "LiveAddress")
    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    @Basic
    @Column(name = "Nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "RealGender")
    public String getRealGender() {
        return realGender;
    }

    public void setRealGender(String realGender) {
        this.realGender = realGender;
    }

    @Basic
    @Column(name = "IdCardPhoto")
    public String getIdCardPhoto() {
        return idCardPhoto;
    }

    public void setIdCardPhoto(String idCardPhoto) {
        this.idCardPhoto = idCardPhoto;
    }

    @Basic
    @Column(name = "CardPhoto")
    public String getCardPhoto() {
        return cardPhoto;
    }

    public void setCardPhoto(String cardPhoto) {
        this.cardPhoto = cardPhoto;
    }

    @Basic
    @Column(name = "RegTime")
    public Timestamp getRegTime() {
        return regTime;
    }

    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    @Basic
    @Column(name = "IsReward")
    public Integer getIsReward() {
        return isReward;
    }

    public void setIsReward(Integer isReward) {
        this.isReward = isReward;
    }

    @Basic
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HsEnterpriseHouseEntity that = (HsEnterpriseHouseEntity) o;

        if (id != that.id) return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (houseAreas != null ? !houseAreas.equals(that.houseAreas) : that.houseAreas != null) return false;
        if (idCard != null ? !idCard.equals(that.idCard) : that.idCard != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (liveAddress != null ? !liveAddress.equals(that.liveAddress) : that.liveAddress != null) return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (realGender != null ? !realGender.equals(that.realGender) : that.realGender != null) return false;
        if (idCardPhoto != null ? !idCardPhoto.equals(that.idCardPhoto) : that.idCardPhoto != null) return false;
        if (cardPhoto != null ? !cardPhoto.equals(that.cardPhoto) : that.cardPhoto != null) return false;
        if (regTime != null ? !regTime.equals(that.regTime) : that.regTime != null) return false;
        if (isReward != null ? !isReward.equals(that.isReward) : that.isReward != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (houseAreas != null ? houseAreas.hashCode() : 0);
        result = 31 * result + (idCard != null ? idCard.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (liveAddress != null ? liveAddress.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (realGender != null ? realGender.hashCode() : 0);
        result = 31 * result + (idCardPhoto != null ? idCardPhoto.hashCode() : 0);
        result = 31 * result + (cardPhoto != null ? cardPhoto.hashCode() : 0);
        result = 31 * result + (regTime != null ? regTime.hashCode() : 0);
        result = 31 * result + (isReward != null ? isReward.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
