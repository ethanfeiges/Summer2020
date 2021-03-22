package Day6;

import javax.swing.JOptionPane;

public class IOUtils
{
	private IOUtils()
	{
		
	}
	
	public static void say(String msg )
	{
		JOptionPane.showMessageDialog(null, msg);
		
	}
	public static String askLine(String prompt )
	{
		String line = JOptionPane.showInputDialog(null, prompt);
		return line;
	}
	
	
	
	// Returns operator input; Nan if the operator cancels
	public static double askDouble(String prompt )
	{
		String input = 
				JOptionPane.showInputDialog(null, prompt);
		
		
		double result = Double.NaN;
		if (input != null)
			result = Double.parseDouble(input);
		return result;
	}
	
	public static double reviseDouble(String prompt )
	{
		String input = JOptionPane.showInputDialog(null, prompt);
		
		try 
		{
			double result = Integer.parseInt(input); // goes to catch if not an int or cannot be parsed
			System.out.print("In try ");
			return result;
		}
		catch (NumberFormatException exc)
		{
			double result = Double.NaN;
			System.out.print("In catch  ");
			return result;
		}
		
		
	}
	
	
	
	// Returns operator input; Integer.MIN_VALUE if operator cancels
	public static int askInt (String prompt)
	{
		String input = 
				JOptionPane.showInputDialog(null, prompt);
		int result = Integer.MIN_VALUE;
		
		if ( input != null )
			result = Integer.parseInt(input); 
		return result;
	}
	
	
	public static int reviseInt(String prompt)
	{
		String input = JOptionPane.showInputDialog(null, prompt);
		try 
		{
			int result = Integer.parseInt(input); // is it an integer (goes to catch if cannot be parsed)
			return result;
		}
		catch (NumberFormatException exe)
		{
			int result = Integer.MIN_VALUE;   // catches it if not an integer
			JOptionPane.showMessageDialog(null, "error");
			return result;
		
		}
	}
	
	
	
	public static int askNearestInt(String prompt)
	{
		String input = JOptionPane.showInputDialog(null, prompt);
		double dNum = Double.parseDouble(input);
		int result = (int)(dNum + .5);
		return result;
	}
	
	
	
	public static int askNonNegInt(String prompt)
	{
		int result = -1; // sentinal value
		while (result < 0)
		{
			String num = JOptionPane.showInputDialog(null, prompt);
			
			try
			{
				result = Integer.parseInt(num);
				if (result < 0)
					JOptionPane.showMessageDialog(null, "That was not a good value");
				
			}
			
			catch (NumberFormatException exc) // if you don't enter an int at all (parse int throws an exception)
			{
				JOptionPane.showMessageDialog(null, "That was not a good value");
			}
			
		}
		
		return result;
	}
	

}
