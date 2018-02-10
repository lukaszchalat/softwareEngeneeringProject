package de.lukaszchalat.softwareEngeneeringProject.model;

public class UserLogin 
{
	private String userName;
	private String userPassword;
	
	public UserLogin()
	{
		
	}
	
	public UserLogin( String userName, String userPassword ) 
	{
		this.userName     = userName;
		this.userPassword = userPassword;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public String getUserPassword() 
	{
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
}
