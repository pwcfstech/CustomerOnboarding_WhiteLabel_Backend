package com.afrAsia.authenticate;

public class Test 
{

	public static void main(String[] args)
	{
		boolean isRequestSuccessful = false;
		
		while (isRequestSuccessful)
		{
			try
			{
				// execute blocks of code
				isRequestSuccessful = true;      
			}
			catch (Exception e)
			{
				// show pop up
				isRequestSuccessful = false;
			}
		}// while end
	}
}
