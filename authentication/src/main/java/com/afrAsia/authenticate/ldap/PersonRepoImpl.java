package com.afrAsia.authenticate.ldap;

import java.util.List;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

/**
 * 
 * @author nyalfernandes
 *
 */
public class PersonRepoImpl {
	private LdapTemplate ldapTemplate;

	public void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}

	public List<String> getAllPersonNames() {
		return ldapTemplate.search(query().where("objectclass").is("person"), new AttributesMapper<String>() {
			public String mapFromAttributes(Attributes attrs) throws NamingException {
				return attrs.get("cn").get().toString();
			}
		});
	}

	public String findPerson(String dn) {
		return ldapTemplate.lookup(dn, new PersonAttributesMapper());
	}

	private class PersonAttributesMapper implements AttributesMapper<String> {
		public String mapFromAttributes(Attributes attrs) throws NamingException {
			return (String) attrs.get("cn").get();
		}
	}
}
