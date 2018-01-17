package de.lukaszchalat.softwareEngeneeringProject.utilities;

import java.util.ArrayList;
import java.util.List;

public class SearchingDetailsViewData 
{
	// labels
	public static final String LOCATION_LABEL = "Miejsce: ";
	public static final String DATE_FROM_LABEL = "Data przyjazdu: ";
	public static final String DATE_TO_LABEL = "Data odjazdu: ";
	public static final String FLOOR_LABEL = "Piêtro: ";
	public static final String NUMBER_OF_PEOPLE_LABEL = "Pokój dla: ";
	public static final String NUMBER_OF_ROOMS_LABEL = "Liczba pokoi: ";
	public static final String STANDARD_LABEL = "Standard: ";
	
	// searching limits
	public static final int MAX_NUMBER_OF_FLOORS = 20;
	public static final int MAX_NUMBER_OF_PEOPLE = 6;
	public static final int MAX_NUMBER_OF_ROOMS  = 4;
	public static final int MAX_STARS_NUMBER     = 5;
	
	public static final String DATE_FORMAT = "DD.MM.YYYY";
	
	public static String[] getFloors()
	{
		List<String> floors = new ArrayList<>();
		
		floors.add( "parter" );
		
		for( int i = 1; i <= MAX_NUMBER_OF_FLOORS; i++ )
		{
			floors.add( new Integer( i ).toString() + " piêtro" );
		}
		
		floors.add( "-" );
		
		return floors.toArray( new String[ MAX_NUMBER_OF_FLOORS + 2 ] );
	}
	
	public static String[] getNumbersOfPeople()
	{
		List<String> numbersOfPeople = new ArrayList<>();
		
		for( int i = 1; i <= MAX_NUMBER_OF_PEOPLE; i++ )
		{
			if( i == 1 ) numbersOfPeople.add( new Integer( i ).toString() + " goœcia" );
			else numbersOfPeople.add( new Integer( i ).toString() + " goœci" );
		}
		
		return numbersOfPeople.toArray( new String[ MAX_NUMBER_OF_PEOPLE ] );
	}
	
	public static String[] getNumbersOfRooms()
	{
		List<String> numbersOfRooms = new ArrayList<>();
		
		for( int i = 1; i <= MAX_NUMBER_OF_ROOMS; i++ )
		{
			if( i == 1 ) numbersOfRooms.add( new Integer( i ).toString() + " pokój" );
			else numbersOfRooms.add( new Integer( i ).toString() + " pokoje" );
		}
		
		return numbersOfRooms.toArray( new String[ MAX_NUMBER_OF_ROOMS ] );
	}
	
	public static String[] getStandard()
	{
		List<String> standard = new ArrayList<>();
		
		for( int i = 1; i <= MAX_STARS_NUMBER; i++ )
		{
			if( i == 1 ) standard.add( new Integer( i ).toString() + " gwiazdka" );
			else standard.add( new Integer( i ).toString() + " gwiazdki" );
		}
		
		return standard.toArray( new String[ MAX_STARS_NUMBER ] );
	}
}
