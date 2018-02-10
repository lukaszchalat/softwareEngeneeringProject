package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import de.lukaszchalat.softwareEngeneeringProject.dao.UserDAO;
import de.lukaszchalat.softwareEngeneeringProject.model.User;
import de.lukaszchalat.softwareEngeneeringProject.model.UserLogin;
import de.lukaszchalat.softwareEngeneeringProject.service.UserLoginValidator;
import de.lukaszchalat.softwareEngeneeringProject.view.UserControlPanelView;
import de.lukaszchalat.softwareEngeneeringProject.view.UserLoginView;
import de.lukaszchalat.softwareEngeneeringProject.view.UserRegistrationView;

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
					UserDAO userDAO = UserDAO.getInstance();
					
					User user = userDAO.getUser( userLoginView.getUserNameString(), userLoginView.getUserPasswordString() );
					
					if( user != null )
					{
						userLoginView.dispose();
						
						UserControlPanelView controlPanel = new UserControlPanelView( user );
					}
					else
					{
						JOptionPane.showMessageDialog( null, "U¿ytkownik o tej nazwie nie istnieje!", "Uwaga", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
			
			if( e.getSource() == userLoginView.getCreateAccountButton() ) 
			{
				userLoginView.dispose();
				
				User user = new User();
				UserRegistrationView userRegistrationView = new UserRegistrationView();
				
				UserRegistrationController userRegistrationController = new UserRegistrationController( user, userRegistrationView );
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
