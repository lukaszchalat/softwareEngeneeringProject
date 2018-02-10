package de.lukaszchalat.softwareEngeneeringProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JTable;

import de.lukaszchalat.softwareEngeneeringProject.dao.SearchingDetailsDAO;
import de.lukaszchalat.softwareEngeneeringProject.model.SearchingDetails;
import de.lukaszchalat.softwareEngeneeringProject.model.SearchingResult;
import de.lukaszchalat.softwareEngeneeringProject.service.DateConverter;
import de.lukaszchalat.softwareEngeneeringProject.service.SearchingDetailsValidator;
import de.lukaszchalat.softwareEngeneeringProject.view.SearchingDetailsView;
import de.lukaszchalat.softwareEngeneeringProject.view.UserControlPanelView;

public class SearchingDetailsController 
{
	private SearchingDetails searchingDetails;
	private SearchingDetailsView searchingDetailsView;
	private UserControlPanelView userControlPanelView;
	
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
				
				SearchingDetailsDAO serchingDetailsDAO = SearchingDetailsDAO.getInstance();
				
				Set<SearchingResult> results = serchingDetailsDAO.getResults( searchingDetails );
				
				JTable table = createTable( results );
				
				searchingDetailsView.dispose();
				
				userControlPanelView.addTable( table );
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
	
	private JTable createTable( Set<SearchingResult> results )
	{
		String[] columnNames = { "Hotel", "Adres", "Cena", "Przyjazd", "Odjazd", "ID" };
		
		String[][] data = new String[ results.size() ][columnNames.length];
		
		Iterator<SearchingResult> resultIterator = results.iterator();
		
		for( int i = 0; i < results.size(); i++ )
		{
			SearchingResult result = resultIterator.next();
			
			data[i][0] = result.getHotelName();
 		    data[i][1] = result.getHotelAddress();
		    data[i][2] = new Double( result.getPrice() ).toString();
		    data[i][3] = result.getStartingDate().toString();
		    data[i][4] = result.getFinalDate().toString();
		    data[i][5] = new Integer( result.getId() ).toString();
		}
		
		return new JTable( data, columnNames );
	}
	
	public void setUserControlPanelView( UserControlPanelView userControlPanelView )
	{
		this.userControlPanelView = userControlPanelView;
	}
}
