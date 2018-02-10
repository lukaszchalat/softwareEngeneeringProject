package de.lukaszchalat.softwareEngeneeringProject.main;

import de.lukaszchalat.softwareEngeneeringProject.controller.SearchingDetailsController;
import de.lukaszchalat.softwareEngeneeringProject.controller.UserLoginController;
import de.lukaszchalat.softwareEngeneeringProject.model.SearchingDetails;
import de.lukaszchalat.softwareEngeneeringProject.model.UserLogin;
import de.lukaszchalat.softwareEngeneeringProject.view.SearchingDetailsView;
import de.lukaszchalat.softwareEngeneeringProject.view.UserLoginView;

public class Main 
{

	public static void main( String[] args )
	{
		SearchingDetailsView view = new SearchingDetailsView();
		SearchingDetails model    = new SearchingDetails();
		
		SearchingDetailsController controller = new SearchingDetailsController( model, view );
		
		//view.setVisible( true );
		UserLogin userLogin         = new UserLogin();
		UserLoginView userLoginView = new UserLoginView();
		
		UserLoginController userLoginController = new UserLoginController( userLogin, userLoginView );
		
		userLoginView.setVisible( true );
		
	}

}
