package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import de.lukaszchalat.softwareEngeneeringProject.model.SearchingDetails;
import de.lukaszchalat.softwareEngeneeringProject.service.ValidationService;
import de.lukaszchalat.softwareEngeneeringProject.view.SearchingDetailsView;

public class SearchingDetailsController 
{
	private SearchingDetails searchingDetails;
	private SearchingDetailsView searchingDetailsView;
	
	public SearchingDetailsController( SearchingDetails searchingDetails, SearchingDetailsView searchingDetailsView )
	{
		this.searchingDetails     = searchingDetails;
		this.searchingDetailsView = searchingDetailsView;
		
		this.searchingDetailsView.addSearchingButtonListener( new SearchingListener() );
	}
	
	class SearchingListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			ValidationService validationService = ValidationService.getInstance();
			
			String location = searchingDetailsView.getLocationString();
			
			validationService.checkLocation( location ); 
			
			if( validationService.hasError() )
			{
				Set<String> errors = validationService.getErrorMessages();
				
				for( String error: errors )
				{
					System.out.println( error );
				}
			}
			
			
		}
		
	}
}
