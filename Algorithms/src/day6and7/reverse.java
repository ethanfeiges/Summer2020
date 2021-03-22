package day6and7;

public class reverse
{
	static void DoReverse(int[] array)
	  {
		int leftIndex = 0;
		int rightIndex = array.length-1;
		while (leftIndex < rightIndex )
		{
			int temp = array[leftIndex];
			array[leftIndex] = array[rightIndex];
			array[rightIndex] = temp;
			leftIndex++;
			rightIndex--;
			
		}
	  }
	  
	  public static void main(String[] args)
	  {
	     int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();

	     DoReverse(array);

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();
	  }

}
