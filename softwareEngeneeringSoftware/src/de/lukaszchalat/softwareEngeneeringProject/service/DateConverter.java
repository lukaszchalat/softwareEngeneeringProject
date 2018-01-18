package de.lukaszchalat.softwareEngeneeringProject.service;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DateConverter 
{
	public static LocalDate convertFromStringToLocalDate( String stringDate )
	{
		String[] datePieces = stringDate.split( "\\." );
		
		int day   = Integer.parseInt( datePieces[0] );
		int month = Integer.parseInt( datePieces[1] );
		int year  = Integer.parseInt( datePieces[2] );
		
		try
		{
			return LocalDate.of( year, month, day );
		} 
		catch( DateTimeException ex )
		{
			return null;
		}
	}
}
