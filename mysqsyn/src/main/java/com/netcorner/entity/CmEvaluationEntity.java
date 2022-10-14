package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_evaluation", schema = "testssx", catalog = "")
public class CmEvaluationEntity {
    private int id;
    private String type;
    private Integer grade;
    private String description;
    private String tagList;
    private Timestamp addTime;
    private Timestamp updateTime;
    private String serviceId;
    private Integer isDeleted;
    private Integer targetId;
    private Integer targetEntId;
    private String targetUserRealName;
    private String targetUserPhoto;
    private Integer evaluationUserId;
    private String evaluationUserRealName;
    private String evaluationUserPhoto;
    private Integer evaluationEntId;

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
    @Column(name = "Grade")
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
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
    @Column(name = "TagList")
    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
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
    @Column(name = "ServiceID")
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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
    @Column(name = "TargetID")
    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    @Basic
    @Column(name = "TargetEntID")
    public Integer getTargetEntId() {
        return targetEntId;
    }

    public void setTargetEntId(Integer targetEntId) {
        this.targetEntId = targetEntId;
    }

    @Basic
    @Column(name = "TargetUserRealName")
    public String getTargetUserRealName() {
        return targetUserRealName;
    }

    public void setTargetUserRealName(String targetUserRealName) {
        this.targetUserRealName = targetUserRealName;
    }

    @Basic
    @Column(name = "TargetUserPhoto")
    public String getTargetUserPhoto() {
        return targetUserPhoto;
    }

    public void setTargetUserPhoto(String targetUserPhoto) {
        this.targetUserPhoto = targetUserPhoto;
    }

    @Basic
    @Column(name = "EvaluationUserID")
    public Integer getEvaluationUserId() {
        return evaluationUserId;
    }

    public void setEvaluationUserId(Integer evaluationUserId) {
        this.evaluationUserId = evaluationUserId;
    }

    @Basic
    @Column(name = "EvaluationUserRealName")
    public String getEvaluationUserRealName() {
        return evaluationUserRealName;
    }

    public void setEvaluationUserRealName(String evaluationUserRealName) {
        this.evaluationUserRealName = evaluationUserRealName;
    }

    @Basic
    @Column(name = "EvaluationUserPhoto")
    public String getEvaluationUserPhoto() {
        return evaluationUserPhoto;
    }

    public void setEvaluationUserPhoto(String evaluationUserPhoto) {
        this.evaluationUserPhoto = evaluationUserPhoto;
    }

    @Basic
    @Column(name = "EvaluationEntID")
    public Integer getEvaluationEntId() {
        return evaluationEntId;
    }

    public void setEvaluationEntId(Integer evaluationEntId) {
        this.evaluationEntId = evaluationEntId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmEvaluationEntity that = (CmEvaluationEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (tagList != null ? !tagList.equals(that.tagList) : that.tagList != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (serviceId != null ? !serviceId.equals(that.serviceId) : that.serviceId != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (targetId != null ? !targetId.equals(that.targetId) : that.targetId != null) return false;
        if (targetEntId != null ? !targetEntId.equals(that.targetEntId) : that.targetEntId != null) return false;
        if (targetUserRealName != null ? !targetUserRealName.equals(that.targetUserRealName) : that.targetUserRealName != null)
            return false;
        if (targetUserPhoto != null ? !targetUserPhoto.equals(that.targetUserPhoto) : that.targetUserPhoto != null)
            return false;
        if (evaluationUserId != null ? !evaluationUserId.equals(that.evaluationUserId) : that.evaluationUserId != null)
            return false;
        if (evaluationUserRealName != null ? !evaluationUserRealName.equals(that.evaluationUserRealName) : that.evaluationUserRealName != null)
            return false;
        if (evaluationUserPhoto != null ? !evaluationUserPhoto.equals(that.evaluationUserPhoto) : that.evaluationUserPhoto != null)
            return false;
        if (evaluationEntId != null ? !evaluationEntId.equals(that.evaluationEntId) : that.evaluationEntId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (tagList != null ? tagList.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (serviceId != null ? serviceId.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (targetId != null ? targetId.hashCode() : 0);
        result = 31 * result + (targetEntId != null ? targetEntId.hashCode() : 0);
        result = 31 * result + (targetUserRealName != null ? targetUserRealName.hashCode() : 0);
        result = 31 * result + (targetUserPhoto != null ? targetUserPhoto.hashCode() : 0);
        result = 31 * result + (evaluationUserId != null ? evaluationUserId.hashCode() : 0);
        result = 31 * result + (evaluationUserRealName != null ? evaluationUserRealName.hashCode() : 0);
        result = 31 * result + (evaluationUserPhoto != null ? evaluationUserPhoto.hashCode() : 0);
        result = 31 * result + (evaluationEntId != null ? evaluationEntId.hashCode() : 0);
        return result;
    }
}
