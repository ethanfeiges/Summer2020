package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import uw.syp.java.tools.Buffin;

public class Worker implements Comparable<Worker> // Comparable is interface that lets you compare things
//<> is what you're comparing against
{
	private final String 	firstName;
	private final String 	lastName;
	private final int 		birthYear;
	private final double 	payRate;
	private final double[] 	hoursPerDay;

	public Worker( String input ) throws BadWorkerException
	{
		StringTokenizer tizer = new StringTokenizer(input, " ,");
		if (tizer.countTokens() != 9 )
		{
			String msg = "Bad Input String; invalid number fields: " + input;
			throw new BadWorkerException(msg); // requires try and catch
		}
		
		try
		{
			firstName = tizer.nextToken();
			lastName = tizer.nextToken(); // space
			birthYear = Integer.parseInt(tizer.nextToken());
			payRate = Double.parseDouble(tizer.nextToken());
			hoursPerDay = new double[5]; // 
			hoursPerDay[0] = Double.parseDouble(tizer.nextToken()); // 5 days so it's an array. 
			hoursPerDay[1] = Double.parseDouble(tizer.nextToken()); // puts each weekday in its own slot in array
			hoursPerDay[2] = Double.parseDouble(tizer.nextToken());
			hoursPerDay[3] = Double.parseDouble(tizer.nextToken());
			hoursPerDay[4] = Double.parseDouble(tizer.nextToken());
		}
		catch(NumberFormatException exc)
		{
			String msg = "Invalid field value";
			throw new BadWorkerException(msg, exc);
		}
		
		
		
		
		// Get each token from tizer;
		// Convert to double or int as necessary
		// Use tokens/converted values to initialize the instance variable 
	}
	
	
	
	public static List<Worker> getWorkers() throws BadWorkerException
	{
		Buffin buff = new Buffin("Workers.txt");
		if (buff.isStdIn() )
		{
			System.out.println("File not found");
			System.exit(1); // forces program to terminate
		}
		
		List<Worker> workers = new ArrayList<>(); 
		String line = null;
		while ( ( line = buff.readLine()) != null)
			workers.add(new Worker (line) );
		buff.close();
		return workers;
	}
	public double getHoursWorked()
	{
		double hoursWorked = 0;
		for (double hours : hoursPerDay ) // enhanced for loop
			hoursWorked += hours; // increases total hours by each amount of hours worked per day
		return hoursWorked;
	}
	
	
	
	
	
	
	public double[] getHoursPerDay() // getters reveal private information 
	{
		return hoursPerDay;
	}
	public double getHoursPerDay(int day)
		throws ArrayIndexOutOfBoundsException
	{
		return hoursPerDay[day];
	}
	
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public int getbirthYear()
	{
		return birthYear;
	}
	public double getpayRate()
	{
		return payRate;
	}
	
	
	public String toString()
	{
		StringBuilder bldr = new StringBuilder();
		bldr.append(lastName).append(",  ").append(firstName).append(" birthYear = ").append(birthYear)
		.append(" PayRate ").append(payRate).append(" hoursPerDay={  " ); /// string builder returns itself
		for (int inx = 0; inx < hoursPerDay.length; ++ inx)
		{
			bldr.append(hoursPerDay[inx]).append(""); // appends the hours
		}
		return bldr.toString();
	}
	
	
	
	public int compareTo(Worker o) // Comparable sets up compareTo. Relative positioning of strings (What comes first "alphabetically")
	// Worker o is a parameter (Borky in test)
	{
		
		
		int result = this.lastName.compareTo(o.lastName); // compare last names first
		if (result == 0) // if equal
			result = this.firstName.compareTo(o.firstName); // compare first names
			
		// left minus right. Positive means left is greater than right (Borky - Worky)
		// executables are being passed into a method using "this"
		return result;
		
	

	}
	

}
