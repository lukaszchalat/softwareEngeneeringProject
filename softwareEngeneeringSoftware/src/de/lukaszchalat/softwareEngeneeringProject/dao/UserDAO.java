package de.lukaszchalat.softwareEngeneeringProject.dao;

import java.sql.*;

import javax.swing.JOptionPane;

import de.lukaszchalat.softwareEngeneeringProject.model.User;
import de.lukaszchalat.softwareEngeneeringProject.mysql.MysqlConnection;
import de.lukaszchalat.softwareEngeneeringProject.service.UserBuilder;

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
		
		if( getUser( user.getNickName(), user.getPassword() ) == null )
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
	
	public User getUser( String userName, String password )
	{
		try
		{
			statement = connection.createStatement();
			
			String query = "select id, username, password from clients where userName='" + userName + "' and password='" + password + "'";
			
			ResultSet resultSet = statement.executeQuery( query );
			
			while( resultSet.next() )
			{ 
				UserBuilder userBuilder = new UserBuilder();
				
				return userBuilder.id( resultSet.getInt( "id" ) )
						          .nickName( resultSet.getString( "userName" ) )
						          .build();
			}
		}
		catch( SQLException ex )
		{
			ex.printStackTrace();
		}
		
		return null;
	}
}
