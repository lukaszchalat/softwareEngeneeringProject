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
		boolean correct = true;
		
		SeachingDetailsValidator seachingDetailsValidator = SeachingDetailsValidator.getInstance();
		
		String location       = searchingDetailsView.getLocationString();
		String dateFromString = searchingDetailsView.getDateFromString();
		String dateToString   = searchingDetailsView.getDateToString();
		
		correct = seachingDetailsValidator.checkLocation( location );
		correct = seachingDetailsValidator.checkDate( dateFromString, 1 );
		correct = seachingDetailsValidator.checkDate( dateToString, 2 );
		
		if( correct == true )
		{
			seachingDetailsValidator.checkPeriod( dateFromString, dateToString );
		}
		
		if( seachingDetailsValidator.hasError() )
		{
			seachingDetailsValidator.showErrorMessages();
			
			return false;
			
		} 
		
		return true;
	}
}
