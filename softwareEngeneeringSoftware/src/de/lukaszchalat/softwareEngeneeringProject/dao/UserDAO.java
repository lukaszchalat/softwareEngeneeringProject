package de.lukaszchalat.softwareEngeneeringProject.dao;

import java.sql.*;

import javax.swing.JOptionPane;

import de.lukaszchalat.softwareEngeneeringProject.model.User;
import de.lukaszchalat.softwareEngeneeringProject.mysql.MysqlConnection;

public class UserDAO 
{
	private static UserDAO instance;
	private Statement statement;
	private Connection connection = MysqlConnection.getConnection();
	
	private UserDAO()
	{
		
	}
	
	public static UserDAO getInstance()
	{
		if( instance == null )
		{
			return new UserDAO();
		}
		
		return instance;
	}
	
	public boolean createUser( User user )
	{
		
		if( ! checkIfExist( user.getNickName() ) )
		{
		
			try
			{
				statement = connection.createStatement();
			
				String query = "insert into softwareengeneering.clients VALUES ( DEFAULT, '" + user.getFirstName() + "'"
					                                                 + ", '" + user.getLastName() + "'"
					                                                 + ", '" + user.getNickName() + "'"
					                                                 + ", '" + user.getPassword() + "'"
					                                                 + ", '" + 1 + "'"
					                                                 + ", '" + 1 + "'"
					                                                 + ", '" + user.getEmail() + "'"
					                                                 + ", '" + user.getPhoneNumber() + "')";
				int status = statement.executeUpdate( query );
			
				if( status == 1 )
				{
					JOptionPane.showMessageDialog( null, "Nowy u�ytkownik zosta� poprawnie zarejestrowany!", "Informacja", JOptionPane.INFORMATION_MESSAGE);
				}
			
			}
			catch( SQLException ex )
			{
				ex.printStackTrace();
			}
		}
		else
		{
			JOptionPane.showMessageDialog( null, "U�ytkownik o tej nazwie ju� istnieje!", "Informacja", JOptionPane.INFORMATION_MESSAGE);
			
			return false;
		}
		
		return true;
	}
	
	private boolean checkIfExist( String userName )
	{
		try
		{
			statement = connection.createStatement();
			
			String query = "select count(*) from clients where userName='" + userName + "'";
			
			ResultSet resultSet = statement.executeQuery( query );
			
			if( resultSet.next() )
			{
				return true;
			}
		}
		catch( SQLException ex )
		{
			ex.printStackTrace();
		}
		
		return false;
	}
}
