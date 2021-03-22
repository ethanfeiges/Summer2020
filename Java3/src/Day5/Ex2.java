package Day5;

public class Ex2
{

	public static void main(String[] args)
	{
		double dval = Math.random() * 10;
		System.out.println(dval);
		int ival = (int)(dval + .5);
		System.out.println(ival);
		
		Ex2.equals(.200005, 2, .00001);
	}
	public static boolean equals(double val, double val2, double epsilon)
	{
		double v1 = val;
		double v2 = val2;
		double eps = epsilon;
		
		boolean equ = Math.abs(v2 - v1) < eps;
		System.out.println(equ);
		return equ;
		
	}

}
