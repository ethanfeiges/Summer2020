package day6and7;

public class linked
{
	class Node 
	{
	    public int Value;
	    public Node Next;
	  }

	  // Hard code the size for now.
	  private Node head;
	  private int count = 0;

	  public void push(int value) // pushes values over and adds to head
	  {
	    Node newNode = new Node();
	    newNode.Value = value;
		 if (head == null)
	    {
	    	head = newNode;
	    }
		 else
		 {
			 newNode.Next = head; // links newNode to previous head value. Loosens chain
			 head = newNode; // links top of the list to the newNode. Tightens chain
			 // KEEP ORDER!!!!
		 }
		 count++;
	  }
	  
	  
	  

	  public int pop() 
	  {
	    count--;
	    int rval = head.Value; // takes last pushed (because it's at the head)
	    head = head.Next; // moves head over
	    return rval;
	    
	  }

	  public int top() 
	  {
	    return head.Value;
	  }

	  public boolean isEmpty() 
	  {
	    return count == 0;
	  }

}
