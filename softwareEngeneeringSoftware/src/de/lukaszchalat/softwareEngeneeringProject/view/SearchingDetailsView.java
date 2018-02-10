package de.lukaszchalat.softwareEngeneeringProject.view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import de.lukaszchalat.softwareEngeneeringProject.utilities.SearchingDetailsViewSettings;

public class SearchingDetailsView extends JFrame 
{
	// labels
	private JLabel locationLabel;
	private JLabel dateFromLabel;
	private JLabel dateToLabel;
	private JLabel floorLabel;
	private JLabel numberOfPeopleLabel;
	private JLabel numberOfRoomsLabel;
	private JLabel standardLabel;
	
	// input fields
	private JTextField locationInputField;
	private JTextField dateFromInputField;
	private JTextField dateToInputField;
	private JComboBox floorDropDownList;
	private JComboBox numberOfPeopleDropDownList;
	private JComboBox numberOfRoomsDropDownList;
	private JComboBox standardDropDownList;
	
	// buttons
	private JButton executeSearchingButton;
	
	// panel
	private JPanel panel;
	
	public SearchingDetailsView()
	{
		this.panel = new JPanel();
		this.panel.setLayout( null );
		
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.setSize( 400, 300 );
		
		addViewElements();
		
		this.add( this.panel );
		
	}
	
	private void addViewElements()
	{
		locationLabel       = new JLabel( SearchingDetailsViewSettings.LOCATION_LABEL );
		dateFromLabel       = new JLabel( SearchingDetailsViewSettings.DATE_FROM_LABEL );
		dateToLabel         = new JLabel( SearchingDetailsViewSettings.DATE_TO_LABEL );
		floorLabel          = new JLabel( SearchingDetailsViewSettings.FLOOR_LABEL );
		numberOfPeopleLabel = new JLabel( SearchingDetailsViewSettings.NUMBER_OF_PEOPLE_LABEL );
		numberOfRoomsLabel  = new JLabel( SearchingDetailsViewSettings.NUMBER_OF_ROOMS_LABEL );
		standardLabel       = new JLabel( SearchingDetailsViewSettings.STANDARD_LABEL );
		
		// set labels bounds
		locationLabel.setBounds( 10, 10, 150, 25);
		dateFromLabel.setBounds( 10, 35, 150, 25);
		dateToLabel.setBounds( 10, 60, 150, 25 );
		floorLabel.setBounds( 10, 85, 150, 25 );
		numberOfPeopleLabel.setBounds( 10, 110, 150, 25 );
		numberOfRoomsLabel.setBounds( 10, 135, 150, 25 );
		standardLabel.setBounds( 10, 160, 150, 25 );
		
		panel.add( locationLabel );
		panel.add( dateFromLabel );
		panel.add( dateToLabel );
		panel.add( floorLabel );
		panel.add( numberOfPeopleLabel );
		panel.add( numberOfRoomsLabel );
		panel.add( standardLabel );
		
		locationInputField         = new JTextField( 10 );
		dateFromInputField         = new JTextField( 10 );
		dateToInputField           = new JTextField( 10 );
		floorDropDownList          = new JComboBox( SearchingDetailsViewSettings.getFloors() );
		numberOfPeopleDropDownList = new JComboBox( SearchingDetailsViewSettings.getNumbersOfPeople() );
		numberOfRoomsDropDownList  = new JComboBox( SearchingDetailsViewSettings.getNumbersOfRooms() );
		standardDropDownList       = new JComboBox( SearchingDetailsViewSettings.getStandard() );
		
		locationInputField.setBounds( 170, 10, 150, 25 );
		dateFromInputField.setBounds( 170, 35, 150, 25 );
		dateToInputField.setBounds( 170, 60, 150, 25 );
		floorDropDownList.setBounds( 170, 85, 150, 25 );
		numberOfPeopleDropDownList.setBounds( 170, 110, 150, 25 );
		numberOfRoomsDropDownList.setBounds( 170, 135, 150, 25 );
		standardDropDownList.setBounds( 170, 160, 150, 25 );
		
		dateFromInputField.setText( SearchingDetailsViewSettings.DATE_FORMAT );
		dateToInputField.setText( SearchingDetailsViewSettings.DATE_FORMAT );
		
		panel.add( locationInputField );
		panel.add( dateFromInputField );
		panel.add( dateToInputField );
		panel.add( floorDropDownList );
		panel.add( numberOfPeopleDropDownList );
		panel.add( numberOfRoomsDropDownList );
		panel.add( standardDropDownList );
		
		executeSearchingButton = new JButton( "Szukaj" );
		
		executeSearchingButton.setBounds( 170, 200, 150, 25 );
		
		panel.add( executeSearchingButton );
		
	}
	
	public String getLocationString()
	{
		return this.locationInputField.getText();
	}
	
	public String getDateFromString()
	{
		return this.dateFromInputField.getText();
	}
	
	public String getDateToString()
	{
		return this.dateToInputField.getText();
	}
	
	public int getFloor()
	{
		return (int) this.floorDropDownList.getSelectedItem();
	}
	
	public int getNumberOfPeople()
	{
		return (int) this.numberOfPeopleDropDownList.getSelectedItem();
	}
	
	public int getNumberOfRooms()
	{
		return (int) this.numberOfRoomsDropDownList.getSelectedItem();
	}
	
	public String getStandard()
	{
		return (String) this.standardDropDownList.getSelectedItem();
	}
	
	public void addSearchingButtonListener( ActionListener actionListener )
	{
		this.executeSearchingButton.addActionListener( actionListener );
	}
}
