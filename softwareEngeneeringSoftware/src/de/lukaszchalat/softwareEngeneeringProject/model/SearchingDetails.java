package de.lukaszchalat.softwareEngeneeringProject.model;

import java.time.LocalDate;

public class SearchingDetails 
{
	private String location;
	private LocalDate dateFrom;
	private LocalDate dateTo;
	private int floor;
	private int numberOfPeople;
	private int numberOfRooms;
	private String standard;
	
	public SearchingDetails()
	{
		
	}
	
	public SearchingDetails( String location, LocalDate dateFrom, LocalDate dateTo, int floor, int numberOfPeople, int numberOfRooms, String standard ) 
	{
		this.location       = location;
		this.dateFrom       = dateFrom;
		this.dateTo         = dateTo;
		this.floor          = floor;
		this.numberOfPeople = numberOfPeople;
		this.numberOfRooms  = numberOfRooms;
		this.standard       = standard;
		
	}
	
	public String getLocation()
	{
		return this.location;
	}
	
	public LocalDate getDateFrom() 
	{
		return this.dateFrom;
	}
	
	public LocalDate getDateTo()
	{
		return this.dateTo;
	}
	
	public int getFloor()
	{
		return this.floor;
	}
	
	public int getNumberOfPeople()
	{
		return this.numberOfPeople;
	}
	
	public int getNumberOfRooms() 
	{
		return numberOfRooms;
	}
	
	public String getStandard() 
	{
		return standard;
	}
	
	public void setLocation( String location ) 
	{
		this.location = location;
	}
	
	public void setDateFrom( LocalDate dateFrom ) 
	{
		this.dateFrom = dateFrom;
	}
	
	public void setDateTo( LocalDate dateTo ) 
	{
		this.dateTo = dateTo;
	}
	
	public void setFloor(int floor) 
	{
		this.floor = floor;
	}
	
	public void setNumberOfPeople(int numberOfPeople) 
	{
		this.numberOfPeople = numberOfPeople;
	}
	
	public void setNumberOfRooms(int numberOfRooms) 
	{
		this.numberOfRooms = numberOfRooms;
	}
	
	public void setStandard(String standard) 
	{
		this.standard = standard;
	}
}
