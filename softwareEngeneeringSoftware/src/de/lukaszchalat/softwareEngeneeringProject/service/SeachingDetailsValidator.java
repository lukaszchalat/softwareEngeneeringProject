package de.lukaszchalat.softwareEngeneeringProject.service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import de.lukaszchalat.softwareEngeneeringProject.utilities.ErrorMessages;

public class SeachingDetailsValidator 
{
	private boolean hasError                  = false;
	private Set<String> errorMessages         = new LinkedHashSet<>();
	private static SeachingDetailsValidator instance = null;
	
	private SeachingDetailsValidator()
	{
		
	}
	
	public static SeachingDetailsValidator getInstance()
	{
		if( instance == null )
		{
			return new SeachingDetailsValidator();
		}
		
		return instance;
	}
	
	private boolean checkEmptyLocation( String location )
	{
		if( location.isEmpty() )
		{
			this.hasError = true;
			
			addErrorMessage( ErrorMessages.ERROR_LOCATION_FIELD_IS_EMPTY );
			
			return false;
		}
		
		return true;
	}
	
	private boolean checkLocationLength( String location )
	{
		if( location.length() < 3 )
		{
			this.hasError = true;
			
			addErrorMessage( ErrorMessages.ERROR_LOCATION_LENGTH_IS_TOO_SHORT );
			
			return false;
		}
		
		return true;
	}
	
	private boolean checkLocationCharacters( String location )
	{
		for( int i = 0; i < location.length(); i++ )
		{
			int asciNumber = (int) location.charAt( i );
			
			if( asciNumber < 97 || asciNumber > 122  )
			{
				this.hasError = true;
				
				addErrorMessage( ErrorMessages.ERROR_LOCATION_NAME_IS_WRONG );
				
				return false;
			}
		}
		
		return true;
	}
	
	public boolean checkLocation( String location )
	{
		location = location.toLowerCase().trim();
		
		if( ! checkEmptyLocation( location ) 
		 || ! checkLocationLength( location )
		 || ! checkLocationCharacters( location ) )
		{
			return false;
		} 
		
		return true;
	}
	
	private boolean checkDateFormat( String stringDate, int field )
	{
		Pattern pattern = Pattern.compile( "^([0-2][0-9]||3[0-1]).(0[0-9]||1[0-2]).([0-9][0-9])?[0-9][0-9]$" );
		Matcher matcher = pattern.matcher( stringDate );
		
		if( ! matcher.matches() )
		{
			this.hasError = true;
			
			if(field == 1) addErrorMessage( ErrorMessages.ERROR_DATE_FROM_FORMAT_IS_WRONG );
			else addErrorMessage( ErrorMessages.ERROR_DATE_TO_FORMAT_IS_WRONG );
			
			return false;
		}
			
		return true;
	}
	
	private boolean checkDateCorrectness( String stringDate, int field )
	{	
		String[] datePieces = stringDate.split( "\\." );
		
		int day   = Integer.parseInt( datePieces[0] );
		int month = Integer.parseInt( datePieces[1] );
		int year  = Integer.parseInt( datePieces[2] );
		
		LocalDate localDate = null;
		
		try
		{
			localDate = LocalDate.of( year, month, day );
		} 
		catch( DateTimeException ex )
		{
			this.hasError = true;
			
			if( field == 1 ) addErrorMessage( ErrorMessages.ERROR_DATE_FROM_IS_WRONG );
			else addErrorMessage( ErrorMessages.ERROR_DATE_TO_IS_WRONG );
			
			
			return false;
		}
		
		LocalDate currentDate = LocalDate.now();
		
		if( localDate.compareTo( currentDate ) < 0 )
		{
			this.hasError = true;
			
			if( field == 1 ) addErrorMessage( ErrorMessages.ERROR_DATE_FROM_IS_TOO_OLD );
			else addErrorMessage( ErrorMessages.ERROR_DATE_TO_IS_TOO_OLD );
			
			return false;
		}
		
		return true;
	}
	
	public boolean checkDate( String stringDate, int field )
	{
		if( ! checkDateFormat( stringDate, field )
		 || ! checkDateCorrectness( stringDate, field ) )
		{
			return false;
		}
			
		return true;
	}
	
	public boolean checkPeriod( String dateFrom, String dateTo )
	{
		try
		{
			
		}
		catch( DateTimeException ex )
		{
			
		}
		
		return true;
	}
	
	public void addErrorMessage( String errorMessage )
	{
		this.errorMessages.add( errorMessage );
	}
	
	public boolean hasError()
	{
		return this.hasError;
	}
	
	public Set<String> getErrorMessages()
	{
		return this.errorMessages;
	}
}
