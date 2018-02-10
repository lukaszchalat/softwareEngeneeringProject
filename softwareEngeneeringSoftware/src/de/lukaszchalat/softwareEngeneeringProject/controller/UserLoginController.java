package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.lukaszchalat.softwareEngeneeringProject.model.UserLogin;
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
				System.out.println( "Resetuj!" );
			}
		}
		
	}
}
