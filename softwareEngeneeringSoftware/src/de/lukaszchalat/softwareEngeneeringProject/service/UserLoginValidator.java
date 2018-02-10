package de.lukaszchalat.softwareEngeneeringProject.service;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import de.lukaszchalat.softwareEngeneeringProject.enums.ErrorMessages;

public class UserLoginValidator 
{
	private boolean hasError                   = false;
	private Set<String> errorMessages          = new LinkedHashSet<>();
	private static UserLoginValidator instance = null;
	
	private UserLoginValidator()
	{
		
	}
	
	public static UserLoginValidator getInstance()
	{
		if( instance == null )
		{
			return new UserLoginValidator();
		}
		
		return instance;
	}
	
	public boolean checkUserNameEmpty( String userName )
	{
		if( userName.trim().isEmpty() )
		{
			this.hasError = true;
			
			addErrorMessage( ErrorMessages.ERROR_USER_NAME_FIELD_IS_EMPTY );
			
			return false;
		}
		
		return true;
	}
	
	public boolean checkUserPasswordEmpty( String userPassword )
	{
		if( userPassword.trim().isEmpty() )
		{
			this.hasError = true;
			
			addErrorMessage( ErrorMessages.ERROR_USER_PASSWORD_FIELD_IS_EMPTY );
			
			return false;
		}
		
		return true;
	}
	
	public boolean checkUserNameLength( String userName )
	{
		int length = userName.trim().length();
		
		if( length > 0 && length < 3 )
		{
			this.hasError = true;
			
			addErrorMessage( ErrorMessages.ERROR_USER_NAME_LENGTH_IS_TO_SHORT );
			
			return false;
		}
		
		return true;
	}
	
	public boolean checkUserPasswordLength( String userPassword )
	{
		int length = userPassword.trim().length();
		
		if( length > 0 && length < 3 )
		{
			this.hasError = true;
			
			addErrorMessage( ErrorMessages.ERROR_USER_PASSWORD_LENGTH_IS_TO_SHORT );
			
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
