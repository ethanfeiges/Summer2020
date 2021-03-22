package Day7;

import java.awt.Color;

import uw.syp.java.tools.Turtle;

public class ArraysEx3
{
	public static void main(String[] args)
	{
		Color[] colors =
		{		
				Turtle.BLACK, 
				Turtle.BLUE,
				Turtle.GRAY,
				Turtle.GREEN,
				Turtle.MAGENTA,
				Turtle.RED,
				Turtle.YELLOW,
				Turtle.PINK,
				Turtle.WHITE,
				Turtle.ORANGE,
		};
		
		Turtle[] turtles = new Turtle[colors.length];
		for (int inx = 0; inx < colors.length; ++ inx)
		{
			turtles[inx] = new Turtle();
		}
		for (int inx = 0; inx < colors.length; ++ inx)
		{
			turtles[inx].switchTo(colors[inx] );
			turtles[inx].paint(inx * 20, (inx + 1) * 25);
		}
		
	}

}
