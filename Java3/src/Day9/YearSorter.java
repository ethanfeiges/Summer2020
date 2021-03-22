package Day9;

import java.util.Comparator;

public class YearSorter implements Comparator<Worker> 
{
	public int compare( Worker worker1, Worker worker2 )
	{
		int result = worker1.getbirthYear() - worker2.getbirthYear();
		return result;
	}

}
