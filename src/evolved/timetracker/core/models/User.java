package evolved.timetracker.core.models;

import java.util.ArrayList;

public class User {
	
	private String name;
	private ArrayList<Log<Activity>> logs;
	
	{
		logs = new ArrayList<Log<Activity>>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Log<Activity>> getLogs() {
		return this.logs;
	}


	
	
}
