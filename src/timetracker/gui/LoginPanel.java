package timetracker.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static timetracker.core.Engine.loggedIn;


public class LoginPanel extends JPanel {
	
	private JLabel lblHeader, lblError;
	private JButton subLogin;
	private JTextField tfUser, tfPassword;
	
	{
		lblHeader = new JLabel("Anmeldung");
		lblError = new JLabel();
		subLogin = new JButton("anmelden");
		tfUser = new JTextField();
		tfPassword = new JTextField();
	}
	
	public LoginPanel(JMenuBar mainMenu) {

		setSize(300,150);
		setPreferredSize(new Dimension(300,150));
		setMaximumSize(new Dimension(300,150));
		setBorder(BorderFactory.createEmptyBorder(5,30,5,30));
		setOpaque(true);
		setBackground(Color.blue);
		setLayout(new GridLayout(5,1,0,5));		

		lblHeader.setPreferredSize(new Dimension(150,25));
		lblHeader.setForeground(Color.cyan);
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		tfUser.setPreferredSize(new Dimension(200,25));
		tfPassword.setPreferredSize(new Dimension(200,25));
		subLogin.setPreferredSize(new Dimension(150,25));

		lblError.setPreferredSize(new Dimension(150,25));
		lblError.setBackground(Color.red);
		lblError.setForeground(Color.yellow);
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setVisible(false);
		
		add(lblHeader);
		add(tfUser);
		add(tfPassword);
		add(subLogin);
		add(lblError);
		setVisible(true);		

		subLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				
				if(tfUser.getText().isBlank() || tfPassword.getText().isBlank()) {				
					lblError.setVisible(true);
					lblError.setText("Alle Felder müssen ausgefüllt sein");
					
				}
				
				else if(!tfUser.getText().contentEquals("Admin")) {					
					lblError.setVisible(true);
					lblError.setText("Benutzername falsch");					
				}
				
				else if(!tfPassword.getText().contentEquals("adminadmin")) {				
					lblError.setVisible(true);
					lblError.setText("Passwort falsch");					
				}
				
				else {				
					lblError.setVisible(true);
					lblError.setText("Login erfolgreich");
					
					loggedIn = true;
					mainMenu.setVisible(true);
				}
				
				
				
			}
		});		
		
		
	}

}
