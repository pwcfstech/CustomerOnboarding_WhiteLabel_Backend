package com.afrAsia.authenticate;

import java.util.HashMap;
import java.util.Map;

/**
 * Ldap Group
 * @author Nyal Fernandes
 *
 */
public enum LdapGroup 
{
	RM_MOBILE("G-RMMobile", "RM"),
	COMPLIANCE("G-RMMobile", "RM"),
	;
	
	static Map<String, LdapGroup> ldapVsLdapGroup = new HashMap<String, LdapGroup>();
	static Map<String, LdapGroup> requestVsLdapGroup = new HashMap<String, LdapGroup>();
	
	static
	{
		for (LdapGroup ldapGroup : values())
		{
			ldapVsLdapGroup.put(ldapGroup.getLdapGroup(), ldapGroup);
			requestVsLdapGroup.put(ldapGroup.getRequestGroup(), ldapGroup);
		}
	}
	
	private String ldapGroup;
	private String requestGroup;
	
	LdapGroup(String ldapGroup, String requestGroup)
	{
		this.ldapGroup = ldapGroup;
		this.requestGroup = requestGroup;
	}
	
	public String getLdapGroup() {
		return ldapGroup;
	}
	
	public String getRequestGroup() {
		return requestGroup;
	}

	public static LdapGroup parseRequestGroup(String requestGroup)
	{
		if (requestGroup == null) return null;
		return requestVsLdapGroup.get(requestGroup.toUpperCase());
	}
	
	public static LdapGroup parseLdapGroup(String ldapGroup)
	{
		if (ldapGroup == null) return null;
		return ldapVsLdapGroup.get(ldapGroup);
	}
}
