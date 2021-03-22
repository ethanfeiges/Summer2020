package Day2and3;

import java.util.Scanner;

public class program
{

	public static void main(String[] args)
	{
		RPN rpn = new RPN();
		while (true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Calc> ");
			String str = scanner.nextLine();
			rpn.process(str);
			System.out.println("=" + rpn.result() );
			
		} 
		
	}

}
