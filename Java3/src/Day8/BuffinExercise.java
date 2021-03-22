package Day8;

import uw.syp.java.tools.Buffin;

public class BuffinExercise 
{

	public static void main(String[] args)
	{
		Worker[] lastThree  = new Worker[3];
		Buffin buff = new Buffin( "Workers.txt" );
		    
		
		if ( buff.isStdIn() )
		    {
		        System.out.println( "Workers.txt not found" );
		        System.exit( 1 );
		    }
		    
		    String  line = buff.readLine();
		    if (line!= null)
		    {
		    	lastThree[0] = new Worker(line);
		    	line = buff.readLine();
		    	if (line != null)
		    	{
		    		lastThree[2] = new Worker(line);
		    		line = buff.readLine();
		    		while (line != null)
		    		{
		    			lastThree[0] = lastThree[1];
		    			lastThree[1] = lastThree[2];
		    			lastThree[2] = new Worker( line);
		    			line = buff.readLine();
		    		}
		    	}
		    }
		    System.out.println("Last three");
		    for ( int inx = 0; inx < lastThree.length ; ++inx)
		    {
		    	Worker worker = lastThree[inx];
		    	String first = worker.getfirstName();
		    	String last = worker.getlastName();
		    	System.out.println(first + " " + last);
		    }
		
	}

}
