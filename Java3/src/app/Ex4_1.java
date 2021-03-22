package app;

import javax.swing.JOptionPane;

public class Ex4_1 
{

	public static void main(String[] args) 
	{
		String message = "Please enter some characters";
		String c1 = JOptionPane.showInputDialog(null, message);
		if ( c1 != null )
		{
			String msg2 = "Please enter more characters";
			String c2 = JOptionPane.showInputDialog(null, msg2);
			if (c2 != null)
			{
				if (c1.equals(c2))
					System.out.println("Same!");
				else
					System.out.println("Different!");
			
			}
			else
				System.out.println("Stop fooling around");
				
				
				
		}
		else
			System.out.println("Stop fooling around");
		
		
	

	}

}
