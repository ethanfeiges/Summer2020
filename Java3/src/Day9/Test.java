package Day9;
import java.util.Arrays;

import uw.syp.java.tools.Buffin;

public class Test 
{

	public static void main(String[] args) throws BadWorkerException
	{
		Worker[] workers = Worker.getWorkers();
		Arrays.sort(workers, new YearSorter() );
		for (Worker worker : workers ) // enhanced for statement
			System.out.println(worker);
		
	}
}