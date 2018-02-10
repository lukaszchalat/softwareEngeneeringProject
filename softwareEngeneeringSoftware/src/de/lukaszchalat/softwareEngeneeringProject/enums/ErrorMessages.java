package de.lukaszchalat.softwareEngeneeringProject.enums;

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
	
	// user login error messages 
	public static final String ERROR_USER_NAME_FIELD_IS_EMPTY         = "Pole 'Nazwa u¿ytkownika': Jest puste.";
	public static final String ERROR_USER_PASSWORD_FIELD_IS_EMPTY     = "Pole 'Has³o u¿ytkownika': Jest puste.";
	public static final String ERROR_USER_NAME_LENGTH_IS_TO_SHORT     = "Pole 'Nazwa u¿ytkownika': Nazwa musi siê sk³adaæ przynajmniej z 3 znaków.";
	public static final String ERROR_USER_PASSWORD_LENGTH_IS_TO_SHORT = "Pole 'Has³o u¿ytkownika': Has³o musi siê sk³adaæ przynajmniej z 3 znaków.";
	
	// user registration error messages
	public static final String ERROR_REGISTRATION_NICK_NAME_FIELD_IS_EMPTY         = "Pole 'Nazwa u¿ytkownika': To pole nie mo¿e byæ puste.";
	public static final String ERROR_REGISTRATION_PASSWORD_FIELD_IS_EMPTY          = "Pole 'Has³o': To pole nie mo¿e byæ puste.";
	public static final String ERROR_REGISTRATION_EMAIL_FIELD_IS_EMPTY             = "Pole 'Email': To pole nie mo¿e byæ puste.";
	public static final String ERROR_EMAIL_HAS_WRONG_FORMAT                        = "Pole 'Email': Podany format jest b³êdny.";
	public static final String ERROR_REGISTRATION_FIRST_NAME_FIELD_IS_TOO_SHORT    = "Pole 'Imiê': Imiê musi siê sk³adaæ przynajmniej z 3 znaków";
	public static final String ERROR_REGISTRATION_LAST_NAME_FIELD_IS_TOO_SHORT     = "Pole 'Nazwisko': Nazwisko musi siê sk³adaæ przynajmniej z 3 znaków";
	public static final String ERROR_REGISTRATION_NICK_NAME_FIELD_IS_TOO_SHORT     = "Pole 'Nazwa u¿ytkownika': Nazwa u¿ytkownika musi siê sk³adaæ przynajmniej z 3 znaków";
	public static final String ERROR_REGISTRATION_COUNTRY_FIELD_IS_TOO_SHORT       = "Pole 'Kraj': Kraj musi siê sk³adaæ przynajmniej z 3 znaków";
	public static final String ERROR_REGISTRATION_CITY_FIELD_IS_TOO_SHORT          = "Pole 'Miasto': Miasto musi siê sk³adaæ przynajmniej z 3 znaków";
	public static final String ERROR_REGISTRATION_PHONE_NUMBER_FIELD_IS_TOO_SHORT  = "Pole 'Numer telefonu': Imiê musi siê sk³adaæ przynajmniej z 9 cyfr";
	public static final String ERROR_REGISTRATION_PASSWORD_NAME_FIELD_IS_TOO_SHORT = "Pole 'Has³o': Has³o musi siê sk³adaæ przynajmniej z 3 znaków";
}
