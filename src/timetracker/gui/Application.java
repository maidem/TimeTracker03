package timetracker.gui;

import java.awt.*;
import javax.swing.*;

public class Application extends JFrame {
	
	JPanel contentPane;
	MainMenu mainMenu;
	LoginPanel loginPanel;
	UserPane userPane;
	ActivityPane activityPane;
	
	JPanel[] list;
	
	{
		
		contentPane = new JPanel();
		mainMenu = new MainMenu(this);
		loginPanel = new LoginPanel(mainMenu);
		userPane = new UserPane();
		activityPane = new ActivityPane();
		
		list = new JPanel[] {loginPanel, userPane, activityPane};

		
	}
	
	public Application() {

		setTitle("TimeTracker");
		setFocusable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		setContentPane(contentPane);
		

		this.setJMenuBar(mainMenu);
		mainMenu.setVisible(false);
		
		
		contentPane.add(userPane,gbc);
		userPane.setVisible(false);
		
		contentPane.add(activityPane, gbc);
		activityPane.setVisible(false);
		
		contentPane.add(loginPanel,gbc);
		
	}

}
