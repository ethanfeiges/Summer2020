package Day3;

public class Time extends Object
{
	private int hour;
	private int min;
	
	public Time ( int hour, int min)
	{
		this.hour = hour;
		this.min = min;
	}
	public Time (Time time)
	{
		hour = time.hour;
		min = time.min;
	}
	
	public Time add( Time toAdd )
	{
		int newHour = hour + toAdd.hour; 
		int newMin = min + toAdd.min;
		newHour = newHour + newMin / 60; // gets total value of hours and PEMDAS
		newMin = newMin % 60; 
		newHour = newHour % 24;
		
		
		Time result = new Time( newHour, newMin );
		return result;
	}
	
	
	
	// Overrides Object.toString()
	public String toString()
	{
		String hours = Integer.toString(hour);
		String mins = Integer.toString(min);
		if ( hour < 10)
			hours = "0" + hours;
		if (min < 10)
			mins = "0" + mins;
		String time = "" + hours + mins;
		return time;
		
	}

}
