package Day2;

import uw.syp.java.tools.Turtle;
import uw.syp.java.tools.Turtlet;

public class ToddTheTurtle extends Turtle
{

	public static void main(String[] args)
	{
		ToddTheTurtle todd = new ToddTheTurtle();
		todd.paint(45, 128);
		todd.switchTo(Turtle.RED);
		todd.fillCircle(64);
		
		
		
	}
	public Turtlet paint(double angle, double steps )
	{
		say ("I don't like painting right now");
		super.paint(angle, steps);
		return null;
	}

}
