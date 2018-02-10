package de.lukaszchalat.softwareEngeneeringProject.service;

import de.lukaszchalat.softwareEngeneeringProject.model.User;

public class UserBuilder 
{
	private int id;
	private String nickName;
	private String firstName;
	private String lastName;
	private String country;
	private String city;
	private String email;
	private String phoneNumber;
	private String password;
	
	public UserBuilder()
	{
		
	}
	
	public UserBuilder id( int id )
	{
		this.id = id;
		
		return this;
	}
	
	public UserBuilder nickName( String nickName )
	{
		this.nickName = nickName;
		
		return this;
	}
	
	public UserBuilder firstName( String nickName )
	{
		this.nickName = nickName;
		
		return this;
	}
	
	public UserBuilder lastName( String lastName )
	{
		this.lastName = lastName;
		
		return this;
	}
	
	public UserBuilder country( String country )
	{
		this.country = country;
		
		return this;
	}
	
	public UserBuilder city( String city )
	{
		this.city = city;
		
		return this;
	}
	
	public UserBuilder email( String email )
	{
		this.email = email;
		
		return this;
	}
	
	public UserBuilder phoneNumber( String phoneNumber )
	{
		this.phoneNumber = phoneNumber;
		
		return this;
	}
	
	public UserBuilder password( String password )
	{
		this.password = password;
		
		return this;
	}
	
	public User build()
	{
		User user = new User();
		
		user.setId( this.id );
		user.setNickName( this.nickName );
		user.setFirstName( this.firstName );
		user.setLastName( this.lastName );
		user.setCountry( this.country );
		user.setCity( this.city );
		user.setEmail( this.email );
		user.setPhoneNumber( this.phoneNumber );
		user.setPassword( this.password );
		
		return user;
	}
}

