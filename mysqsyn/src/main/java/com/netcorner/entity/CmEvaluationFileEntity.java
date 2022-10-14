package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_evaluation_file", schema = "testssx", catalog = "")
public class CmEvaluationFileEntity {
    private int id;
    private Integer evaluationId;
    private String file;
    private Integer isGet;
    private Timestamp getTime;
    private Integer userId;
    private String appId;
    private Integer fileType;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "File")
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Basic
    @Column(name = "IsGet")
    public Integer getIsGet() {
        return isGet;
    }

    public void setIsGet(Integer isGet) {
        this.isGet = isGet;
    }

    @Basic
    @Column(name = "GetTime")
    public Timestamp getGetTime() {
        return getTime;
    }

    public void setGetTime(Timestamp getTime) {
        this.getTime = getTime;
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
    @Column(name = "AppID")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "FileType")
    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmEvaluationFileEntity that = (CmEvaluationFileEntity) o;

        if (id != that.id) return false;
        if (evaluationId != null ? !evaluationId.equals(that.evaluationId) : that.evaluationId != null) return false;
        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (isGet != null ? !isGet.equals(that.isGet) : that.isGet != null) return false;
        if (getTime != null ? !getTime.equals(that.getTime) : that.getTime != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (fileType != null ? !fileType.equals(that.fileType) : that.fileType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (evaluationId != null ? evaluationId.hashCode() : 0);
        result = 31 * result + (file != null ? file.hashCode() : 0);
        result = 31 * result + (isGet != null ? isGet.hashCode() : 0);
        result = 31 * result + (getTime != null ? getTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (fileType != null ? fileType.hashCode() : 0);
        return result;
    }
}
