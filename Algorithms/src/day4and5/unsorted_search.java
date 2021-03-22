package day4and5;

public class unsorted_search
{
	static int doSearchUnsorted(int[] arrayData, int searchValue)
	{
		int index = 0;
		while (index < arrayData.length)
		{
			index++;
			if (index < arrayData.length && index == searchValue)
			{
				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int[] arrayData = new int[]
		{ 2, 8, 15, -2, 31, 4, 1 };

		System.out.format("doSearch(5) = %d", doSearchUnsorted(arrayData, 5));
		System.out.println("");
		System.out.format("doSearch(31) = %d", doSearchUnsorted(arrayData, 31));
	}

}
