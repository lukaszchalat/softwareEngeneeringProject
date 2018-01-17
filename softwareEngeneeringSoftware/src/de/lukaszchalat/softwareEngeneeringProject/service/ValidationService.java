package de.lukaszchalat.softwareEngeneeringProject.service;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationService 
{
	private boolean hasError                  = false;
	private Set<String> errorMessages         = new HashSet<>();
	private static ValidationService instance = null;
	
	private ValidationService()
	{
		
	}
	
	public static ValidationService getInstance()
	{
		if( instance == null )
		{
			return new ValidationService();
		}
		
		return instance;
	}
	
	public boolean checkLocation( String location )
	{
		location = location.toLowerCase().trim();
		
		if( location.length() < 3 )
		{
			this.hasError = true;
			
			addErrorMessage( "Podane miejsce wyszukiwania musi skladac sie z przynajmniej 3 liter." );
			
			return false;
		}
		
		for( int i = 0; i < location.length(); i++ )
		{
			int asciNumber = (int) location.charAt( i );
			
			if( asciNumber < 97 || asciNumber > 122  )
			{
				this.hasError = true;
				
				addErrorMessage( "Podane miejsce wyszukiwania musi skladac sie wylacznie z liter." );
				
				return false;
			}
		}
		
		return true;
	}
	
	public boolean checkDateFormat( String stringDate )
	{
		Pattern pattern = Pattern.compile( "^([0-2][0-9]||3[0-1]).(0[0-9]||1[0-2]).([0-9][0-9])?[0-9][0-9]$" );
		Matcher matcher = pattern.matcher( stringDate );
		
		if( ! matcher.matches() )
		{
			this.hasError = true;
			
			addErrorMessage( "Podany format daty jest niepoprawny." );
			
			return false;
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
