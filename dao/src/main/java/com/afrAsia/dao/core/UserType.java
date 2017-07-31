package com.afrAsia.dao.core;

/**
 * Defines the user type during login
 * 
 * @author Nyal Fernandes
 *
 */
public enum UserType 
{
	RM("Rm"),
	COMP("Comp"),
	;
	
	private String name;
	
	UserType(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
}
