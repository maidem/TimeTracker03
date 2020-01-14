package timetracker;

import java.awt.EventQueue;

import timetracker.gui.Application;

public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application app = new Application();
					app.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});				
	}
}
