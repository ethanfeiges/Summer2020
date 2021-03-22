package Day2;

import uw.syp.java.tools.Turtle;

public class TwistedTurtle extends Turtle 
{

	public static void main(String[] args)
	{
		
	}
	public TwistedTurtle ( int degrees )
	{
		move(degrees, 0);
	}
	public TwistedTurtle(int degrees, int steps ) // overload
	{
		move(degrees, steps);
	}
	public TwistedTurtle() // manual default constructor
	{
		
	}
	
	

}
