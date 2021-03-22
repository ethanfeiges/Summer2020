package day6and7;

public class Quicksort
{
	public static void main(String[] args)
	  {
	     int[] array = new int[] {10, 12, 4, 18, 32, 3, 9};

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();

	     Quicksort(array, 0, array.length-1);

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();
	  }
	
	
	
	static int Partition(int array[], int low, int high)
	{
		int left = 0;
		int right = 0;
		int pivot = 0;
		int temp = 0;
		left = low;
		right = high;
		pivot = array[low];
		while ( left < right )
		{
			while (left < right && array[left] <= pivot)
			{
				left++;
			}
			while(right >= left && array[right] > pivot)
			{
				right--;
			}
			
			if (left < right)
			// switch
			{
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
			
		}
		array[low] = array[right];
		array[right] = pivot;
		return right;
	}
	public static void Quicksort(int array[], int low, int high)
	{
		int pivotIndex;
		if (high > low )
		{
			pivotIndex = Partition(array, low, high);
			Quicksort(array, low, pivotIndex-1);
			Quicksort(array, pivotIndex +1, high);
		}
	}
	  
	
	
	


}
