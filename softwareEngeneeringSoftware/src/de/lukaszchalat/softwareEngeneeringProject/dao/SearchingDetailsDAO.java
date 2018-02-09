package de.lukaszchalat.softwareEngeneeringProject.dao;

import java.sql.*;
import de.lukaszchalat.softwareEngeneeringProject.mysql.MysqlConnection;

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
	
	
}
