package de.lukaszchalat.softwareEngeneeringProject.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.lukaszchalat.softwareEngeneeringProject.model.User;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class UserControlPanelView extends JFrame {

	// panel
	private JPanel contentPane;
	
	// menu bar
	private JMenuBar menuBar;
	
	// menu
	private JMenu menu;
	
	// menu items
	private JMenuItem showReservations;
	private JMenuItem doReservation;
	
	private User user;


	public UserControlPanelView( User user ) 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		this.setLocationRelativeTo( null );
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu = new JMenu("Menu");
		menuBar.add(menu);
		
		showReservations = new JMenuItem("Pokaz rezerwacje");
		doReservation    = new JMenuItem("Rezerwuj");
		
		showReservations.addActionListener( new MenuListener() );
		doReservation.addActionListener( new MenuListener() );
		
		menu.add( showReservations );
		menu.add( doReservation );
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		this.setContentPane(contentPane);
		this.setVisible( true );
		
		this.user = user;
		
		System.out.println( user.getId() );
	}
	
	class MenuListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if( e.getSource() == showReservations )
			{
				System.out.println( "Pokaz rezerwacje" );
			}
			
			if( e.getSource() == doReservation )
			{
				System.out.println( "Rezerwuj" );
			}
		}
		
	}

}
