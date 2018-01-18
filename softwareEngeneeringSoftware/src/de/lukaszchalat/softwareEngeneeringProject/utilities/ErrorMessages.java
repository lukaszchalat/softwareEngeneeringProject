package de.lukaszchalat.softwareEngeneeringProject.utilities;

public class ErrorMessages 
{
	// searching details error messages
	public static final String ERROR_LOCATION_FIELD_IS_EMPTY        = "Pole 'Miejsce': Nie podano miejsca pobytu.";
	public static final String ERROR_LOCATION_LENGTH_IS_TOO_SHORT   = "Pole 'Miejsce': Podane miejsce wyszukiwania musi skladac sie z przynajmniej 3 liter.";
	public static final String ERROR_LOCATION_NAME_IS_WRONG         = "Pole 'Miejsce': Podane miejsce wyszukiwania musi skladac sie wylacznie z liter.";
	public static final String ERROR_DATE_FROM_FORMAT_IS_WRONG      = "Pole 'Data przyjazdu': Podany format daty jest niepoprawny. Proszê podaæ poprawny format np. 01.01.2018";
	public static final String ERROR_DATE_FROM_IS_WRONG             = "Pole 'Data przyjazdu': Podana data jest b³êdna. Proszê podaæ poprawn¹ datê.";
	public static final String ERROR_DATE_FROM_IS_TOO_OLD           = "Pole 'Data przyjazdu': Podana data jest przesz³a. Proszê podaæ chocia¿ dzisiejsz¹ datê.";
	public static final String ERROR_DATE_TO_FORMAT_IS_WRONG        = "Pole 'Data odjazdu': Podany format daty jest niepoprawny. Proszê podaæ poprawny format np. 01.01.2018";
	public static final String ERROR_DATE_TO_IS_WRONG               = "Pole 'Data odjazdu': Podana data jest b³êdna. Proszê podaæ poprawn¹ datê.";
	public static final String ERROR_DATE_TO_IS_TOO_OLD             = "Pole 'Data odjazdu': Podana data jest przesz³a. Proszê podaæ chocia¿ dzisiejsz¹ datê.";
	public static final String ERROR_DATE_TO_IS_NOT_AFTER_DATE_FROM = "Data przyjazdu musi byæ wczeœniejsza od daty odjazdu.";
}
