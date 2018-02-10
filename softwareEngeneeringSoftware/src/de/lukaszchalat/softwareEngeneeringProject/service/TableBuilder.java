package de.lukaszchalat.softwareEngeneeringProject.service;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JTable;

import de.lukaszchalat.softwareEngeneeringProject.model.SearchingResult;

public class TableBuilder 
{
	public static JTable createResultTable( Set<SearchingResult> results )
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
	
	public static JTable createReservationTable()
	{
		return new JTable();
	}
}
