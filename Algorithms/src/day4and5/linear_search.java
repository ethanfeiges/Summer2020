package day4and5;

public class linear_search
{
	static int doSearch(int[] arrayData, int searchValue)
	{
		int index = 0;
		while (index < arrayData.length && arrayData[index] < searchValue)
		{
			index++;
		}
		if (index < arrayData.length && searchValue == arrayData[index])
		{
			return index;
		} else
		{
			return -1;
		}
	}

	public static void main(String[] args)
	{
		int[] arrayData = new int[]
		{ 2, 8, 15, 22, 31, 44, 51 };

		System.out.format("doSearch(5) = %d\n", doSearch(arrayData, 5));
		System.out.println("");
		System.out.format("doSearch(31) = %d\n", doSearch(arrayData, 31));
	}

}
