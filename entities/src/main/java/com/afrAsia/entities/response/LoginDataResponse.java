package com.afrAsia.entities.response;

/**
 * 
 * @author nyalfernandes
 *
 */
public class LoginDataResponse 
{
	private String success;
	private String rmName;
	private String oAuthToken;
	private long lastLoginTime;
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getRmName() {
		return rmName;
	}
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	public String getoAuthToken() {
		return oAuthToken;
	}
	public void setoAuthToken(String oAuthToken) {
		this.oAuthToken = oAuthToken;
	}
	public long getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
}
