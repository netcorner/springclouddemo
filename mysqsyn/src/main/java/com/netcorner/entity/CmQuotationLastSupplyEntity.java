package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_quotation_last_supply", schema = "testssx", catalog = "")
public class CmQuotationLastSupplyEntity {
    private int id;
    private String type;
    private Integer itemUserId;
    private Integer quotationUserId;
    private Integer itemId;
    private Integer lastQuotationItemId;
    private Timestamp lastQuotationTime;
    private Integer maxStatus;

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
    @Column(name = "ItemUserID")
    public Integer getItemUserId() {
        return itemUserId;
    }

    public void setItemUserId(Integer itemUserId) {
        this.itemUserId = itemUserId;
    }

    @Basic
    @Column(name = "QuotationUserID")
    public Integer getQuotationUserId() {
        return quotationUserId;
    }

    public void setQuotationUserId(Integer quotationUserId) {
        this.quotationUserId = quotationUserId;
    }

    @Basic
    @Column(name = "ItemID")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "LastQuotationItemID")
    public Integer getLastQuotationItemId() {
        return lastQuotationItemId;
    }

    public void setLastQuotationItemId(Integer lastQuotationItemId) {
        this.lastQuotationItemId = lastQuotationItemId;
    }

    @Basic
    @Column(name = "LastQuotationTime")
    public Timestamp getLastQuotationTime() {
        return lastQuotationTime;
    }

    public void setLastQuotationTime(Timestamp lastQuotationTime) {
        this.lastQuotationTime = lastQuotationTime;
    }

    @Basic
    @Column(name = "MaxStatus")
    public Integer getMaxStatus() {
        return maxStatus;
    }

    public void setMaxStatus(Integer maxStatus) {
        this.maxStatus = maxStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmQuotationLastSupplyEntity that = (CmQuotationLastSupplyEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (itemUserId != null ? !itemUserId.equals(that.itemUserId) : that.itemUserId != null) return false;
        if (quotationUserId != null ? !quotationUserId.equals(that.quotationUserId) : that.quotationUserId != null)
            return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (lastQuotationItemId != null ? !lastQuotationItemId.equals(that.lastQuotationItemId) : that.lastQuotationItemId != null)
            return false;
        if (lastQuotationTime != null ? !lastQuotationTime.equals(that.lastQuotationTime) : that.lastQuotationTime != null)
            return false;
        if (maxStatus != null ? !maxStatus.equals(that.maxStatus) : that.maxStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (itemUserId != null ? itemUserId.hashCode() : 0);
        result = 31 * result + (quotationUserId != null ? quotationUserId.hashCode() : 0);
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (lastQuotationItemId != null ? lastQuotationItemId.hashCode() : 0);
        result = 31 * result + (lastQuotationTime != null ? lastQuotationTime.hashCode() : 0);
        result = 31 * result + (maxStatus != null ? maxStatus.hashCode() : 0);
        return result;
    }
}
