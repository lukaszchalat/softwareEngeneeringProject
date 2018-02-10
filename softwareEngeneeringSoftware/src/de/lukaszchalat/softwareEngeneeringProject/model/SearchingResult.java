package de.lukaszchalat.softwareEngeneeringProject.model;

import java.util.List;

public class SearchingResult 
{
	private String hotelName;
	private String hotelAddress;
	private double price;
	private String startingDate;
	private String finalDate;
	
	public SearchingResult()
	{
		
	}
	
	public String getHotelName() 
	{
		return hotelName;
	}
	
	public String getHotelAddress() 
	{
		return hotelAddress;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public String getStartingDate() 
	{
		return startingDate;
	}
	
	public String getFinalDate() 
	{
		return finalDate;
	}
	
	public void setHotelName(String hotelName) 
	{
		this.hotelName = hotelName;
	}
	
	public void setHotelAddress(String hotelAddress) 
	{
		this.hotelAddress = hotelAddress;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public void setStartingDate(String startingDate) 
	{
		this.startingDate = startingDate;
	}
	
	public void setFinalDate(String finalDate) 
	{
		this.finalDate = finalDate;
	}
	
}
