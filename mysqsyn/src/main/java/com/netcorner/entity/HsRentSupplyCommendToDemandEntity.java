package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "hs_rent_supply_commend_to_demand", schema = "testssx", catalog = "")
public class HsRentSupplyCommendToDemandEntity {
    private int id;
    private String type;
    private Integer demandId;
    private Integer supplyId;
    private Timestamp addtime;
    private Integer supplyUserId;
    private Integer supplyEntId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "DemandID")
    public Integer getDemandId() {
        return demandId;
    }

    public void setDemandId(Integer demandId) {
        this.demandId = demandId;
    }

    @Basic
    @Column(name = "SupplyID")
    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    @Basic
    @Column(name = "Addtime")
    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }

    @Basic
    @Column(name = "SupplyUserID")
    public Integer getSupplyUserId() {
        return supplyUserId;
    }

    public void setSupplyUserId(Integer supplyUserId) {
        this.supplyUserId = supplyUserId;
    }

    @Basic
    @Column(name = "SupplyEntID")
    public Integer getSupplyEntId() {
        return supplyEntId;
    }

    public void setSupplyEntId(Integer supplyEntId) {
        this.supplyEntId = supplyEntId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HsRentSupplyCommendToDemandEntity that = (HsRentSupplyCommendToDemandEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (demandId != null ? !demandId.equals(that.demandId) : that.demandId != null) return false;
        if (supplyId != null ? !supplyId.equals(that.supplyId) : that.supplyId != null) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;
        if (supplyUserId != null ? !supplyUserId.equals(that.supplyUserId) : that.supplyUserId != null) return false;
        if (supplyEntId != null ? !supplyEntId.equals(that.supplyEntId) : that.supplyEntId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (demandId != null ? demandId.hashCode() : 0);
        result = 31 * result + (supplyId != null ? supplyId.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        result = 31 * result + (supplyUserId != null ? supplyUserId.hashCode() : 0);
        result = 31 * result + (supplyEntId != null ? supplyEntId.hashCode() : 0);
        return result;
    }
}
