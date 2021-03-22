package Day5;

import javax.swing.JOptionPane;

public class Ex6_1
{
	public static void main(String[] args)
	{
		double accum = 0;
		for ( int inx = 0; inx < 3; ++ inx)
			accum += average();
		double avg = accum / 3;
		System.out.print(avg);
	}
	public static double average()
	{
		
		String message = "Give me an integer";
		String input = JOptionPane.showInputDialog(null, message);
		double result = Double.parseDouble(input);
		return result;
	}

}
