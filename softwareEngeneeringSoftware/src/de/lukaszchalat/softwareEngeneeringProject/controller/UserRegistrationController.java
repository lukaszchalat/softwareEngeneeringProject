package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.lukaszchalat.softwareEngeneeringProject.model.User;
import de.lukaszchalat.softwareEngeneeringProject.view.UserRegistrationView;

public class UserRegistrationController 
{
	private User user; 
	private UserRegistrationView userRegistrationView;
	
	public UserRegistrationController( User user, UserRegistrationView userRegistrationView )
	{
		this.user                 = user;
		this.userRegistrationView = userRegistrationView;
	}
	
	class UserListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			
		}
		
	}
}
