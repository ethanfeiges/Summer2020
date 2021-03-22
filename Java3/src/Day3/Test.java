package Day3;

public class Test
{

	public static void main(String[] args)
	{
		Time time1 = new Time( 22, 59); // newMin = 81 % 60 = 21
		Time time2 = new Time(13, 22); // newHour = 35 + 1 = 36 % 24 = 12 
		Time time3 = time1.add(time2); // 1221
		
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
	}

}
