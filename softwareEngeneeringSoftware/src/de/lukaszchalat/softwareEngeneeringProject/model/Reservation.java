package de.lukaszchalat.softwareEngeneeringProject.model;

public class Reservation 
{
	private int roomId;
	private int userId;
	private String dateFrom;
	private String dateTo;
	private boolean realized;
	
	public Reservation()
	{
		
	}

	public int getRoomId() 
	{
		return roomId;
	}

	public void setRoomId(int roomId) 
	{
		this.roomId = roomId;
	}

	public int getUserId() 
	{
		return userId;
	}

	public void setUserId(int userId) 
	{
		this.userId = userId;
	}

	public String getDateFrom() 
	{
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) 
	{
		this.dateFrom = dateFrom;
	}

	public String getDateTo() 
	{
		return dateTo;
	}

	public void setDateTo(String dateTo) 
	{
		this.dateTo = dateTo;
	}

	public boolean isRealized() 
	{
		return realized;
	}

	public void setRealized(boolean realized) 
	{
		this.realized = realized;
	}
}
