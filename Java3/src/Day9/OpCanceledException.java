package Day9;

public class OpCanceledException extends Exception
{
	public OpCanceledException()
	{
		
	}
	public OpCanceledException(String msg)
	{
		super(msg);
	}
	public OpCanceledException(String msg, Throwable cause)
	{
		super(msg, cause);
	}
	public OpCanceledException(Throwable cause)
	{
		super(cause);
	}
	
}
