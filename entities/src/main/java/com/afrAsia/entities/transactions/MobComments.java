package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


	/**
	 * The persistent class for the MOB_COMMENTS database table.
	 * 
	 */
	@Entity
	@Table(name="MOB_COMMENTS")
	
	public class MobComments implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="ID")
		private long id;

		@Column(name="COMMENTS")
		private String comment;

		@Column(name="CREATED_BY")
		private String commentedAddedBy;

		@Temporal(TemporalType.DATE)
		@Column(name="CREATED_DATE")
		private Date commentDate;

		@Column(name="USER_CATEGORY")
		private String userCat;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
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

		public String getUserCat() {
			return userCat;
		}

		public void setUserCat(String userCat) {
			this.userCat = userCat;
		}

		@Override
		public String toString() {
			return "MobComments [id=" + id + ", comment=" + comment + ", commentedAddedBy=" + commentedAddedBy
					+ ", commentDate=" + commentDate + ", userCat=" + userCat + "]";
		}	
}
