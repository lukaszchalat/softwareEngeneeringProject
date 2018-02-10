package de.lukaszchalat.softwareEngeneeringProject.dao;

import java.sql.*;

import javax.swing.JOptionPane;

import de.lukaszchalat.softwareEngeneeringProject.model.Reservation;
import de.lukaszchalat.softwareEngeneeringProject.mysql.MysqlConnection;

public class ReservationDAO 
{
	private static ReservationDAO instance = null;
	private Connection connection          = MysqlConnection.getConnection();
	
	private ReservationDAO()
	{
		
	}
	
	public static ReservationDAO getInstance()
	{
		if( instance == null )
		{
			return new ReservationDAO();
		}
		
		return instance;
	}
	
	public boolean doReservation( Reservation reservation )
	{
		try
		{
			Statement statement = connection.createStatement();
			
			int realized = reservation.isRealized() == true ? 0 : 1;
			
			String query = "insert into softwareengeneering.reservations VALUES ( DEFAULT, '" + reservation.getRoomId() + "'"
                    + ", '" + reservation.getUserId() + "'"
                    + ", '" + reservation.getDateFrom() + "'"
                    + ", '" + reservation.getDateTo() + "'"
                    + ", '" + realized + "')";
			
					System.out.println(query);
			
					int status = statement.executeUpdate( query );

					if( status == 1 )
					{
						JOptionPane.showMessageDialog( null, "Twoj pokoj zostal zarezerwowany!", "Informacja", JOptionPane.INFORMATION_MESSAGE);
						
						return true;
					}
					else
					{
						return false;
					}
		}
		catch( SQLException ex)
		{
			ex.printStackTrace();
			
		}
		
		return true;
	}
		
}
