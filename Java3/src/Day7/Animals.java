package Day7;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Animals
{

	public static void main(String[] args)
	{
		String prompt = "Enter an animal and a number" + 
	" separated by a space and/or a comma";
		String input = JOptionPane.showInputDialog(null, prompt);
		if (input != null)
		{
			StringTokenizer tizer = new StringTokenizer(input, " ,"); // delimiters being space and/or comma. Works if either a comma or space is missing
			if (tizer.countTokens() != 2 )
			{
				System.out.println("Wrong # of tokens");
			}
			else 
			{
				String animal = tizer.nextToken();
				String strNum = tizer.nextToken();
				double dblNum = Double.parseDouble(strNum);
				System.out.println(animal + ": " + dblNum);
			}
		}

	}

}
