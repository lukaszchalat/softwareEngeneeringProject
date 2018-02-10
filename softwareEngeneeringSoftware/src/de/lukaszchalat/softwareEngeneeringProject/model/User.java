package de.lukaszchalat.softwareEngeneeringProject.model;

public class User 
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
	
	public User()
	{
		
	}

	public int getId() 
	{
		return id;
	}

	public String getNickName() 
	{
		return nickName;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public String getCountry() 
	{
		return country;
	}

	public String getCity() 
	{
		return city;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public void setNickName(String nickName) 
	{
		this.nickName = nickName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	@Override
	public String toString() {

		return super.toString();
	}
	
	
}
