package com.afrAsia.Utils;

public class AfrAsiaMailConfig {
	String mailhost;
	String mailport;
	String mailFrom;
	String mailPassword;
	String smtpAuthRequired;
	String smtpAuthstarttls;
	public String getMailhost() {
		return mailhost;
	}
	public void setMailhost(String mailhost) {
		this.mailhost = mailhost;
	}
	public String getMailport() {
		return mailport;
	}
	public void setMailport(String mailport) {
		this.mailport = mailport;
	}
	public String getMailFrom() {
		return mailFrom;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public String getMailPassword() {
		return mailPassword;
	}
	public void setMailPassword(String mailPassword) {
		this.mailPassword = mailPassword;
	}
	public String getSmtpAuthRequired() {
		return smtpAuthRequired;
	}
	public void setSmtpAuthRequired(String smtpAuthRequired) {
		this.smtpAuthRequired = smtpAuthRequired;
	}
	public String getSmtpAuthstarttls() {
		return smtpAuthstarttls;
	}
	public void setSmtpAuthstarttls(String smtpAuthstarttls) {
		this.smtpAuthstarttls = smtpAuthstarttls;
	}
}
