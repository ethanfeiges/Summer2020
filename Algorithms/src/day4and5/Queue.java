package day4and5;

public class Queue
{
	private static final int DefaultSize = 10;
	private int[] array;
	private int head = 0;
	private int tail = 0;
	private int count = 0;

	public Queue()
	{
		this(DefaultSize);
	}

	public Queue(int initialSize)
	{
		array = new int[initialSize];
	}

	public int dequeue()
	{
		int rval = array[head];
		head++;
		count--;
		if (head >= array.length)
		{
			head = 0;
		}
		return rval;
	}

	public void enqueue(int value)
	{
		if (tail < array.length)
		{
			System.out.println(tail);
			array[tail] = value;
			tail++;
			count++;
		} 
		else
		{
			tail = 0;
		}

	}

	public int count()
	{
		return count;
	}

}
