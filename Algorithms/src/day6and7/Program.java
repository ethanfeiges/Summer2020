package day6and7;

public class Program
{

	public static void main(String[] args)
	{
		 linked linked = new linked();

		    linked.push(5);
		    linked.push(3);
		    linked.push(2);
		    linked.push(9);

		    System.out.format("The last value pushed was %d\n", linked.top());

		    while (!linked.isEmpty())
		    {
		      System.out.format("Popping %d\n", linked.pop());
		    }

	}

}
