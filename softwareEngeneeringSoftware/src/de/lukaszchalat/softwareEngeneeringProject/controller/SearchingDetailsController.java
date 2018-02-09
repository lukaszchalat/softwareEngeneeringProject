package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import de.lukaszchalat.softwareEngeneeringProject.model.SearchingDetails;
import de.lukaszchalat.softwareEngeneeringProject.service.DateConverter;
import de.lukaszchalat.softwareEngeneeringProject.service.SearchingDetailsValidator;
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
				searchingDetails = new SearchingDetails();
				
				searchingDetails.setLocation( searchingDetailsView.getLocationString() );
				searchingDetails.setDateFrom( DateConverter.convertFromStringToLocalDate( searchingDetailsView.getDateFromString() ) );
				searchingDetails.setDateTo( DateConverter.convertFromStringToLocalDate( searchingDetailsView.getDateToString() ) );
				searchingDetails.setFloor( searchingDetailsView.getFloor() );
				searchingDetails.setNumberOfPeople( searchingDetailsView.getNumberOfPeople() );
				searchingDetails.setNumberOfRooms( searchingDetailsView.getNumberOfRooms() );
				searchingDetails.setStandard( searchingDetailsView.getStandard() );
			}
		}
		
	}
	
	private boolean validateSearchingDetails( SearchingDetailsView view )
	{
		boolean correct = true;
		
		SearchingDetailsValidator searchingDetailsValidator = SearchingDetailsValidator.getInstance();
		
		String location       = searchingDetailsView.getLocationString();
		String dateFromString = searchingDetailsView.getDateFromString();
		String dateToString   = searchingDetailsView.getDateToString();
		
		correct = searchingDetailsValidator.checkLocation( location );
		correct = searchingDetailsValidator.checkDate( dateFromString, 1 );
		correct = searchingDetailsValidator.checkDate( dateToString, 2 );
		
		if( correct == true )
		{
			searchingDetailsValidator.checkPeriod( dateFromString, dateToString );
		}
		
		if( searchingDetailsValidator.hasError() )
		{
			searchingDetailsValidator.showErrorMessages();
			
			return false;
			
		} 
		
		return true;
	}
}
