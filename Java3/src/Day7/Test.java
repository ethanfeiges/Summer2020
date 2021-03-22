package Day7;

public class Test
{

	public static void main(String[] args)
	{
		Worker worky = new Worker("B, A, 1960, 2.50, 12, 16, 20, 23, 25");
		Worker borky = new Worker("A, B, 1950, 2.50, 12, 16, 20, 31, 30");
		System.out.println(worky.compareTo(borky));
	
	}

}
