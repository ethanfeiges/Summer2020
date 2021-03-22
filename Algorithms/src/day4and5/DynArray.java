package day4and5;

public class DynArray
{
	private static final int DefaultValue = 3;
	private int[] array;
	private int length;
	private int index;

	public DynArray()
	{
		this(DefaultValue);
	}

	public DynArray(int initialSize)
	{
		array = new int[initialSize];
		length = 0;
	}

	public int Length()
	{
		return length;
	}

	public int Capacity()
	{
		return array.length;
	}

	public int get(int index) throws Exception
	{
		if (index >= length)
		{
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}

	public void set(int index, int value) throws Exception
	{
		if (index >= length)
		{
			throw new IndexOutOfBoundsException();
		}
		array[index] = value;
	}

	public void Add(int v)
	{
		if(length >= array.length)
			ResizeArray(array.length + 3 );
		array[length] = v;
		v++;
	}

	private void ResizeArray(int capacity)
	{
		int[] newArr = new int[capacity];
		for(int i = 0; i < array.length; i++)
		{
			newArr[i] = array[i];
		}
		
	}

}
