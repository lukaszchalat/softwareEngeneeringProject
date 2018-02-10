package de.lukaszchalat.softwareEngeneeringProject.dao;

import java.sql.*;
import java.util.Set;

import de.lukaszchalat.softwareEngeneeringProject.model.SearchingResult;
import de.lukaszchalat.softwareEngeneeringProject.mysql.MysqlConnection;
import de.lukaszchalat.softwareEngeneeringProject.model.SearchingDetails;

public class SearchingDetailsDAO 
{
	private static SearchingDetailsDAO instance = null;
	private Connection databaseConnection       = MysqlConnection.getConnection();
	
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
		return null;
	}
	
	
}
