package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


	/**
	 * The persistent class for the MOB_RM_APP_REF_ID database table.
	 * 
	 */
	@Entity
	@Table(name="MOB_RM_APP_REF_ID")
	
	public class MobRmAppRefId implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@SequenceGenerator(name="MOB_RM_APP_REF_ID_ID_GENERATOR", sequenceName="AA_APPLICATION_ID_SEQUENCE")
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOB_RM_APP_REF_ID_ID_GENERATOR")
		@Column(name="ID")
		private long id;

		@Column(name="APP_STATUS")
		private String appStatus;

		@Column(name="CREATED_BY")
		private String createdBy;

		@Temporal(TemporalType.DATE)
		@Column(name="CREATED_DATE")
		private Date createdDate;

		@Column(name="MODIFIED_BY")
		private String modifiedBy;

		@Temporal(TemporalType.DATE)
		@Column(name="MODIFIED_DATE")
		private Date modifiedDate;

		@Column(name="RM_NAME")
		private String rmName;

		@Column(name="RM_USED_ID")
		private String rmUsedId;

		public MobRmAppRefId() {
		}

		public long getId() {
			return this.id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getAppStatus() {
			return this.appStatus;
		}

		public void setAppStatus(String appStatus) {
			this.appStatus = appStatus;
		}

		public String getCreatedBy() {
			return this.createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public Date getCreatedDate() {
			return this.createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}

		public String getModifiedBy() {
			return this.modifiedBy;
		}

		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}

		public Date getModifiedDate() {
			return this.modifiedDate;
		}

		public void setModifiedDate(Date modifiedDate) {
			this.modifiedDate = modifiedDate;
		}

		public String getRmName() {
			return this.rmName;
		}

		public void setRmName(String rmName) {
			this.rmName = rmName;
		}

		public String getRmUsedId() {
			return this.rmUsedId;
		}

		public void setRmUsedId(String rmUsedId) {
			this.rmUsedId = rmUsedId;
		}

		@Override
		public String toString() {
			return "MobRmAppRefId [id=" + id + ", appStatus=" + appStatus + ", createdBy=" + createdBy
					+ ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
					+ ", rmName=" + rmName + ", rmUsedId=" + rmUsedId + "]";
		}
		
		
}
