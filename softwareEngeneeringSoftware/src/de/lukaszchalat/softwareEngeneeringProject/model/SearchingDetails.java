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
	private int standard;
	
	public SearchingDetails()
	{
		
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
	
	public int getStandard() 
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
	
	public void setFloor( String floor ) 
	{
		if( floor.equals( "parter" ) ) this.floor = 0;
		else this.floor = new Integer( floor.split( " " )[0] );
	}
	
	public void setNumberOfPeople( String numberOfPeople ) 
	{
		this.numberOfPeople = new Integer( numberOfPeople.split( " " )[0] );
	}
	
	public void setNumberOfRooms( String numberOfRooms ) 
	{
		this.numberOfRooms = new Integer( numberOfRooms.split( " " )[0] );
	}
	
	public void setStandard( String standard ) 
	{
		this.standard = new Integer( standard.split( " " )[0] );
	}
}
