package Day7;

public class ArraysEx1
{

	public static void main(String[] args)
	{
		double[] dArr = {1.0, -0.5, 1.3, 2.8, 4.6, 5.1, 6.9, 7.0, 8.5};
		for ( int inx = 0; inx < dArr.length; ++inx) // runs until each shelf is checked
			// everything's shifted over so  use  < rather than <=
		{
			if (dArr[inx] > 0)
			{
				double square = Math.sqrt(dArr[inx]); // dar[inx] checks each "bookshelf" in the Array library
				System.out.println(square);
			}
			if (dArr[inx] < 0)
				System.out.println("Can't sqrt negative numbers");
		}

	}
}