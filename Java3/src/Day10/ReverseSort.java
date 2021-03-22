package Day10;

import java.util.Comparator;

public class ReverseSort implements Comparator<String>
{
	public int compare( String str1, String str2 )
	{
		int result = -str1.compareTo(str2 );
		return result;
	}

}
