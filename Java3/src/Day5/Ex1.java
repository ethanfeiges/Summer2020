package Day5;

import uw.syp.java.tools.Turtle;

public class Ex1
{

	public static void main(String[] args)
	{
		Turtle bill = new Turtle();
		bill.fillBox(64,  64);
		test(bill);
		bill.fillBox(64, 64);
	}
	private static void test (Turtle param)
	{
		param.move(45,  128);
		param.switchTo(Turtle.GREEN);
	}

}
