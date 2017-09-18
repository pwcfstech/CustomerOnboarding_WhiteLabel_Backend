package com.afrAsia.authenticate.ldap;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

/**
 * 
 * @author nyalfernandes
 *
 */
public class PersonRepoImpl 
{
	private LdapTemplate ldapTemplate;
	private String ldapUrl;
	private String ldapUsername;
	private String ldapPassword;
	private String dnBase;
	private String ldapAuthenticationType;
	private String ldapContextFactory;
	
	private ReentrantLock lock = new ReentrantLock();
	
	public static String LDAP_NAME_ATTRIBUTE = "cn";
	public static String LDAP_EMAIL_ATTRIBUTE = "mail";
	public static String LDAP_MEMBER_OF_ATTRIBUTE = "memberOf";
	
	
	
	public String getLdapUrl() {
		return ldapUrl;
	}

	public void setLdapUrl(String ldapUrl) {
		this.ldapUrl = ldapUrl;
	}

	public String getLdapUsername() {
		return ldapUsername;
	}

	public void setLdapUsername(String ldapUsername) {
		this.ldapUsername = ldapUsername;
	}

	public String getLdapPassword() {
		return ldapPassword;
	}

	public void setLdapPassword(String ldapPassword) {
		this.ldapPassword = ldapPassword;
	}

	public String getDnBase() {
		return dnBase;
	}

	public void setDnBase(String dnBase) {
		this.dnBase = dnBase;
	}

	public String getLdapAuthenticationType() {
		return ldapAuthenticationType;
	}

	public void setLdapAuthenticationType(String ldapAuthenticationType) {
		this.ldapAuthenticationType = ldapAuthenticationType;
	}

	public String getLdapContextFactory() {
		return ldapContextFactory;
	}

	public void setLdapContextFactory(String ldapContextFactory) {
		this.ldapContextFactory = ldapContextFactory;
	}

	public LdapTemplate getLdapTemplate() {
		return ldapTemplate;
	}

	public void setLdapTemplate(LdapTemplate ldapTemplate) 
	{
		this.ldapTemplate = ldapTemplate;
	}

	public List<String> getAllPersonNames() {
		return ldapTemplate.search(query().where("objectclass").is("person"), new AttributesMapper<String>() {
			public String mapFromAttributes(Attributes attrs) throws NamingException {
				return attrs.get("cn").get().toString();
			}
		});
	}

	public Map<String, String> findPerson(String dn) {
		return ldapTemplate.lookup(dn, new PersonAttributesMapper());
	}
	
	public synchronized Map<String, String> findPerson(String dn, String password) 
	{
		try
		{
			lock.lock();
			reCreateLdapContext(dn, password);
			List<String> usenames = getAllPersonNames();
			System.out.println("UserNames" + usenames);
			return ldapTemplate.lookup("cn=" + dn, new PersonAttributesMapper());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
		
		return null;
	}

	private class PersonAttributesMapper implements AttributesMapper<Map<String, String>> {
		public Map<String, String> mapFromAttributes(Attributes attrs) throws NamingException 
		{
			Map<String, String> attributeMap = new HashMap<String, String>();
			attributeMap.put(LDAP_NAME_ATTRIBUTE, attrs.get(LDAP_NAME_ATTRIBUTE) == null ? null : (String) attrs.get(LDAP_NAME_ATTRIBUTE).get());
			attributeMap.put(LDAP_EMAIL_ATTRIBUTE, attrs.get(LDAP_EMAIL_ATTRIBUTE) == null ? null : (String) attrs.get(LDAP_EMAIL_ATTRIBUTE).get());
			attributeMap.put(LDAP_MEMBER_OF_ATTRIBUTE, attrs.get(LDAP_MEMBER_OF_ATTRIBUTE) == null ? null : (String) attrs.get(LDAP_MEMBER_OF_ATTRIBUTE).get());
			return attributeMap;
		}
	}
	
	private void reCreateLdapContext(String username, String password)
	{
		LdapContextSource ldapContextSoure = new LdapContextSource();
		ldapContextSoure.setUserDn(username);
		ldapContextSoure.setPassword(password);
		ldapContextSoure.setUrl(getLdapUrl());
		ldapContextSoure.setBase(getDnBase());
		
		ldapContextSoure.afterPropertiesSet();
		
		LdapTemplate ldapTemplateTemp = new LdapTemplate(ldapContextSoure);
		ldapTemplate = ldapTemplateTemp;
	}
}
