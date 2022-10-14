package com.netcorner.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_quotation", schema = "testssx", catalog = "")
public class CmQuotationEntity {
    private int id;
    private String type;
    private Integer itemId;
    private Integer itemUserId;
    private String itemUserName;
    private String itemUserPhoto;
    private String itemEntName;
    private String itemEntLogo;
    private Integer itemDel;
    private Timestamp itemDelTime;
    private Integer itemEvaluation;
    private Integer quotationItemId;
    private Integer quotationUserId;
    private String quotationUserName;
    private String quotationUserPhoto;
    private String quotationEntName;
    private String quotationEntLogo;
    private String quotationWorkCerPath;
    private Timestamp quotationTime;
    private BigDecimal quotationPrice;
    private Integer quotationDel;
    private Timestamp quotationDelTime;
    private Integer quotationEvaluation;
    private Integer status;
    private String remark;
    private Timestamp payTime;
    private String exes;
    private Timestamp updateTime;
    private Timestamp quotationEvaluationTime;

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
    @Column(name = "ItemID")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
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
    @Column(name = "ItemUserName")
    public String getItemUserName() {
        return itemUserName;
    }

    public void setItemUserName(String itemUserName) {
        this.itemUserName = itemUserName;
    }

    @Basic
    @Column(name = "ItemUserPhoto")
    public String getItemUserPhoto() {
        return itemUserPhoto;
    }

    public void setItemUserPhoto(String itemUserPhoto) {
        this.itemUserPhoto = itemUserPhoto;
    }

    @Basic
    @Column(name = "ItemEntName")
    public String getItemEntName() {
        return itemEntName;
    }

    public void setItemEntName(String itemEntName) {
        this.itemEntName = itemEntName;
    }

    @Basic
    @Column(name = "ItemEntLogo")
    public String getItemEntLogo() {
        return itemEntLogo;
    }

    public void setItemEntLogo(String itemEntLogo) {
        this.itemEntLogo = itemEntLogo;
    }

    @Basic
    @Column(name = "ItemDel")
    public Integer getItemDel() {
        return itemDel;
    }

    public void setItemDel(Integer itemDel) {
        this.itemDel = itemDel;
    }

    @Basic
    @Column(name = "ItemDelTime")
    public Timestamp getItemDelTime() {
        return itemDelTime;
    }

    public void setItemDelTime(Timestamp itemDelTime) {
        this.itemDelTime = itemDelTime;
    }

    @Basic
    @Column(name = "ItemEvaluation")
    public Integer getItemEvaluation() {
        return itemEvaluation;
    }

    public void setItemEvaluation(Integer itemEvaluation) {
        this.itemEvaluation = itemEvaluation;
    }

    @Basic
    @Column(name = "QuotationItemID")
    public Integer getQuotationItemId() {
        return quotationItemId;
    }

    public void setQuotationItemId(Integer quotationItemId) {
        this.quotationItemId = quotationItemId;
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
    @Column(name = "QuotationUserName")
    public String getQuotationUserName() {
        return quotationUserName;
    }

    public void setQuotationUserName(String quotationUserName) {
        this.quotationUserName = quotationUserName;
    }

    @Basic
    @Column(name = "QuotationUserPhoto")
    public String getQuotationUserPhoto() {
        return quotationUserPhoto;
    }

    public void setQuotationUserPhoto(String quotationUserPhoto) {
        this.quotationUserPhoto = quotationUserPhoto;
    }

    @Basic
    @Column(name = "QuotationEntName")
    public String getQuotationEntName() {
        return quotationEntName;
    }

    public void setQuotationEntName(String quotationEntName) {
        this.quotationEntName = quotationEntName;
    }

    @Basic
    @Column(name = "QuotationEntLogo")
    public String getQuotationEntLogo() {
        return quotationEntLogo;
    }

    public void setQuotationEntLogo(String quotationEntLogo) {
        this.quotationEntLogo = quotationEntLogo;
    }

    @Basic
    @Column(name = "QuotationWorkCerPath")
    public String getQuotationWorkCerPath() {
        return quotationWorkCerPath;
    }

    public void setQuotationWorkCerPath(String quotationWorkCerPath) {
        this.quotationWorkCerPath = quotationWorkCerPath;
    }

    @Basic
    @Column(name = "QuotationTime")
    public Timestamp getQuotationTime() {
        return quotationTime;
    }

    public void setQuotationTime(Timestamp quotationTime) {
        this.quotationTime = quotationTime;
    }

    @Basic
    @Column(name = "QuotationPrice")
    public BigDecimal getQuotationPrice() {
        return quotationPrice;
    }

    public void setQuotationPrice(BigDecimal quotationPrice) {
        this.quotationPrice = quotationPrice;
    }

    @Basic
    @Column(name = "QuotationDel")
    public Integer getQuotationDel() {
        return quotationDel;
    }

    public void setQuotationDel(Integer quotationDel) {
        this.quotationDel = quotationDel;
    }

    @Basic
    @Column(name = "QuotationDelTime")
    public Timestamp getQuotationDelTime() {
        return quotationDelTime;
    }

    public void setQuotationDelTime(Timestamp quotationDelTime) {
        this.quotationDelTime = quotationDelTime;
    }

    @Basic
    @Column(name = "QuotationEvaluation")
    public Integer getQuotationEvaluation() {
        return quotationEvaluation;
    }

    public void setQuotationEvaluation(Integer quotationEvaluation) {
        this.quotationEvaluation = quotationEvaluation;
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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "PayTime")
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "Exes")
    public String getExes() {
        return exes;
    }

