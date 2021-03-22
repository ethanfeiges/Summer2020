package Day6;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class PersonInfo
{
	public static void main (String[] args)
	{
		for (int inx = 0; inx <5; ++inx)
		{
			String input = JOptionPane.showInputDialog(null, "First name, last name, birthyear");
			
			if (input != null)
			{
				StringTokenizer tizer = new StringTokenizer(input, ",");
				
				if (tizer.countTokens() != 3)
				{
					JOptionPane.showMessageDialog(null, "error");
				}
				else
				{
					String first = tizer.nextToken();
					String last = tizer.nextToken();
					String birth = tizer.nextToken();
					birth = birth.trim();
					int iBirth = Integer.parseInt(birth);
					
					String output = first + " " + last + ": " + iBirth;
					JOptionPane.showMessageDialog(null, output);
				}
				
			}
		}
	}

}
