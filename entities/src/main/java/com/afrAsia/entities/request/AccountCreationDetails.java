package com.afrAsia.entities.request;

import java.io.Serializable;

public class AccountCreationDetails implements Serializable {
	

	private static final long serialVersionUID = 3973695551195293640L;
	
	
		private long refNo;
		private String refNoOwner;
		private boolean isCifExist = false;
		private String cif;
		private boolean isMinor = false;
		private String guardianName;
	//	private long guardianRefNo;
		private Object soapResWarning;
		private Object soapResError;
		private String otherErrorMsg;
		
		private MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest;
		
		public long getRefNo() {
			return refNo;
		}
		public void setRefNo(long refNo) {
			this.refNo = refNo;
		}
		
		public String getRefNoOwner() {
			return refNoOwner;
		}
		public void setRefNoOwner(String refNoOwner) {
			this.refNoOwner = refNoOwner;
		}
		
		public String getCif() {
			return cif;
		}
		public void setCif(String cif) {
			this.cif = cif;
		}
		
		public boolean isCifExist() {
			return isCifExist;
		}
		public void setCifExist(boolean isCifExist) {
			this.isCifExist = isCifExist;
		}
		public boolean isMinor() {
			return isMinor;
		}
		public void setMinor(boolean isMinor) {
			this.isMinor = isMinor;
		}
		public String getGuardianName() {
			return guardianName;
		}
		public void setGuardianName(String guardianName) {
			this.guardianName = guardianName;
		}
		/*public long getGuardianRefNo() {
			return guardianRefNo;
		}
		public void setGuardianRefNo(long guardianRefNo) {
			this.guardianRefNo = guardianRefNo;
		}*/
		
		
		public Object getSoapResWarning() {
			return soapResWarning;
		}
		public void setSoapResWarning(Object soapResWarning) {
			this.soapResWarning = soapResWarning;
		}
		public Object getSoapResError() {
			return soapResError;
		}
		public void setSoapResError(Object soapResError) {
			this.soapResError = soapResError;
		}
		public String getOtherErrorMsg() {
			return otherErrorMsg;
		}
		public void setOtherErrorMsg(String otherErrorMsg) {
			this.otherErrorMsg = otherErrorMsg;
		}
		public MobCreateCustomerSOAPRequest getMobCreateCustomerSOAPRequest() {
			return mobCreateCustomerSOAPRequest;
		}
		public void setMobCreateCustomerSOAPRequest(MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest) {
			this.mobCreateCustomerSOAPRequest = mobCreateCustomerSOAPRequest;
		}
}
	
