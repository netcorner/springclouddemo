package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_app_market_portal", schema = "testssx", catalog = "")
public class SysAppMarketPortalEntity {
    private int id;
    private Integer marketAppId;
    private String key;
    private String url;
    private String name;
    private Integer isReg;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MarketAppID")
    public Integer getMarketAppId() {
        return marketAppId;
    }

    public void setMarketAppId(Integer marketAppId) {
        this.marketAppId = marketAppId;
    }

    @Basic
    @Column(name = "Key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "Url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @Column(name = "IsReg")
    public Integer getIsReg() {
        return isReg;
    }

    public void setIsReg(Integer isReg) {
        this.isReg = isReg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysAppMarketPortalEntity that = (SysAppMarketPortalEntity) o;

        if (id != that.id) return false;
        if (marketAppId != null ? !marketAppId.equals(that.marketAppId) : that.marketAppId != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (isReg != null ? !isReg.equals(that.isReg) : that.isReg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (marketAppId != null ? marketAppId.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isReg != null ? isReg.hashCode() : 0);
        return result;
    }
}
