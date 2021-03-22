package app;

public class Test 
{
	

	public static void main(String[] args) 
	{
		Name name1 = new Name();
		Name name2 = new Name();
		name1.setFirstName("Firstly");
		name1.setLastName("Lastly");
		name2.setFirstName("Secondly");
		name2.setLastName("Yeet");
		
		
		System.out.println("name1 = " + name1.getFirstName());
		System.out.println("Name2 = " + name2.getFirstName());
		System.out.println("name2 = " + name2.getLastName());
		System.out.println("name 1 = " + name1.getLastName());
	}
	

}
