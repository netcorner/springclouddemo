package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_file", schema = "testssx", catalog = "")
public class SysFileEntity {
    private int id;
    private Integer userId;
    private Long bytes;
    private String formatLength;
    private Integer hits;
    private String fileType;
    private Timestamp addTime;
    private String upPath;
    private String optUrl;
    private String optParameters;
    private String fileName;

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
    @Column(name = "Bytes")
    public Long getBytes() {
        return bytes;
    }

    public void setBytes(Long bytes) {
        this.bytes = bytes;
    }

    @Basic
    @Column(name = "FormatLength")
    public String getFormatLength() {
        return formatLength;
    }

    public void setFormatLength(String formatLength) {
        this.formatLength = formatLength;
    }

    @Basic
    @Column(name = "Hits")
    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @Basic
    @Column(name = "FileType")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
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
    @Column(name = "UpPath")
    public String getUpPath() {
        return upPath;
    }

    public void setUpPath(String upPath) {
        this.upPath = upPath;
    }

    @Basic
    @Column(name = "OptURL")
    public String getOptUrl() {
        return optUrl;
    }

    public void setOptUrl(String optUrl) {
        this.optUrl = optUrl;
    }

    @Basic
    @Column(name = "OptParameters")
    public String getOptParameters() {
        return optParameters;
    }

    public void setOptParameters(String optParameters) {
        this.optParameters = optParameters;
    }

    @Basic
    @Column(name = "FileName")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysFileEntity that = (SysFileEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (bytes != null ? !bytes.equals(that.bytes) : that.bytes != null) return false;
        if (formatLength != null ? !formatLength.equals(that.formatLength) : that.formatLength != null) return false;
        if (hits != null ? !hits.equals(that.hits) : that.hits != null) return false;
        if (fileType != null ? !fileType.equals(that.fileType) : that.fileType != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (upPath != null ? !upPath.equals(that.upPath) : that.upPath != null) return false;
        if (optUrl != null ? !optUrl.equals(that.optUrl) : that.optUrl != null) return false;
        if (optParameters != null ? !optParameters.equals(that.optParameters) : that.optParameters != null)
            return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (bytes != null ? bytes.hashCode() : 0);
        result = 31 * result + (formatLength != null ? formatLength.hashCode() : 0);
        result = 31 * result + (hits != null ? hits.hashCode() : 0);
        result = 31 * result + (fileType != null ? fileType.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (upPath != null ? upPath.hashCode() : 0);
        result = 31 * result + (optUrl != null ? optUrl.hashCode() : 0);
        result = 31 * result + (optParameters != null ? optParameters.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        return result;
    }
}
