package de.lukaszchalat.softwareEngeneeringProject.service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import de.lukaszchalat.softwareEngeneeringProject.enums.ErrorMessages;

public class UserRegistrationValidator 
{
	private boolean hasError                          = false;
	private Set<String> errorMessages                 = new LinkedHashSet<>();
	private static UserRegistrationValidator instance = null;
	
	private UserRegistrationValidator()
	{
		
	}
	
	public static UserRegistrationValidator getInstance()
	{
		if( instance == null )
		{
			return new UserRegistrationValidator();
		}
		
		return instance;
	}
	
	public boolean checkEmptyField( String fieldContent, String errorMessage )
	{
		if( fieldContent.isEmpty() )
		{
			this.hasError = true;
			
			addErrorMessage( errorMessage );
			
			return false;
		}
		
		return true;
	}
	
	public boolean checkFieldContentLength( String fieldContent, String errorMessage )
	{
		int length = fieldContent.trim().length();
		
		if( length > 0 && length < 3 )
		{
			this.hasError = true;
			
			addErrorMessage( errorMessage );
			
			return false;
		}
		
		return true;
	}
	
	public boolean checkEmailFormat( String email, String errorMessage )
	{
		Pattern pattern = Pattern.compile( "^([0-2][0-9]||3[0-1]).(0[0-9]||1[0-2]).([0-9][0-9])?[0-9][0-9]$" );
		Matcher matcher = pattern.matcher( email );
		
		if( email.trim().length() > 3 )
		{
			if( ! matcher.matches() )
			{
				this.hasError = true;
			
				addErrorMessage( errorMessage );
			
				return false;
			}
		}
			
		return true;
	}
	
	public boolean checkPhoneNumber( String phoneNumber, String errorMessage )
	{
		int length = phoneNumber.trim().length();
		
		if( length > 0 && length < 9 )
		{
			this.hasError = true;
			
			addErrorMessage( errorMessage );
		
			return false;
		}
		else if( length >= 9 )
		{
			try
			{
				Integer number = new Integer( phoneNumber );
			}
			catch( NumberFormatException ex )
			{
				this.hasError = true;
				
				addErrorMessage( errorMessage );
			
				return false;
			}
			
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
