package Day2and3;

public class unrecursion
{
	public static int Factorial(int factorial) 
	{
	    int result = 1;
		while(factorial > 0) // using a loop to calculate
	    {
	    	result = result * factorial;
	    	factorial -= 1;
	    }
		return result;
	  }
	  

	public static void main(String[] args)
	{
		System.out.format("Factorial(5) - %d", Factorial(5));

	}

}
