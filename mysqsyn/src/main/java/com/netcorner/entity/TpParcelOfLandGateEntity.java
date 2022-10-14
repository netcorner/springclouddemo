package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "tp_parcel_of_land_gate", schema = "testssx", catalog = "")
public class TpParcelOfLandGateEntity {
    private int id;
    private Integer parcelOfLandId;
    private String name;
    private Double lat;
    private Double lon;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ParcelOfLandID")
    public Integer getParcelOfLandId() {
        return parcelOfLandId;
    }

    public void setParcelOfLandId(Integer parcelOfLandId) {
        this.parcelOfLandId = parcelOfLandId;
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
    @Column(name = "Lat")
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "Lon")
    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpParcelOfLandGateEntity that = (TpParcelOfLandGateEntity) o;

        if (id != that.id) return false;
        if (parcelOfLandId != null ? !parcelOfLandId.equals(that.parcelOfLandId) : that.parcelOfLandId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lon != null ? !lon.equals(that.lon) : that.lon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (parcelOfLandId != null ? parcelOfLandId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        return result;
    }
}
