package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "hs_rent_demand", schema = "testssx", catalog = "")
public class HsRentDemandEntity {
    private int id;
    private String serialNum;
    private String country;
    private String province;
    private String city;
    private String district;
    private String township;
    private String address;
    private String neighbourhood;
    private Double addrLat;
    private Double addrLng;
    private Integer distinceRance;
    private String rentWay;
    private String roomInfo;
    private String rentMonth;
    private String rentMoney;
    private String description;
    private Integer status;
    private Integer entId;
    private Integer userId;
    private Timestamp addTime;
    private Integer isDeleted;
    private Timestamp updateTime;
    private Integer updateUserId;
    private String entName;
    private String userName;
    private String userPhoto;
    private Timestamp deletedTime;
    private Integer deletedUserId;
    private String rentWayName;
    private String roomInfoName;
    private String rentMonthName;
    private String rentMoneyName;
    private Integer supplyTotal;

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
    @Column(name = "Neighbourhood")
    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    @Basic
    @Column(name = "AddrLat")
    public Double getAddrLat() {
        return addrLat;
    }

    public void setAddrLat(Double addrLat) {
        this.addrLat = addrLat;
    }

    @Basic
    @Column(name = "AddrLng")
    public Double getAddrLng() {
        return addrLng;
    }

    public void setAddrLng(Double addrLng) {
        this.addrLng = addrLng;
    }

    @Basic
    @Column(name = "DistinceRance")
    public Integer getDistinceRance() {
        return distinceRance;
    }

    public void setDistinceRance(Integer distinceRance) {
        this.distinceRance = distinceRance;
    }

    @Basic
    @Column(name = "RentWay")
    public String getRentWay() {
        return rentWay;
    }

    public void setRentWay(String rentWay) {
        this.rentWay = rentWay;
    }

    @Basic
    @Column(name = "RoomInfo")
    public String getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    @Basic
    @Column(name = "RentMonth")
    public String getRentMonth() {
        return rentMonth;
    }

    public void setRentMonth(String rentMonth) {
        this.rentMonth = rentMonth;
    }

    @Basic
    @Column(name = "RentMoney")
    public String getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(String rentMoney) {
        this.rentMoney = rentMoney;
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
    @Column(name = "UpdateUserID")
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
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
    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
    @Column(name = "DeletedTime")
    public Timestamp getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(Timestamp deletedTime) {
        this.deletedTime = deletedTime;
    }

    @Basic
    @Column(name = "DeletedUserID")
    public Integer getDeletedUserId() {
        return deletedUserId;
    }

    public void setDeletedUserId(Integer deletedUserId) {
        this.deletedUserId = deletedUserId;
    }

    @Basic
    @Column(name = "RentWayName")
    public String getRentWayName() {
        return rentWayName;
    }

    public void setRentWayName(String rentWayName) {
        this.rentWayName = rentWayName;
    }

    @Basic
    @Column(name = "RoomInfoName")
    public String getRoomInfoName() {
        return roomInfoName;
    }

    public void setRoomInfoName(String roomInfoName) {
        this.roomInfoName = roomInfoName;
    }

    @Basic
    @Column(name = "RentMonthName")
    public String getRentMonthName() {
        return rentMonthName;
    }

    public void setRentMonthName(String rentMonthName) {
        this.rentMonthName = rentMonthName;
    }

    @Basic
    @Column(name = "RentMoneyName")
    public String getRentMoneyName() {
        return rentMoneyName;
    }

    public void setRentMoneyName(String rentMoneyName) {
        this.rentMoneyName = rentMoneyName;
    }

    @Basic
    @Column(name = "SupplyTotal")
    public Integer getSupplyTotal() {
        return supplyTotal;
    }

    public void setSupplyTotal(Integer supplyTotal) {
        this.supplyTotal = supplyTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HsRentDemandEntity that = (HsRentDemandEntity) o;

        if (id != that.id) return false;
        if (serialNum != null ? !serialNum.equals(that.serialNum) : that.serialNum != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (township != null ? !township.equals(that.township) : that.township != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (neighbourhood != null ? !neighbourhood.equals(that.neighbourhood) : that.neighbourhood != null)
            return false;
        if (addrLat != null ? !addrLat.equals(that.addrLat) : that.addrLat != null) return false;
        if (addrLng != null ? !addrLng.equals(that.addrLng) : that.addrLng != null) return false;
        if (distinceRance != null ? !distinceRance.equals(that.distinceRance) : that.distinceRance != null)
            return false;
        if (rentWay != null ? !rentWay.equals(that.rentWay) : that.rentWay != null) return false;
        if (roomInfo != null ? !roomInfo.equals(that.roomInfo) : that.roomInfo != null) return false;
        if (rentMonth != null ? !rentMonth.equals(that.rentMonth) : that.rentMonth != null) return false;
        if (rentMoney != null ? !rentMoney.equals(that.rentMoney) : that.rentMoney != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPhoto != null ? !userPhoto.equals(that.userPhoto) : that.userPhoto != null) return false;
        if (deletedTime != null ? !deletedTime.equals(that.deletedTime) : that.deletedTime != null) return false;
        if (deletedUserId != null ? !deletedUserId.equals(that.deletedUserId) : that.deletedUserId != null)
            return false;
        if (rentWayName != null ? !rentWayName.equals(that.rentWayName) : that.rentWayName != null) return false;
        if (roomInfoName != null ? !roomInfoName.equals(that.roomInfoName) : that.roomInfoName != null) return false;
        if (rentMonthName != null ? !rentMonthName.equals(that.rentMonthName) : that.rentMonthName != null)
            return false;
        if (rentMoneyName != null ? !rentMoneyName.equals(that.rentMoneyName) : that.rentMoneyName != null)
            return false;
        if (supplyTotal != null ? !supplyTotal.equals(that.supplyTotal) : that.supplyTotal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (serialNum != null ? serialNum.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (township != null ? township.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (neighbourhood != null ? neighbourhood.hashCode() : 0);
        result = 31 * result + (addrLat != null ? addrLat.hashCode() : 0);
        result = 31 * result + (addrLng != null ? addrLng.hashCode() : 0);
        result = 31 * result + (distinceRance != null ? distinceRance.hashCode() : 0);
        result = 31 * result + (rentWay != null ? rentWay.hashCode() : 0);
        result = 31 * result + (roomInfo != null ? roomInfo.hashCode() : 0);
        result = 31 * result + (rentMonth != null ? rentMonth.hashCode() : 0);
        result = 31 * result + (rentMoney != null ? rentMoney.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPhoto != null ? userPhoto.hashCode() : 0);
        result = 31 * result + (deletedTime != null ? deletedTime.hashCode() : 0);
        result = 31 * result + (deletedUserId != null ? deletedUserId.hashCode() : 0);
        result = 31 * result + (rentWayName != null ? rentWayName.hashCode() : 0);
        result = 31 * result + (roomInfoName != null ? roomInfoName.hashCode() : 0);
        result = 31 * result + (rentMonthName != null ? rentMonthName.hashCode() : 0);
        result = 31 * result + (rentMoneyName != null ? rentMoneyName.hashCode() : 0);
        result = 31 * result + (supplyTotal != null ? supplyTotal.hashCode() : 0);
        return result;
    }
}
