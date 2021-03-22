package Day9;

import java.util.Arrays;

public class TestIntegerComparable implements Comparable<TestIntegerComparable> 
{
	private int myVal = 0;

	public static void main(String[] args) 
	{
		TestIntegerComparable obj1 = new TestIntegerComparable(7);
		TestIntegerComparable obj2 = new TestIntegerComparable(2);
		TestIntegerComparable obj3 = new TestIntegerComparable(3);
		TestIntegerComparable obj4 = new TestIntegerComparable(8);
		TestIntegerComparable obj5 = new TestIntegerComparable(9);
		
		//System.out.println(obj1.compareTo(obj5));
	
		TestIntegerComparable[] arr = {obj1, obj2, obj3, obj4, obj5};
		Arrays.sort(arr);
		
		for (int inx = 0; inx < arr.length; ++ inx)
			System.out.println(arr[inx]);
	}
	
	
	public TestIntegerComparable(int val)
	{
		myVal = val;
	}
	
	public String toString()
	{
		return "" + myVal;
	}
	
	
	
	public int compareTo(TestIntegerComparable obj)
	{
		int result = myVal - obj.myVal;
		return result;
	}

}
