package Day10;

public class BadWorkerException extends Exception
{
	public BadWorkerException()
	{
		super();
	}
	public BadWorkerException(String msg )
	{
		super(msg);
	}
	public BadWorkerException(String msg, Throwable cause )
	{
		super(msg, cause);
	}
	
	public BadWorkerException( Throwable cause )
	{
		super (cause);
	}

}
