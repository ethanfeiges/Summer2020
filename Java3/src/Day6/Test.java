package Day6;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Test
{
	public static void main(String[] args)
	{
		String str = "48; 49; 50;";
		StringTokenizer tizer = new StringTokenizer(str, ";");
		System.out.println("# tokens: " + tizer.countTokens() );
		while (tizer.hasMoreTokens() )
			System.out.println(tizer.nextToken() );
	}

}
