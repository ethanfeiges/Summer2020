package app;

public class Intexpression 
{
	private int leftInt;
	private int rightInt;
	
	public int sum()
	{
		return leftInt + rightInt;
	}
	public int product()
	{
		return leftInt * rightInt;
	}
	public int difference()
	{
		return leftInt - rightInt;
	}
	public int quotient()
	{
		return leftInt / rightInt;
	}
	
	public void setLeftInt(int val)
	{
		leftInt = val;
		
	}
	public void setRightInt(int val)
	{
		rightInt = val;
	}

}
