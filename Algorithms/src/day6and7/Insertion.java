package day6and7;

public class Insertion
{
	static void DoSort(int[] array)
	  {
		for( int index = 0; index < array.length; index++)
		{
			int temp = array[index];
			int j = index;
			while(j > 0 && array[j-1] < temp) // while (j > 0 && array[j-1] < temp for descending 
			{
				array[j] = array[j-1];
				j--;
			}
			array[j] = temp;
		}
	  }
	  
	  public static void main(String[] args)
	  {
	     int[] array = new int[] {10, 12, 4, 18, 32, 3, 9};

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();

	     DoSort(array);

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();
	  }



}
