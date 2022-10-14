package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "tp_parcel_of_land_inviter", schema = "testssx", catalog = "")
public class TpParcelOfLandInviterEntity {
    private int id;
    private String invitedEntName;
    private Integer invitedEntId;
    private String invitedPhone;
    private Integer invitedRoleId;
    private String invitedRoleName;
    private String invitedParcelOfLandId;
    private Integer inviteEntId;
    private String inviteEntName;
    private Timestamp inviteTime;
    private Integer inviteUserId;
    private String description;
    private Integer status;
    private Timestamp invitedAccept;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "InvitedEntName")
    public String getInvitedEntName() {
        return invitedEntName;
    }

    public void setInvitedEntName(String invitedEntName) {
        this.invitedEntName = invitedEntName;
    }

    @Basic
    @Column(name = "InvitedEntID")
    public Integer getInvitedEntId() {
        return invitedEntId;
    }

    public void setInvitedEntId(Integer invitedEntId) {
        this.invitedEntId = invitedEntId;
    }

    @Basic
    @Column(name = "InvitedPhone")
    public String getInvitedPhone() {
        return invitedPhone;
    }

    public void setInvitedPhone(String invitedPhone) {
        this.invitedPhone = invitedPhone;
    }

    @Basic
    @Column(name = "InvitedRoleID")
    public Integer getInvitedRoleId() {
        return invitedRoleId;
    }

    public void setInvitedRoleId(Integer invitedRoleId) {
        this.invitedRoleId = invitedRoleId;
    }

    @Basic
    @Column(name = "InvitedRoleName")
    public String getInvitedRoleName() {
        return invitedRoleName;
    }

    public void setInvitedRoleName(String invitedRoleName) {
        this.invitedRoleName = invitedRoleName;
    }

    @Basic
    @Column(name = "InvitedParcelOfLandID")
    public String getInvitedParcelOfLandId() {
        return invitedParcelOfLandId;
    }

    public void setInvitedParcelOfLandId(String invitedParcelOfLandId) {
        this.invitedParcelOfLandId = invitedParcelOfLandId;
    }

    @Basic
    @Column(name = "InviteEntID")
    public Integer getInviteEntId() {
        return inviteEntId;
    }

    public void setInviteEntId(Integer inviteEntId) {
        this.inviteEntId = inviteEntId;
    }

    @Basic
    @Column(name = "InviteEntName")
    public String getInviteEntName() {
        return inviteEntName;
    }

    public void setInviteEntName(String inviteEntName) {
        this.inviteEntName = inviteEntName;
    }

    @Basic
    @Column(name = "InviteTime")
    public Timestamp getInviteTime() {
        return inviteTime;
    }

    public void setInviteTime(Timestamp inviteTime) {
        this.inviteTime = inviteTime;
    }

    @Basic
    @Column(name = "InviteUserID")
    public Integer getInviteUserId() {
        return inviteUserId;
    }

    public void setInviteUserId(Integer inviteUserId) {
        this.inviteUserId = inviteUserId;
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
    @Column(name = "InvitedAccept")
    public Timestamp getInvitedAccept() {
        return invitedAccept;
    }

    public void setInvitedAccept(Timestamp invitedAccept) {
        this.invitedAccept = invitedAccept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpParcelOfLandInviterEntity that = (TpParcelOfLandInviterEntity) o;

        if (id != that.id) return false;
        if (invitedEntName != null ? !invitedEntName.equals(that.invitedEntName) : that.invitedEntName != null)
            return false;
        if (invitedEntId != null ? !invitedEntId.equals(that.invitedEntId) : that.invitedEntId != null) return false;
        if (invitedPhone != null ? !invitedPhone.equals(that.invitedPhone) : that.invitedPhone != null) return false;
        if (invitedRoleId != null ? !invitedRoleId.equals(that.invitedRoleId) : that.invitedRoleId != null)
            return false;
        if (invitedRoleName != null ? !invitedRoleName.equals(that.invitedRoleName) : that.invitedRoleName != null)
            return false;
        if (invitedParcelOfLandId != null ? !invitedParcelOfLandId.equals(that.invitedParcelOfLandId) : that.invitedParcelOfLandId != null)
            return false;
        if (inviteEntId != null ? !inviteEntId.equals(that.inviteEntId) : that.inviteEntId != null) return false;
        if (inviteEntName != null ? !inviteEntName.equals(that.inviteEntName) : that.inviteEntName != null)
            return false;
        if (inviteTime != null ? !inviteTime.equals(that.inviteTime) : that.inviteTime != null) return false;
        if (inviteUserId != null ? !inviteUserId.equals(that.inviteUserId) : that.inviteUserId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (invitedAccept != null ? !invitedAccept.equals(that.invitedAccept) : that.invitedAccept != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (invitedEntName != null ? invitedEntName.hashCode() : 0);
        result = 31 * result + (invitedEntId != null ? invitedEntId.hashCode() : 0);
        result = 31 * result + (invitedPhone != null ? invitedPhone.hashCode() : 0);
        result = 31 * result + (invitedRoleId != null ? invitedRoleId.hashCode() : 0);
        result = 31 * result + (invitedRoleName != null ? invitedRoleName.hashCode() : 0);
        result = 31 * result + (invitedParcelOfLandId != null ? invitedParcelOfLandId.hashCode() : 0);
        result = 31 * result + (inviteEntId != null ? inviteEntId.hashCode() : 0);
        result = 31 * result + (inviteEntName != null ? inviteEntName.hashCode() : 0);
        result = 31 * result + (inviteTime != null ? inviteTime.hashCode() : 0);
        result = 31 * result + (inviteUserId != null ? inviteUserId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (invitedAccept != null ? invitedAccept.hashCode() : 0);
        return result;
    }
}
