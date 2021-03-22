package Day2and3;

public class Stack
{
	  private int[] stack = new int[10];
	  private int sp = 0;

	  public void push(int value)
	  {
		  stack [sp] = value; // assign value
		  sp = sp + 1; // move up 1
		  if( sp >= stack.length)
		  {
			  int x = stack.length + 4;
			  int[] newstack = new int[x];
			  for(int index = 0; index < stack.length; index++)
				  newstack[index] = stack[index];
				  
			  stack = newstack;
			  stack[sp] = value;
			  sp++;
		  }
		  
	  }

	  public int pop()
	  {
	    sp = sp -1; // move down 1
	    return stack[sp];
	  }

	  public int top()
	  {
	    return stack[sp -1];
	  }

	  public boolean isEmpty()
	  {
	    return sp == 0;
	  }
	  
	  
	  

	
	

}
