package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the MOB_COMMENTS database table.
 * 
 */
@Entity
@Table(name = "MOB_COMMENTS")
public class MobComments implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOB_COMMENTS_ID_RECORDID_GENERATOR", sequenceName="AA_COMMENTS_ID_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOB_COMMENTS_ID_RECORDID_GENERATOR")
	@Column(name = "ID", unique = true, nullable = false)
	private long id;

	@Column(name = "APP_ID")
	private long appId;

	@Column(name = "COMMENTS")
	private String comment;
	
	@Column(name = "USER_CATEGORY")
	private String userCat;

	@Column(name = "CREATED_BY")
	private String commentedAddedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE")
	private Date commentDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentedAddedBy() {
		return commentedAddedBy;
	}

	public void setCommentedAddedBy(String commentedAddedBy) {
		this.commentedAddedBy = commentedAddedBy;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getUserCat() {
		return userCat;
	}

	public void setUserCat(String userCat) {
		this.userCat = userCat;
	}

	@Override
	public String toString() {
		return "MobComments [id=" + id + ", appId=" + appId + ", comment=" + comment + ", commentedAddedBy="
				+ commentedAddedBy + ", commentDate=" + commentDate + ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + ", userCat=" + userCat + "]";
	}

}
