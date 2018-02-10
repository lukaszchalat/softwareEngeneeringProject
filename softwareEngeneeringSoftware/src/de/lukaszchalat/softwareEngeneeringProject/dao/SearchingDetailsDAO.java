package de.lukaszchalat.softwareEngeneeringProject.dao;

import java.sql.*;
import java.util.LinkedHashSet;
import java.util.Set;

import de.lukaszchalat.softwareEngeneeringProject.model.SearchingResult;
import de.lukaszchalat.softwareEngeneeringProject.mysql.MysqlConnection;
import de.lukaszchalat.softwareEngeneeringProject.model.SearchingDetails;

public class SearchingDetailsDAO 
{
	private static SearchingDetailsDAO instance = null;
	private Connection connection               = MysqlConnection.getConnection();
	
	private SearchingDetailsDAO()
	{
		
	}
	
	public static SearchingDetailsDAO getInstance()
	{
		if( instance == null )
		{
			return new SearchingDetailsDAO();
		}
		
		return instance;
	}
	
	public Set<SearchingResult> getResults( SearchingDetails searchingDetails )
	{
		Set<SearchingResult> results = new LinkedHashSet<>();
		
		try
		{
			Statement statement = connection.createStatement();
			
			String query = "Select hotels.name, hotels.address, rooms.price, rooms.id from rooms, hotels "
					+ "where rooms.hotel_id = hotels.id and rooms.people=" + searchingDetails.getNumberOfPeople()
					+ " and rooms.floor=" + searchingDetails.getFloor();
			
			ResultSet resultSet = statement.executeQuery( query );
			
			while( resultSet.next() )
			{
				SearchingResult searchingResult = new SearchingResult();
				
				searchingResult.setHotelName( resultSet.getString( 1 ) );
				searchingResult.setHotelAddress( resultSet.getString( 2 ) );
				searchingResult.setPrice( resultSet.getDouble( 3 ) );
				searchingResult.setId( resultSet.getInt( 4 ) );
				searchingResult.setStartingDate( searchingDetails.getDateFrom().toString() );
				searchingResult.setFinalDate( searchingDetails.getDateTo().toString() );
				
				results.add( searchingResult );
			}
		}
		catch( SQLException ex )
		{
			ex.printStackTrace();
		}
		
		return results;
	}
	
}
