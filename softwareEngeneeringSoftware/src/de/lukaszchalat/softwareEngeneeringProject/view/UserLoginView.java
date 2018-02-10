package de.lukaszchalat.softwareEngeneeringProject.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.lukaszchalat.softwareEngeneeringProject.enums.UserLoginViewSettings;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class UserLoginView extends JFrame {

	// labels
	private JLabel userLoginLabel;
	private JLabel userNameLabel;
	private JLabel userPasswordLabel;
	
	// input fields
	private JTextField userNameInputField;
	private JTextField userPasswordInputField;
	
	// buttons
	private JButton loginButton;
	private JButton resetButton;
	private JButton createAccountButton;
	
	// panel 
	private JPanel contentPane;

	public UserLoginView() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 800, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		addViewElements();	
		
		this.setContentPane(contentPane);
	}
	
	private void addViewElements()
	{
		// set label values
		userLoginLabel    = new JLabel( UserLoginViewSettings.USER_LOGIN_LABEL );
		userNameLabel     = new JLabel( UserLoginViewSettings.USER_NAME_LABEL );
		userPasswordLabel = new JLabel( UserLoginViewSettings.USER_PASSWORD_LABEL );
		
		// set label bounds
		userLoginLabel.setBounds(200, 100, 400, 74);
		userNameLabel.setBounds(100, 200, 250, 50);
		userPasswordLabel.setBounds(100, 275, 250, 50);
		
		// set label fonts
		userLoginLabel.setFont(new Font( UserLoginViewSettings.FONT, Font.PLAIN, UserLoginViewSettings.MAIN_LABEL_FONT_SIZE));
		userNameLabel.setFont(new Font( UserLoginViewSettings.FONT, Font.PLAIN, UserLoginViewSettings.LABEL_FONT_SIZE));
		userPasswordLabel.setFont(new Font( UserLoginViewSettings.FONT, Font.PLAIN, UserLoginViewSettings.LABEL_FONT_SIZE));
		userLoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		// add labels to the content panel
		contentPane.add(userLoginLabel);
		contentPane.add(userNameLabel);
		contentPane.add(userPasswordLabel);
		
		// set input fields
		userNameInputField     = new JTextField();
		userPasswordInputField = new JTextField();
		
		// set input label bounds
		userNameInputField.setBounds(350, 205, 250, 50);
		userPasswordInputField.setBounds(350, 280, 250, 50);
		userNameInputField.setColumns(10);
		userPasswordInputField.setColumns(10);
			
		// add input fields to the content panel
		contentPane.add(userNameInputField);
		contentPane.add(userPasswordInputField);
		
		// set buttons
		loginButton         = new JButton( UserLoginViewSettings.LOGIN_BUTTON_LABEL );
		resetButton         = new JButton( UserLoginViewSettings.RESET_BUTTON_LABEL );
		createAccountButton = new JButton( UserLoginViewSettings.CREATE_ACCOUNT_BUTTON_LABEL );
		
		// set button fonts
		loginButton.setFont(new Font( UserLoginViewSettings.FONT , Font.PLAIN, UserLoginViewSettings.BUTTON_FONT_SIZE));
		resetButton.setFont(new Font( UserLoginViewSettings.FONT, Font.PLAIN, UserLoginViewSettings.BUTTON_FONT_SIZE));
		createAccountButton.setFont(new Font( UserLoginViewSettings.FONT, Font.PLAIN, UserLoginViewSettings.BUTTON_FONT_SIZE));
		
		// set buttons bounds
		loginButton.setBounds(350, 350, 120, 30);
		resetButton.setBounds(480, 350, 120, 30);
		createAccountButton.setBounds(350, 400, 250, 30);
		
		contentPane.add(loginButton);
		contentPane.add(resetButton);
		contentPane.add(createAccountButton);
	}
	
	public String getUserNameString()
	{
		return this.userNameInputField.getText();
	}
	
	public String getUserPasswordString()
	{
		return this.userPasswordInputField.getText();
	}
	
	public JButton getLoginButton()
	{
		return this.loginButton;
	}
	
	public JButton getResetButton()
	{
		return this.resetButton;
	}
	
	public JButton getCreateAccountButton()
	{
		return this.createAccountButton;
	}
	
	public void addActionListener( ActionListener actionListener )
	{
		this.loginButton.addActionListener( actionListener );
		this.resetButton.addActionListener( actionListener );
		this.createAccountButton.addActionListener( actionListener );
	}
	
}
