package Day4;

public class MathOp
{
	MathOp()
	{
		// preventing it from being used publicly 
	}
	
	public static int powerOf2(int expo )
	{
		int power = 1;
		for ( ; expo > 0; --expo )
			power = power * 2;
		return power;
	}
	
	public static double powerOf2Alt ( double expo )
	{
		double power = 1;
		for ( double inx = 0; inx < expo ; ++ inx)
			power = power * 2;
		return power;
	}
	public static int average( int sum, int count )
	{
		int avg = 0;
		if (count != 0)
		{
			if ( sum >= 0 )
				avg = (sum + count / 2 ) / count;
			else 
				avg = ( sum - count / 2 ) / count;
		}
		return avg;
		
	}
	public static double circumference ( double radius )
	{
		double cir = Math.PI * radius * 2;
		return cir;
	}
	public static double area ( double radius )
	{
		double rea = Math.PI * Math.pow(radius, 2);
		return rea;
	}
	
}