    public void setExes(String exes) {
        this.exes = exes;
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
    @Column(name = "QuotationEvaluationTime")
    public Timestamp getQuotationEvaluationTime() {
        return quotationEvaluationTime;
    }

    public void setQuotationEvaluationTime(Timestamp quotationEvaluationTime) {
        this.quotationEvaluationTime = quotationEvaluationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmQuotationEntity that = (CmQuotationEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (itemUserId != null ? !itemUserId.equals(that.itemUserId) : that.itemUserId != null) return false;
        if (itemUserName != null ? !itemUserName.equals(that.itemUserName) : that.itemUserName != null) return false;
        if (itemUserPhoto != null ? !itemUserPhoto.equals(that.itemUserPhoto) : that.itemUserPhoto != null)
            return false;
        if (itemEntName != null ? !itemEntName.equals(that.itemEntName) : that.itemEntName != null) return false;
        if (itemEntLogo != null ? !itemEntLogo.equals(that.itemEntLogo) : that.itemEntLogo != null) return false;
        if (itemDel != null ? !itemDel.equals(that.itemDel) : that.itemDel != null) return false;
        if (itemDelTime != null ? !itemDelTime.equals(that.itemDelTime) : that.itemDelTime != null) return false;
        if (itemEvaluation != null ? !itemEvaluation.equals(that.itemEvaluation) : that.itemEvaluation != null)
            return false;
        if (quotationItemId != null ? !quotationItemId.equals(that.quotationItemId) : that.quotationItemId != null)
            return false;
        if (quotationUserId != null ? !quotationUserId.equals(that.quotationUserId) : that.quotationUserId != null)
            return false;
        if (quotationUserName != null ? !quotationUserName.equals(that.quotationUserName) : that.quotationUserName != null)
            return false;
        if (quotationUserPhoto != null ? !quotationUserPhoto.equals(that.quotationUserPhoto) : that.quotationUserPhoto != null)
            return false;
        if (quotationEntName != null ? !quotationEntName.equals(that.quotationEntName) : that.quotationEntName != null)
            return false;
        if (quotationEntLogo != null ? !quotationEntLogo.equals(that.quotationEntLogo) : that.quotationEntLogo != null)
            return false;
        if (quotationWorkCerPath != null ? !quotationWorkCerPath.equals(that.quotationWorkCerPath) : that.quotationWorkCerPath != null)
            return false;
        if (quotationTime != null ? !quotationTime.equals(that.quotationTime) : that.quotationTime != null)
            return false;
        if (quotationPrice != null ? !quotationPrice.equals(that.quotationPrice) : that.quotationPrice != null)
            return false;
        if (quotationDel != null ? !quotationDel.equals(that.quotationDel) : that.quotationDel != null) return false;
        if (quotationDelTime != null ? !quotationDelTime.equals(that.quotationDelTime) : that.quotationDelTime != null)
            return false;
        if (quotationEvaluation != null ? !quotationEvaluation.equals(that.quotationEvaluation) : that.quotationEvaluation != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (payTime != null ? !payTime.equals(that.payTime) : that.payTime != null) return false;
        if (exes != null ? !exes.equals(that.exes) : that.exes != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (quotationEvaluationTime != null ? !quotationEvaluationTime.equals(that.quotationEvaluationTime) : that.quotationEvaluationTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (itemUserId != null ? itemUserId.hashCode() : 0);
        result = 31 * result + (itemUserName != null ? itemUserName.hashCode() : 0);
        result = 31 * result + (itemUserPhoto != null ? itemUserPhoto.hashCode() : 0);
        result = 31 * result + (itemEntName != null ? itemEntName.hashCode() : 0);
        result = 31 * result + (itemEntLogo != null ? itemEntLogo.hashCode() : 0);
        result = 31 * result + (itemDel != null ? itemDel.hashCode() : 0);
        result = 31 * result + (itemDelTime != null ? itemDelTime.hashCode() : 0);
        result = 31 * result + (itemEvaluation != null ? itemEvaluation.hashCode() : 0);
        result = 31 * result + (quotationItemId != null ? quotationItemId.hashCode() : 0);
        result = 31 * result + (quotationUserId != null ? quotationUserId.hashCode() : 0);
        result = 31 * result + (quotationUserName != null ? quotationUserName.hashCode() : 0);
        result = 31 * result + (quotationUserPhoto != null ? quotationUserPhoto.hashCode() : 0);
        result = 31 * result + (quotationEntName != null ? quotationEntName.hashCode() : 0);
        result = 31 * result + (quotationEntLogo != null ? quotationEntLogo.hashCode() : 0);
        result = 31 * result + (quotationWorkCerPath != null ? quotationWorkCerPath.hashCode() : 0);
        result = 31 * result + (quotationTime != null ? quotationTime.hashCode() : 0);
        result = 31 * result + (quotationPrice != null ? quotationPrice.hashCode() : 0);
        result = 31 * result + (quotationDel != null ? quotationDel.hashCode() : 0);
        result = 31 * result + (quotationDelTime != null ? quotationDelTime.hashCode() : 0);
        result = 31 * result + (quotationEvaluation != null ? quotationEvaluation.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (payTime != null ? payTime.hashCode() : 0);
        result = 31 * result + (exes != null ? exes.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (quotationEvaluationTime != null ? quotationEvaluationTime.hashCode() : 0);
        return result;
    }
}
