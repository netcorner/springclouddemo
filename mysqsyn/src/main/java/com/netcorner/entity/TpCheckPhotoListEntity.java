package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "tp_check_photo_list", schema = "testssx", catalog = "")
public class TpCheckPhotoListEntity {
    private int id;
    private Integer checkedPhotoInfoId;
    private String photoUrl;
    private Integer isChecked;
    private String checkedInfo;
    private Integer type;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CheckedPhotoInfoID")
    public Integer getCheckedPhotoInfoId() {
        return checkedPhotoInfoId;
    }

    public void setCheckedPhotoInfoId(Integer checkedPhotoInfoId) {
        this.checkedPhotoInfoId = checkedPhotoInfoId;
    }

    @Basic
    @Column(name = "PhotoUrl")
    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Basic
    @Column(name = "IsChecked")
    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    @Basic
    @Column(name = "CheckedInfo")
    public String getCheckedInfo() {
        return checkedInfo;
    }

    public void setCheckedInfo(String checkedInfo) {
        this.checkedInfo = checkedInfo;
    }

    @Basic
    @Column(name = "Type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpCheckPhotoListEntity that = (TpCheckPhotoListEntity) o;

        if (id != that.id) return false;
        if (checkedPhotoInfoId != null ? !checkedPhotoInfoId.equals(that.checkedPhotoInfoId) : that.checkedPhotoInfoId != null)
            return false;
        if (photoUrl != null ? !photoUrl.equals(that.photoUrl) : that.photoUrl != null) return false;
        if (isChecked != null ? !isChecked.equals(that.isChecked) : that.isChecked != null) return false;
        if (checkedInfo != null ? !checkedInfo.equals(that.checkedInfo) : that.checkedInfo != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (checkedPhotoInfoId != null ? checkedPhotoInfoId.hashCode() : 0);
        result = 31 * result + (photoUrl != null ? photoUrl.hashCode() : 0);
        result = 31 * result + (isChecked != null ? isChecked.hashCode() : 0);
        result = 31 * result + (checkedInfo != null ? checkedInfo.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
