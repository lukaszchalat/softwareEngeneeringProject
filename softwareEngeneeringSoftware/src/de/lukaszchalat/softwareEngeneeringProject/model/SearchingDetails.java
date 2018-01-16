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
	
	public SearchingDetails( String location, String dateFrom, String dateTo, String floor, String numberOfPeople, String numberOfRooms, String standard ) 
	{
		this.location = location;
		
	}
}
