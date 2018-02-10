package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.lukaszchalat.softwareEngeneeringProject.dao.UserDAO;
import de.lukaszchalat.softwareEngeneeringProject.enums.ErrorMessages;
import de.lukaszchalat.softwareEngeneeringProject.model.User;
import de.lukaszchalat.softwareEngeneeringProject.model.UserLogin;
import de.lukaszchalat.softwareEngeneeringProject.service.UserBuilder;
import de.lukaszchalat.softwareEngeneeringProject.service.UserRegistrationValidator;
import de.lukaszchalat.softwareEngeneeringProject.view.UserLoginView;
import de.lukaszchalat.softwareEngeneeringProject.view.UserRegistrationView;

public class UserRegistrationController 
{
	private User user; 
	private UserRegistrationView userRegistrationView;
	
	public UserRegistrationController( User user, UserRegistrationView userRegistrationView )
	{
		this.user                 = user;
		this.userRegistrationView = userRegistrationView;
		
		this.userRegistrationView.addActionListener( new UserListener() );
	}
	
	class UserListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if( e.getSource() == userRegistrationView.getRegistrationButton() )
			{
				if( validateUserRegistration( userRegistrationView ) )
				{
					UserBuilder userBuilder = new UserBuilder();
					
					user = userBuilder.nickName( userRegistrationView.getUserNameString() )
					                  .password( userRegistrationView.getPasswordString() )
					                  .email( userRegistrationView.getEmailString() )
					                  .firstName( userRegistrationView.getFirstNameString() )
					                  .lastName( userRegistrationView.getLastNameString() )
					                  .city( userRegistrationView.getCityString() )
					                  .country( userRegistrationView.getCountryString() )
					                  .phoneNumber( userRegistrationView.getPhoneNumberString() )
					                  .build();
					
					UserDAO userAccess = UserDAO.getInstance();
					
					userAccess.createUser( user );
				}
			}
			
			if( e.getSource() == userRegistrationView.getResetButton() )
			{
				userRegistrationView.clearAllInputFields();
			}
			
			if( e.getSource() == userRegistrationView.getReturnButton() )
			{
				userRegistrationView.dispose();
				
				UserLoginController userLoginController = new UserLoginController( new UserLogin(), new UserLoginView() );
				
			}
		}
		
	}
	
	private boolean validateUserRegistration( UserRegistrationView view )
	{	
		UserRegistrationValidator userRegistrationValidator = UserRegistrationValidator.getInstance();
		
		// check empty fields
		userRegistrationValidator.checkEmptyField( view.getUserNameString(), ErrorMessages.ERROR_REGISTRATION_NICK_NAME_FIELD_IS_EMPTY );
		userRegistrationValidator.checkEmptyField( view.getPasswordString(), ErrorMessages.ERROR_REGISTRATION_PASSWORD_FIELD_IS_EMPTY );
		userRegistrationValidator.checkEmptyField( view.getEmailString(), ErrorMessages.ERROR_REGISTRATION_EMAIL_FIELD_IS_EMPTY );
		
		// check email format
		userRegistrationValidator.checkEmailFormat( view.getEmailString(), ErrorMessages.ERROR_EMAIL_HAS_WRONG_FORMAT );
		
		// check length
		userRegistrationValidator.checkFieldContentLength( view.getFirstNameString() , ErrorMessages.ERROR_REGISTRATION_FIRST_NAME_FIELD_IS_TOO_SHORT );
		userRegistrationValidator.checkFieldContentLength( view.getLastNameString(), ErrorMessages.ERROR_REGISTRATION_FIRST_NAME_FIELD_IS_TOO_SHORT );
		userRegistrationValidator.checkFieldContentLength( view.getUserNameString(), ErrorMessages.ERROR_REGISTRATION_NICK_NAME_FIELD_IS_TOO_SHORT );
		userRegistrationValidator.checkFieldContentLength( view.getCountryString(), ErrorMessages.ERROR_REGISTRATION_COUNTRY_FIELD_IS_TOO_SHORT );
		userRegistrationValidator.checkFieldContentLength( view.getCityString(), ErrorMessages.ERROR_REGISTRATION_CITY_FIELD_IS_TOO_SHORT );
		userRegistrationValidator.checkFieldContentLength( view.getPasswordString(), ErrorMessages.ERROR_REGISTRATION_PASSWORD_NAME_FIELD_IS_TOO_SHORT );
		
		// check phone number
		userRegistrationValidator.checkPhoneNumber( view.getPhoneNumberString(), ErrorMessages.ERROR_REGISTRATION_PHONE_NUMBER_FIELD_IS_TOO_SHORT );
		
		if( userRegistrationValidator.hasError() )
		{
			userRegistrationValidator.showErrorMessages();
			
			return false;
			
		} 
		
		return true;
		
	}
}
