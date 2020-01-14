package evolved.timetracker.core.models;

import java.util.Date;

public class Log<T> {
	
	protected int id;
	protected Date start;
	protected Date end;
	protected T counterpart;
	
	public T getCounterpart() {
		return this.counterpart;
	}

}
