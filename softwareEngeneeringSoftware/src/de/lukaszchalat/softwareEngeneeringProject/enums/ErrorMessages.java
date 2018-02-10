package de.lukaszchalat.softwareEngeneeringProject.enums;

public class ErrorMessages 
{
	// searching details error messages
	public static final String ERROR_LOCATION_FIELD_IS_EMPTY        = "Pole 'Miejsce': Nie podano miejsca pobytu.";
	public static final String ERROR_LOCATION_LENGTH_IS_TOO_SHORT   = "Pole 'Miejsce': Podane miejsce wyszukiwania musi skladac sie z przynajmniej 3 liter.";
	public static final String ERROR_LOCATION_NAME_IS_WRONG         = "Pole 'Miejsce': Podane miejsce wyszukiwania musi skladac sie wylacznie z liter.";
	public static final String ERROR_DATE_FROM_FORMAT_IS_WRONG      = "Pole 'Data przyjazdu': Podany format daty jest niepoprawny. Prosze podac poprawny format np. 01.01.2018";
	public static final String ERROR_DATE_FROM_IS_WRONG             = "Pole 'Data przyjazdu': Podana data jest bledna. Prosze podac poprawna date.";
	public static final String ERROR_DATE_FROM_IS_TOO_OLD           = "Pole 'Data przyjazdu': Podana data jest przeszla. Prosze podac chociaz dzisiejsza date.";
	public static final String ERROR_DATE_TO_FORMAT_IS_WRONG        = "Pole 'Data odjazdu': Podany format daty jest niepoprawny. Prosze podac poprawny format np. 01.01.2018";
	public static final String ERROR_DATE_TO_IS_WRONG               = "Pole 'Data odjazdu': Podana data jest bledna. Prosze podac poprawna date.";
	public static final String ERROR_DATE_TO_IS_TOO_OLD             = "Pole 'Data odjazdu': Podana data jest przeszla. Prosze podac chociaz dzisiejsza date.";
	public static final String ERROR_DATE_TO_IS_NOT_AFTER_DATE_FROM = "Data przyjazdu musi byc wczesniejsza od daty odjazdu.";
	
	// user login error messages 
	public static final String ERROR_USER_NAME_FIELD_IS_EMPTY         = "Pole 'Nazwa uzytkownika': Jest puste.";
	public static final String ERROR_USER_PASSWORD_FIELD_IS_EMPTY     = "Pole 'Haslo uzytkownika': Jest puste.";
	public static final String ERROR_USER_NAME_LENGTH_IS_TO_SHORT     = "Pole 'Nazwa uzytkownika': Nazwa musi sie skladac przynajmniej z 3 znakow.";
	public static final String ERROR_USER_PASSWORD_LENGTH_IS_TO_SHORT = "Pole 'Haslo uzytkownika': Haslo musi sie skladac przynajmniej z 3 znakow.";
	
	// user registration error messages
	public static final String ERROR_REGISTRATION_NICK_NAME_FIELD_IS_EMPTY         = "Pole 'Nazwa uzytkownika': To pole nie moze byc puste.";
	public static final String ERROR_REGISTRATION_PASSWORD_FIELD_IS_EMPTY          = "Pole 'Haslo': To pole nie moze byc puste.";
	public static final String ERROR_REGISTRATION_EMAIL_FIELD_IS_EMPTY             = "Pole 'Email': To pole nie moze byc puste.";
	public static final String ERROR_EMAIL_HAS_WRONG_FORMAT                        = "Pole 'Email': Podany format jest bledny.";
	public static final String ERROR_REGISTRATION_FIRST_NAME_FIELD_IS_TOO_SHORT    = "Pole 'Imie': Imie musi sie skladac przynajmniej z 3 znakow";
	public static final String ERROR_REGISTRATION_LAST_NAME_FIELD_IS_TOO_SHORT     = "Pole 'Nazwisko': Nazwisko musi sie skladac przynajmniej z 3 znakow";
	public static final String ERROR_REGISTRATION_NICK_NAME_FIELD_IS_TOO_SHORT     = "Pole 'Nazwa uzytkownika': Nazwa uzytkownika musi sie skladac przynajmniej z 3 znakow";
	public static final String ERROR_REGISTRATION_COUNTRY_FIELD_IS_TOO_SHORT       = "Pole 'Kraj': Kraj musi sie skladac przynajmniej z 3 znakow";
	public static final String ERROR_REGISTRATION_CITY_FIELD_IS_TOO_SHORT          = "Pole 'Miasto': Miasto musi sie skladac przynajmniej z 3 znakow";
	public static final String ERROR_REGISTRATION_PHONE_NUMBER_FIELD_IS_TOO_SHORT  = "Pole 'Numer telefonu': Imie musi sie skladac przynajmniej z 9 cyfr";
	public static final String ERROR_REGISTRATION_PASSWORD_NAME_FIELD_IS_TOO_SHORT = "Pole 'Haslo': Haslo musi sie skladac przynajmniej z 3 znakow";
}
