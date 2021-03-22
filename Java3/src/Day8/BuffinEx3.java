package Day8;

import uw.syp.java.tools.Buffin;

public class BuffinEx3 {

	public static void main(String[] args) 
	{
		Buffin buff = new Buffin( "Workers.txt" );
	    if ( buff.isStdIn() )
	    {
	        System.out.println( "Workers.txt not found" );
	        System.exit( 1 );
	    }
	    
	    String  line = buff.readLine();
	    Worker storedworker = null;
	    if (line != null)
	    {
	    	storedworker = new Worker ( line );
	    	line = buff.readLine();
	    	while (line != null)
	    	{
	    		Worker testWorker = new Worker(line);
	    		
	    		// testworker - storedWorker
	    		if (testWorker.compareTo(storedworker) < 0) // If you find a new worker that is alphabetically less than stored worker,
	    			// TestWorker = A, StoredWorker = B (A-B) = -1 
	    			storedworker = testWorker; // Replace Stored Worker with Test Worker
	    		line = buff.readLine();
	    	}
	    }
	    String first = storedworker.getfirstName();
	    String last = storedworker.getlastName();
	    String name = last + "," + first;
	    System.out.println(name);

	}

}
