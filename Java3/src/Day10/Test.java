package Day10;

import java.util.List;

import Day10.BadWorkerException;
import Day10.Worker;

public class Test
{

	public static void main(String[] args) throws BadWorkerException
	{
		List<Worker> workers = Worker.getWorkers();
		Worker oldest = workers.get(0);
		for (Worker worker : workers) 
		{
			if (worker.getbirthYear() < oldest.getbirthYear() )
				oldest = worker;
		}
		System.out.println(oldest);
			

	}

}
