package Day9;

import uw.syp.java.tools.Buffin;

public class YearCounter
{

	public static void main(String[] args) throws BadWorkerException
	{
		int [] years = new int[7]; 
		
		Buffin buff = new Buffin ("Workers.txt ");
		if (buff.isStdIn())
		{
			System.out.println("File not found");
			System.exit(1);
		}
		
		String line = buff.readLine();
		while ( line != null)
		{
			Worker worker = new Worker(line);
			int year = worker.getbirthYear();
			int inx = 1996 - year;
			if ( year < 1991 ) // if born before 1991
				++years[0];  // put in element one
			else if ( year > 1995 )
				++years[years.length - 1];
			else 
				++years[year - 1990]; // if born in 1991, you'll be put in index 1. 1992 index 2 
			line = buff.readLine();
		}
		for ( int inx = 0; inx < years.length; ++ inx )
			System.out.print(years[inx] + " ");

	}

}
