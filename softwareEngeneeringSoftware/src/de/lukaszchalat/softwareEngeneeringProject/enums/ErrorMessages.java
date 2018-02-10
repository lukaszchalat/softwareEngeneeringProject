package de.lukaszchalat.softwareEngeneeringProject.enums;

public class ErrorMessages 
{
	// searching details error messages
	public static final String ERROR_LOCATION_FIELD_IS_EMPTY        = "Pole 'Miejsce': Nie podano miejsca pobytu.";
	public static final String ERROR_LOCATION_LENGTH_IS_TOO_SHORT   = "Pole 'Miejsce': Podane miejsce wyszukiwania musi skladac sie z przynajmniej 3 liter.";
	public static final String ERROR_LOCATION_NAME_IS_WRONG         = "Pole 'Miejsce': Podane miejsce wyszukiwania musi skladac sie wylacznie z liter.";
	public static final String ERROR_DATE_FROM_FORMAT_IS_WRONG      = "Pole 'Data przyjazdu': Podany format daty jest niepoprawny. Prosz� poda� poprawny format np. 01.01.2018";
	public static final String ERROR_DATE_FROM_IS_WRONG             = "Pole 'Data przyjazdu': Podana data jest b��dna. Prosz� poda� poprawn� dat�.";
	public static final String ERROR_DATE_FROM_IS_TOO_OLD           = "Pole 'Data przyjazdu': Podana data jest przesz�a. Prosz� poda� chocia� dzisiejsz� dat�.";
	public static final String ERROR_DATE_TO_FORMAT_IS_WRONG        = "Pole 'Data odjazdu': Podany format daty jest niepoprawny. Prosz� poda� poprawny format np. 01.01.2018";
	public static final String ERROR_DATE_TO_IS_WRONG               = "Pole 'Data odjazdu': Podana data jest b��dna. Prosz� poda� poprawn� dat�.";
	public static final String ERROR_DATE_TO_IS_TOO_OLD             = "Pole 'Data odjazdu': Podana data jest przesz�a. Prosz� poda� chocia� dzisiejsz� dat�.";
	public static final String ERROR_DATE_TO_IS_NOT_AFTER_DATE_FROM = "Data przyjazdu musi by� wcze�niejsza od daty odjazdu.";
	
	// user login error messages 
	public static final String ERROR_USER_NAME_FIELD_IS_EMPTY         = "Pole 'Nazwa u�ytkownika': Jest puste.";
	public static final String ERROR_USER_PASSWORD_FIELD_IS_EMPTY     = "Pole 'Has�o u�ytkownika': Jest puste.";
	public static final String ERROR_USER_NAME_LENGTH_IS_TO_SHORT     = "Pole 'Nazwa u�ytkownika': Nazwa musi si� sk�ada� przynajmniej z 3 znak�w.";
	public static final String ERROR_USER_PASSWORD_LENGTH_IS_TO_SHORT = "Pole 'Has�o u�ytkownika': Has�o musi si� sk�ada� przynajmniej z 3 znak�w.";
	
	// user registration error messages
	public static final String ERROR_REGISTRATION_NICK_NAME_FIELD_IS_EMPTY         = "Pole 'Nazwa u�ytkownika': To pole nie mo�e by� puste.";
	public static final String ERROR_REGISTRATION_PASSWORD_FIELD_IS_EMPTY          = "Pole 'Has�o': To pole nie mo�e by� puste.";
	public static final String ERROR_REGISTRATION_EMAIL_FIELD_IS_EMPTY             = "Pole 'Email': To pole nie mo�e by� puste.";
	public static final String ERROR_EMAIL_HAS_WRONG_FORMAT                        = "Pole 'Email': Podany format jest b��dny.";
	public static final String ERROR_REGISTRATION_FIRST_NAME_FIELD_IS_TOO_SHORT    = "Pole 'Imi�': Imi� musi si� sk�ada� przynajmniej z 3 znak�w";
	public static final String ERROR_REGISTRATION_LAST_NAME_FIELD_IS_TOO_SHORT     = "Pole 'Nazwisko': Nazwisko musi si� sk�ada� przynajmniej z 3 znak�w";
	public static final String ERROR_REGISTRATION_NICK_NAME_FIELD_IS_TOO_SHORT     = "Pole 'Nazwa u�ytkownika': Nazwa u�ytkownika musi si� sk�ada� przynajmniej z 3 znak�w";
	public static final String ERROR_REGISTRATION_COUNTRY_FIELD_IS_TOO_SHORT       = "Pole 'Kraj': Kraj musi si� sk�ada� przynajmniej z 3 znak�w";
	public static final String ERROR_REGISTRATION_CITY_FIELD_IS_TOO_SHORT          = "Pole 'Miasto': Miasto musi si� sk�ada� przynajmniej z 3 znak�w";
	public static final String ERROR_REGISTRATION_PHONE_NUMBER_FIELD_IS_TOO_SHORT  = "Pole 'Numer telefonu': Imi� musi si� sk�ada� przynajmniej z 9 cyfr";
	public static final String ERROR_REGISTRATION_PASSWORD_NAME_FIELD_IS_TOO_SHORT = "Pole 'Has�o': Has�o musi si� sk�ada� przynajmniej z 3 znak�w";
}
