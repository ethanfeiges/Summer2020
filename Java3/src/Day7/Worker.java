package Day7;

import java.util.StringTokenizer;

public class Worker implements Comparable<Worker> // Comparable is interface that lets you compare things
// <> is what you're comparing against
{
	private final String 	firstName;
	private final String 	lastName;
	private final int 		birthYear;
	private final double 	payRate;
	private final double[] 	hoursPerDay;

	public Worker( String input ) throws IllegalArgumentException, NumberFormatException
	{
		StringTokenizer tizer = new StringTokenizer(input, " ,");
		if (tizer.countTokens() != 9 )
		{
			String msg = "Invalid input string";
			throw new IllegalArgumentException();
		}
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
		
		
		// Get each token from tizer;
		// Convert to double or int as necessary
		// Use tokens/converted values to initialize the instance variable 
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
	public String lastName()
	{
		return lastName;
	}
	public double birthYear()
	{
		return birthYear();
	}
	public double payRate()
	{
		return payRate();
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
