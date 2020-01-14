package timetracker.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import static timetracker.core.Engine.loggedIn;

public class MainMenu extends JMenuBar {

	JMenu control, tracker;
	JMenuItem users, activities, logout, exit, print, export;
	JMenuItem record, overview;
	
	{
		
		control = new JMenu("Verwaltung");
		users = new JMenuItem("Benutzer");
		activities = new JMenuItem("Aktivitäten");
		tracker = new JMenu("TimeTracker");
		logout = new JMenuItem("Abmelden");
		exit = new JMenuItem("Beenden");
		print = new JMenuItem("Drucken");
		export = new JMenuItem("Exportieren");
		record = new JMenuItem("Erfassung");
		overview = new JMenuItem("Übersicht");
		
	}
	
	
	public MainMenu(Application app) {

		control.add(users);
		control.add(activities);
		control.add(export);
		control.add(print);
		control.add(logout);
		control.add(exit);
		
		add(control);
		
		tracker.add(record);
		tracker.add(overview);
		
		add(tracker);
		
		users.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				for(JPanel x : app.list) x.setVisible(false);
				app.userPane.setVisible(true);
				
			}
			
		});
		
		activities.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				for(JPanel x : app.list) x.setVisible(false);
				app.activityPane.setVisible(true);		
			}			
		});
		
		logout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				for(JPanel x : app.list) x.setVisible(false);							
				app.loginPanel.setVisible(true);

				
				loggedIn = false;
			}				
			
		});
		
		exit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}				
			
		});
		
	}
	
}
