package Day2;

public class ImportantPerson extends Person
{
	private String birthday;
	
	public ImportantPerson()
	{
		birthday = "none";
	}
	
	public ImportantPerson( String first, String last )
	{
		super (first, last);
		birthday = "none";
		
	}
	
	// Overriding Object.toString()
	public String toString()
	{
		String result = super.toString() + ": " + birthday;
		return result;
	}
	
	public void setBirthday(String birthday )
	{
		this.birthday = birthday;
	}
	public String setBirthday()
	{
		return birthday;
	}
	

}
