package Day2and3;

public class recursion1
{
	static int Fib(int fib)
	{
		if (fib == 0)
			return 0;
		if (fib == 1)
			return 1;
		return Fib(fib - 1) + Fib(fib -2);
	}
	

	public static void main(String[] args)
	{
		System.out.format("Fib(7) - %d:",Fib(7));

	}

}
