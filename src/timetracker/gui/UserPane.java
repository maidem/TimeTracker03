package timetracker.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class UserPane extends JPanel {

	
	public UserPane() {
		
		setSize(800,600);
		setPreferredSize(new Dimension(800,600));
		setMaximumSize(new Dimension(800,600));
		setMinimumSize(new Dimension(800,600));
		setOpaque(true);
		setBackground(Color.magenta);
		
	}
}
