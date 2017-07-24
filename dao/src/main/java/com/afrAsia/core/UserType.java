package com.afrAsia.core;

/**
 * User type enum
 * @author nyalfernandes
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
		return this.name();
	}
}
