package de.lukaszchalat.softwareEngeneeringProject.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import de.lukaszchalat.softwareEngeneeringProject.controller.SearchingDetailsController;
import de.lukaszchalat.softwareEngeneeringProject.model.Reservation;
import de.lukaszchalat.softwareEngeneeringProject.model.SearchingDetails;
import de.lukaszchalat.softwareEngeneeringProject.model.User;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class UserControlPanelView extends JFrame {

	private UserControlPanelView userControlPanelView = this;
	
	// panel
	private JPanel contentPane;
	
	// menu bar
	private JMenuBar menuBar;
	
	// menu
	private JMenu menu;
	
	// menu items
	private JMenuItem showReservations;
	private JMenuItem searchRoom;
	
	// jTable
	JTable table;
	
	private User user;


	public UserControlPanelView( User user ) 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 700, 400);
		this.setLocationRelativeTo( null );
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu = new JMenu("Menu");
		menuBar.add(menu);
		
		showReservations = new JMenuItem("Pokaz rezerwacje");
		searchRoom    = new JMenuItem("Szukaj pokoju");
		
		showReservations.addActionListener( new MenuListener() );
		searchRoom.addActionListener( new MenuListener() );
		
		menu.add( showReservations );
		menu.add( searchRoom );
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		
		this.setContentPane(contentPane);
		this.setVisible( true );
		
		this.user = user;
		
	}
	
	class MenuListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if( e.getSource() == showReservations )
			{
				System.out.println( "Pokaz rezerwacje" );
			}
			
			if( e.getSource() == searchRoom )
			{
				SearchingDetails model = new SearchingDetails();
				SearchingDetailsView view = new SearchingDetailsView(); 
				
				SearchingDetailsController controller = new SearchingDetailsController( model, view );
				
				controller.setUserControlPanelView( userControlPanelView );
			}
		}
		
	}
	
	public void addTable( JTable table )
	{
		table.removeColumn( table.getColumnModel().getColumn(5) );
		
		JScrollPane scroll = new JScrollPane( table );
		
		this.contentPane.add( scroll, BorderLayout.CENTER );
		this.contentPane.revalidate();
		this.contentPane.repaint();
		
		ListSelectionModel model = table.getSelectionModel();
		model.addListSelectionListener( new ListSelectionListener() 
		{
			public void valueChanged(ListSelectionEvent e) 
			{
				int row = table.getSelectedRow();
				
				if( JOptionPane.showConfirmDialog( null, "Rezerwowac ?", "Potwierdz", JOptionPane.YES_NO_CANCEL_OPTION) == 0 )
				{
					Reservation reservation = new Reservation();
					
					reservation.setRoomId( new Integer( table.getModel().getValueAt( row, 5 ).toString() ) );
					reservation.setUserId( user.getId() );
					reservation.setDateFrom( table.getModel().getValueAt( row, 3 ).toString() );
					reservation.setDateTo( table.getModel().getValueAt( row, 4 ).toString() );
					reservation.setRealized( false );
				}
			}
			
		});
	}

}
