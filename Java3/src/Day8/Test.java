package Day8;

import uw.syp.java.tools.Buffin;

public class Test
{

	public static void main(String[] args)
	{
		Buffin buff = new Buffin("Workers.txt");
		if (buff.isStdIn() )
		{
			System.out.println("File not found");
			System.exit(1);
		}
		String line = buff.readLine();
		System.out.print(line);

	}

}
