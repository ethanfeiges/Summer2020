package Day6;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class StateConception
{
	public static void main(String [] args)
	{
		for ( int inx = 0 ; inx < 5; ++inx)
		{
			String input = JOptionPane.showInputDialog(null, "Enter state, year of statehood separated by commas");
			
			if (input != null )
			{
				StringTokenizer tizer = new StringTokenizer(input, ",");
				if (tizer.countTokens() != 2)
					JOptionPane.showMessageDialog(null, "Error");
				else
				{
					String name = tizer.nextToken();
					String sYear = tizer.nextToken();
					sYear = sYear.trim();
					int iYear =  Integer.parseInt(sYear);
					String output = name + ": " + iYear;
					JOptionPane.showMessageDialog(null, output);
				}
			}
		}
	}
	
}
