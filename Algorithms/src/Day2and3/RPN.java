package Day2and3;

public class RPN
{
	public Stack stack = new Stack();
	public void process (String str)
	{
		try 
		{
			stack.push(Integer.parseInt(str)); 
		}
		catch(Exception e) 
		{
			int val2 = stack.pop();
			int val1 = stack.pop();
			if(str.equals("+"))
				stack.push(val1 + val2);
			if(str.equals("-"))
				stack.push(val1 - val2);
			if(str.equals("*"))
				stack.push(val1 * val2);
			if(str.equals("/")) 
			{
				stack.push(val1 / val2);
				double d = stack.top();
				System.out.println(d);
				
			}
				
		}
	
	}
	public double result()
	{
		return stack.top();
	}
	
}
