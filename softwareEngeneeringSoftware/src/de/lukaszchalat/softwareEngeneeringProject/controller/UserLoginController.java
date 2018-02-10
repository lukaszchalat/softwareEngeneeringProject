package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.lukaszchalat.softwareEngeneeringProject.model.UserLogin;
import de.lukaszchalat.softwareEngeneeringProject.service.UserLoginValidator;
import de.lukaszchalat.softwareEngeneeringProject.view.UserLoginView;

public class UserLoginController 
{
	private UserLogin userLogin;
	private UserLoginView userLoginView;
	
	public UserLoginController( UserLogin userLogin, UserLoginView userLoginView )
	{
		this.userLogin     = userLogin;
		this.userLoginView = userLoginView;
		
		this.userLoginView.addActionListener( new UserListener() );
	}
	
	class UserListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)  
		{
			if( e.getSource() == userLoginView.getResetButton() )
			{
				userLoginView.clearAllInputFields();
			}
			
			if( e.getSource() == userLoginView.getLoginButton() )
			{
				if( validateUserLogin( userLoginView ) )
				{
					System.out.println( "Walidacja zakonczona sukcesem." );
				}
			}
		}
		
	}
	
	private boolean validateUserLogin( UserLoginView view )
	{
		boolean correct = true;
		
		UserLoginValidator userLoginValidator = UserLoginValidator.getInstance();
		
		correct = userLoginValidator.checkUserNameEmpty( view.getUserNameString() );
		correct = userLoginValidator.checkUserPasswordEmpty( view.getUserPasswordString() );
		correct = userLoginValidator.checkUserNameLength( view.getUserNameString() );
		correct = userLoginValidator.checkUserPasswordLength( view.getUserPasswordString() );
		
		if( userLoginValidator.hasError() )
		{
			userLoginValidator.showErrorMessages();
			
			return false;
			
		} 
		
		return true;
	}
}
