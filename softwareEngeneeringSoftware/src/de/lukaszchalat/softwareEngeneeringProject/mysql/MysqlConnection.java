package de.lukaszchalat.softwareEngeneeringProject.mysql;

import java.sql.*;

public class MysqlConnection 
{
	public static final String USER     = "root";
	public static final String PASSWORD = "";
	public static final String URL      = "jdbc:mysql://localhost:3306/hotels";
	
	public static Connection getConnection()
	{
		try
		{
			return DriverManager.getConnection( URL, USER, PASSWORD );
		}
		catch( SQLException ex )
		{
			ex.printStackTrace();
			
			return null;
		}
	}
}