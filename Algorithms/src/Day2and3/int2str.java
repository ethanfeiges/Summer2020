package Day2and3;

public class int2str
{

	public static void main(String[] args)
	{
		int value = 1023;
		String number = "";
		while(value != 0)
		{
			number = (char)(value % 10 + 48) + number;
			value /= 10;
			
		}
		System.out.println("Nunber " + number);
	}

}
