package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import de.lukaszchalat.softwareEngeneeringProject.model.SearchingDetails;
import de.lukaszchalat.softwareEngeneeringProject.service.SeachingDetailsValidator;
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
			if( validateSearchingDetails( searchingDetailsView ) )
			{
				
			}
		}
		
	}
	
	private boolean validateSearchingDetails( SearchingDetailsView view )
	{
		SeachingDetailsValidator seachingDetailsValidator = SeachingDetailsValidator.getInstance();
		
		String location       = searchingDetailsView.getLocationString();
		String dateFromString = searchingDetailsView.getDateFromString();
		String dateToString   = searchingDetailsView.getDateToString();
		
		if( seachingDetailsValidator.checkLocation( location )
		 && seachingDetailsValidator.checkDate( dateFromString, 1 )
		 && seachingDetailsValidator.checkDate( dateToString, 2 ) )
		{
			
		}
		
		if( seachingDetailsValidator.hasError() )
		{
			Set<String> errors = seachingDetailsValidator.getErrorMessages();
			
			errors.forEach( error -> System.out.println( error ) );
			
			return false;
			
		} 
		
		return true;
	}
}
