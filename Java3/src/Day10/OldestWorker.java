package Day10;

import Day9.BadWorkerException;
import Day9.Worker;
import uw.syp.java.tools.Buffin;

public class OldestWorker
{

	public static void main(String[] args) throws BadWorkerException
	{
		new OldestWorker().execute();
	}
	
	
	private void execute() throws BadWorkerException
	{
		Worker [] workers = getWorkers();
		Worker oldest = workers.length > 0 ? workers[0]: null;
		int oldestYear = (oldest != null) ? oldest.getbirthYear() : 0; // conditional with three operands. Question mark separates operands
		// if true, oldestYear = oldest.getbirthYear()
		// if false oldestYear = oldest.getbirthYear()
		
		
		
		for (Worker worker : workers)
		{
			int workerYear = worker.getbirthYear();
			if ( workerYear < oldestYear ) // if the brought up worker is older than the oldest worker 
				{
					oldest = worker; // reassign oldest worker to the brought up worker
					oldestYear = workerYear;
				}
		}
		System.out.println(oldest);
	}
	
	
	
	
	
	private Worker[] getWorkers() throws BadWorkerException
	{
		Buffin buff = new Buffin("Workers.txt");
		if (buff.isStdIn() )
		{
			System.out.println("File not found");
			System.exit(1);
		}
		
		
		int counter = 0;
		while (buff.readLine() != null) // goes through all of the workers
			++ counter;
		
		Worker[] workers = new Worker[counter]; // puts the counter into an array
		buff.close();
		buff = new Buffin("Workers.txt");
		
		for (int inx = 0; inx < workers.length; ++inx)
		{
			String line = buff.readLine();
			workers[inx] = new Worker( line);
		}
		return workers;
	}

}
