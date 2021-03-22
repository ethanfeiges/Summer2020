package Day7;

public class Person
{
	private static int numPersons = 0;
	
	
	private String firstName;
	private String lastName;
	public Person()
	{
		
		++numPersons;
		firstName = "none";
		lastName = "none";
	}
	public static int getNumPersons()
	{
		return numPersons;
	}
	
	public Person (String firstName, String lastName )
	{
		this.firstName = firstName; // always the name of the default executor
		this.lastName = lastName; 
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName( String name )
	{
		firstName = name;
	}
	// Overrides Object.toString()
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName( String name )
	{
		lastName = name;
	}
	public void setName( String first, String last)
	{
		firstName = first;
		lastName = last;
	}
	public String toString()
	{
		String result = lastName + " , " + firstName;
		return result;
	}

}
