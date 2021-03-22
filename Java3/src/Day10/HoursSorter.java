package Day10;

import java.util.Comparator;

import Day9.Worker;

public class HoursSorter implements Comparator<Worker>
{
	public int compare(Worker arg0, Worker arg1)
	{
		double hours0 = arg0.getHoursWorked();
		double hours1 = arg1.getHoursWorked();
		int result = 0;
		
		if ( hours0 < hours1 )
			result = -1;
		else if ( hours0 > hours1 )
			result = 1;
		else 
			result = 0;
		return result;
	}

}
