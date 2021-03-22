package day4and5;

public class binary_search
{
	static int doBinarySearch(int[] arrayData, int searchValue)
	{
		int index = -1;
		int left = 0;
		int right = arrayData.length - 1;
		boolean found = false;
		while (left <= right && found == false)
		{
			int middle = (right + left) / 2;
			if (arrayData[middle] == searchValue)
			{
				index = middle;
				found = true;

			} else if (searchValue > arrayData[middle])
			{
				left = middle + 1;
			} else if (searchValue < arrayData[middle])
				right = middle - 1;

		}

		return index;

	}

	public static void main(String[] args)
	{
		int[] arrayData = new int[]
		{ 2, 8, 15, 22, 31, 44, 51 };

		System.out.format("doBinarySearch(5) = %d", doBinarySearch(arrayData, 5));
		System.out.println("");
		System.out.format("doBinarySearch(31) = %d", doBinarySearch(arrayData, 31));

	}

}
