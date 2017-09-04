package com.afrAsia.authenticate;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

public class Test {

	public static void main(String[] args) {
		boolean isRequestSuccessful = true;

		try {
			// execute blocks of code
			isRequestSuccessful = true;
			System.out.println("Done");
			tryLdapConnection("RMTestmob1", "Qwerty@1234");
		} catch (Exception e) {
			e.printStackTrace();
			// show pop up
			isRequestSuccessful = false;
		}

	}

	private static boolean tryLdapConnection(String username, String password) {
		try {
			Hashtable<String, String> env = new Hashtable<String, String>();

			env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
			env.put(Context.PROVIDER_URL, "ldap://10.0.0.202:389");
			env.put(Context.SECURITY_AUTHENTICATION, "simple");
			// env.put(Context., arg1)
			env.put(Context.SECURITY_PRINCIPAL, username);
			env.put(Context.SECURITY_CREDENTIALS, password);

			LdapContext ctx = new InitialLdapContext(env, null);
			ctx.setRequestControls(null);

			NamingEnumeration<?> namingEnum = ctx.search("ou=Datacenter,ou=AfrasiaBank Users,dc=afrasiabank,DC=local", "(objectclass=user)", getSearchControls());
			
			while (namingEnum != null && namingEnum.hasMoreElements())
			{
				SearchResult result = (SearchResult) namingEnum.next ();    
	            Attributes attrs = result.getAttributes ();
	            System.out.println(attrs.get("cn"));
			}
		} catch (Exception e) {
			System.out.println("LDAP EXCEPTION" + e.getMessage());
			e.printStackTrace();
			return false;
		}

		return true;

	}

	private static SearchControls getSearchControls() 
	{
		SearchControls searchControls = new SearchControls();
		searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
		searchControls.setTimeLimit(30000);
		return searchControls;
	}
}
