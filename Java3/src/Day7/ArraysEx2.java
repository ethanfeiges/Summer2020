package Day7;

public class ArraysEx2
{
	public static void main(String[] args)
	{
		double[] dArr1 = {1, 2, 3, 4, 5};
		ArraysEx2.findLargest(dArr1);
		System.out.println(ArraysEx2.findLargest(dArr1));
	}
	public static double findLargest(double[] param  )
	{
		Double largestNumber = Double.MIN_VALUE; 
		// run a for loop, everytime you see a number greater than largest number, change largest number
		for ( int inx = 0; inx < param.length; ++inx ) 
		{
			if (largestNumber <= param[inx])
					largestNumber = param[inx];
		}
		return largestNumber;
	}
	

}
