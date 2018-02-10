package de.lukaszchalat.softwareEngeneeringProject.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import de.lukaszchalat.softwareEngeneeringProject.enums.UserRegistrationSettings;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class UserRegistrationView extends JFrame 
{
	// labels
	private JLabel newUserRegistractionLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel countryLabel;
	private JLabel cityLabel;
	private JLabel emailLabel;
	private JLabel phoneNumberLabel;
	private JLabel passwordLabel;
	private JLabel userNameLabel;
	private JLabel hintLabel;
	
	// input fields
	private JTextField firstNameInputField;
	private JTextField lastNameInputField;
	private JTextField countryInputField;
	private JTextField cityInputField;
	private JTextField emailInputField;
	private JTextField phoneNumberInputField;
	private JPasswordField passwordInputField;
	private JTextField userNameInputField;
	
	// buttons
	private JButton registerButton;
	private JButton resetButton;
	private JButton returnButton;
	
	
	// panel
	private JPanel contentPane;
	

	public UserRegistrationView() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 800, 475);
		this.setLocationRelativeTo( null );
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		addViewElements();
		
		this.setContentPane(contentPane);
		
		this.setVisible( true );
	}
	
	private void addViewElements()
	{
		// set labels values
		newUserRegistractionLabel = new JLabel( UserRegistrationSettings.MAIN_LABEL );
		firstNameLabel            = new JLabel( UserRegistrationSettings.FIRST_NAME_LABEL );
		lastNameLabel             = new JLabel( UserRegistrationSettings.LAST_NAME_LABEL );
		countryLabel              = new JLabel( UserRegistrationSettings.COUNTRY_LABEL );
		cityLabel                 = new JLabel( UserRegistrationSettings.CITY_LABEL );
		emailLabel                = new JLabel( UserRegistrationSettings.EMAIL_LABEL );
		phoneNumberLabel          = new JLabel( UserRegistrationSettings.PHONE_NUMBER_LABEL );
		passwordLabel             = new JLabel( UserRegistrationSettings.PASSWORD_LABEL );
		userNameLabel             = new JLabel( UserRegistrationSettings.USER_NAME_LABEL );
		hintLabel                 = new JLabel( UserRegistrationSettings.HINT_LABEL );
		
		// set labels bounds
		newUserRegistractionLabel.setBounds(150, 50, 500, 50);
		firstNameLabel.setBounds(50, 125, UserRegistrationSettings.LABEL_LENGTH, UserRegistrationSettings.LABEL_WIDTH);
		lastNameLabel.setBounds(50, 180, UserRegistrationSettings.LABEL_LENGTH, UserRegistrationSettings.LABEL_WIDTH);
		countryLabel.setBounds(50, 235, UserRegistrationSettings.LABEL_LENGTH, UserRegistrationSettings.LABEL_WIDTH);
		cityLabel.setBounds(50, 290, UserRegistrationSettings.LABEL_LENGTH, UserRegistrationSettings.LABEL_WIDTH);
		emailLabel.setBounds(425, 125, UserRegistrationSettings.LABEL_LENGTH, UserRegistrationSettings.LABEL_WIDTH);
		phoneNumberLabel.setBounds(425, 180, UserRegistrationSettings.LABEL_LENGTH, UserRegistrationSettings.LABEL_WIDTH);
		passwordLabel.setBounds(425, 235, UserRegistrationSettings.LABEL_LENGTH, UserRegistrationSettings.LABEL_WIDTH);
		userNameLabel.setBounds(397, 290, 178, 30);
		hintLabel.setBounds(250, 400, 300, 30);
		
		// set labels horizontal alignment
		newUserRegistractionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lastNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		countryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phoneNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		hintLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		// set labels font
		newUserRegistractionLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		firstNameLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		lastNameLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		countryLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		cityLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		emailLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		phoneNumberLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		passwordLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		userNameLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		hintLabel.setFont(new Font("Verdana", Font.PLAIN, UserRegistrationSettings.LABEL_FONT_SIZE));
		
		// add all labels to the panel
		contentPane.add(newUserRegistractionLabel);
		contentPane.add(firstNameLabel);
		contentPane.add(lastNameLabel);
		contentPane.add(countryLabel);
		contentPane.add(cityLabel);
		contentPane.add(emailLabel);
		contentPane.add(phoneNumberLabel);
		contentPane.add(passwordLabel);
		contentPane.add(userNameLabel);
		contentPane.add(hintLabel);
		
		// set input fields
		firstNameInputField   = new JTextField();
		lastNameInputField    = new JTextField();
		countryInputField     = new JTextField();
		cityInputField        = new JTextField();
		emailInputField       = new JTextField();
		phoneNumberInputField = new JTextField();
		passwordInputField    = new JPasswordField();
		userNameInputField    = new JTextField();
		
		// set input fields bounds
		firstNameInputField.setBounds(225, 125, UserRegistrationSettings.INPUT_FIELD_LENGTH, UserRegistrationSettings.INPUT_FIELD_WIDTH);
		lastNameInputField.setBounds(225, 180, UserRegistrationSettings.INPUT_FIELD_LENGTH, UserRegistrationSettings.INPUT_FIELD_WIDTH);
		countryInputField.setBounds(225, 235, UserRegistrationSettings.INPUT_FIELD_LENGTH, UserRegistrationSettings.INPUT_FIELD_WIDTH);
		cityInputField.setBounds(225, 290, UserRegistrationSettings.INPUT_FIELD_LENGTH, UserRegistrationSettings.INPUT_FIELD_WIDTH);
		emailInputField.setBounds(600, 125, UserRegistrationSettings.INPUT_FIELD_LENGTH, UserRegistrationSettings.INPUT_FIELD_WIDTH);
		phoneNumberInputField.setBounds(600, 180, UserRegistrationSettings.INPUT_FIELD_LENGTH, UserRegistrationSettings.INPUT_FIELD_WIDTH);
		passwordInputField.setBounds(600, 235, UserRegistrationSettings.INPUT_FIELD_LENGTH, UserRegistrationSettings.INPUT_FIELD_WIDTH);
		userNameInputField.setBounds(600, 290, UserRegistrationSettings.INPUT_FIELD_LENGTH, UserRegistrationSettings.INPUT_FIELD_WIDTH);
		
		// set input fields columns
		firstNameInputField.setColumns(UserRegistrationSettings.INPUT_FIELD_COLUMNS);
		lastNameInputField.setColumns(UserRegistrationSettings.INPUT_FIELD_COLUMNS);
		countryInputField.setColumns(UserRegistrationSettings.INPUT_FIELD_COLUMNS);
		cityInputField.setColumns(UserRegistrationSettings.INPUT_FIELD_COLUMNS);
		emailInputField.setColumns(UserRegistrationSettings.INPUT_FIELD_COLUMNS);
		phoneNumberInputField.setColumns(UserRegistrationSettings.INPUT_FIELD_COLUMNS);
		passwordInputField.setColumns(UserRegistrationSettings.INPUT_FIELD_COLUMNS);
		userNameInputField.setColumns(UserRegistrationSettings.INPUT_FIELD_COLUMNS);
		
		// add all input fields to the panel
		contentPane.add(firstNameInputField);
		contentPane.add(lastNameInputField);
		contentPane.add(countryInputField);
		contentPane.add(cityInputField);
		contentPane.add(emailInputField);
		contentPane.add(phoneNumberInputField);
		contentPane.add(passwordInputField);
		contentPane.add(userNameInputField);
		
		// set buttons
		registerButton = new JButton( UserRegistrationSettings.REGISTRATION_BUTTON_LABEL );
		resetButton    = new JButton( UserRegistrationSettings.RESET_BUTTON_LABEL );
		returnButton   = new JButton( UserRegistrationSettings.RETURN_BUTTON_LABEL );
		
		// set buttons bounds
		registerButton.setBounds(150, 350, UserRegistrationSettings.BUTTON_LENGTH, UserRegistrationSettings.BUTTON_WIDTH);
		resetButton.setBounds(325, 350, UserRegistrationSettings.BUTTON_LENGTH, UserRegistrationSettings.BUTTON_WIDTH);
		returnButton.setBounds(500, 350, UserRegistrationSettings.BUTTON_LENGTH, UserRegistrationSettings.BUTTON_WIDTH);
		
		// set buttons font
		registerButton.setFont(new Font("Tahoma", Font.PLAIN, UserRegistrationSettings.BUTTON_FONT_SIZE));
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, UserRegistrationSettings.BUTTON_FONT_SIZE));
		returnButton.setFont(new Font("Tahoma", Font.PLAIN, UserRegistrationSettings.BUTTON_FONT_SIZE));
		
		// add all buttons to the panel
		contentPane.add(registerButton);
		contentPane.add(resetButton);
		contentPane.add(returnButton);	
	}
	
	public String getFirstNameString()
	{
		return this.firstNameInputField.getText();
	}
	
	public String getLastNameString()
	{
		return this.lastNameInputField.getText();
	}
	
	public String getCountryString()
	{
		return this.countryInputField.getText();
	}
	
	public String getCityString()
	{
		return this.cityInputField.getText();
	}
	
	public String getEmailString()
	{
		return this.emailInputField.getText();
	}
	
	public String getPhoneNumberString()
	{
		return this.phoneNumberInputField.getText();
	}
	
	public String getPasswordString()
	{
		return this.passwordInputField.getText();
	}
	
	public String getUserNameString()
	{
		return this.userNameInputField.getText();
	}
	
	public void clearAllInputFields()
	{
		this.firstNameInputField.setText( null );
		this.lastNameInputField.setText( null );
		this.countryInputField.setText( null );
		this.cityInputField.setText( null );
		this.emailInputField.setText( null );
		this.phoneNumberInputField.setText( null );
		this.passwordInputField.setText( null );
		this.userNameInputField.setText( null );
	}
	
	public void addActionListener( ActionListener actionListener )
	{
		this.registerButton.addActionListener( actionListener );
		this.resetButton.addActionListener( actionListener );
		this.returnButton.addActionListener( actionListener );
	}
	
	public JButton getRegistrationButton()
	{
		return this.registerButton;
	}
	
	public JButton getResetButton()
	{
		return this.resetButton;
	}
	
	public JButton getReturnButton()
	{
		return this.returnButton;
	}

}
