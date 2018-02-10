package de.lukaszchalat.softwareEngeneeringProject.service;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import de.lukaszchalat.softwareEngeneeringProject.utilities.ErrorMessages;

public class SearchingDetailsValidator 
{
	private boolean hasError                  = false;
	private Set<String> errorMessages         = new LinkedHashSet<>();
	private static SearchingDetailsValidator instance = null;
	
	private SearchingDetailsValidator()
	{
		
	}
	
	public static SearchingDetailsValidator getInstance()
	{
		if( instance == null )
		{
			return new SearchingDetailsValidator();
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
		LocalDate localDate = DateConverter.convertFromStringToLocalDate( stringDate );
		
		if( localDate == null )
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
	
	public boolean checkPeriod( String dateFromString, String dateToString )
	{
		LocalDate dateFrom = DateConverter.convertFromStringToLocalDate( dateFromString );
		LocalDate dateTo   = DateConverter.convertFromStringToLocalDate( dateToString );
		
		if( dateFrom.compareTo( dateTo ) >= 0 )
		{
			this.hasError = true;
			
			addErrorMessage( ErrorMessages.ERROR_DATE_TO_IS_NOT_AFTER_DATE_FROM );
			
			return false;
		}
		
		return true;
	}
	
	public void showErrorMessages()
	{
		String title     = "B³êdna konfiguracja";
		StringBuilder sb = new StringBuilder();
		
		this.errorMessages.forEach( errorMessage -> sb.append( errorMessage + "\n" ) );
		
		JOptionPane.showMessageDialog( null, sb.toString(), title, JOptionPane.PLAIN_MESSAGE);
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
