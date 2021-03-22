package Day3;

import java.util.Random;

public class RandomDemo
{
	 

	public static void main(String[] args)
	{
		Random randy = new Random();
		for ( int inx = 0; inx < 10 ; ++inx )
			System.out.println(randy.nextInt(10) ); //  [ 0, 10)
		
		
		
		Random handy = new Random();
		for ( int inx = 0; inx < 10; ++inx )
			System.out.print(handy.nextInt(11 ) - 5 + " "); // -5 subtracts lowest and highest number with the range
		System.out.println();
		
		for ( int inx = 0; inx < 10; ++inx )
			 System.out.print(handy.nextInt(11)* 2 + 30  + " ");
		System.out.println();
			
		
		
		
		System.out.println();
		
		

		
		
	}
}
