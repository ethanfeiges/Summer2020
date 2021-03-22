package Day8and9;

public class Set
{
	 private int count;
	  private int[] set = new int[10];
	  
	  public void add(int value)
	  {
	    int index = 0;
	    
	    for (; index < count; index++)
	    {
	      if (set[index] == value)
	      {
	        return;
	      }
	    }
	    
	    set[count] = value;
	    count++;
	  }
	  
	  public boolean isSubSet(Set otherSet)
	  {
	    
		
		  
		int index = 0;
		while (index < count)
	    {
			while (set[index] == otherSet.set[index] && index < count)
			{
				index++; // moves on until every value in otherSet is checked
			}
			return true; 
	    	
	    }
	    return false;
	  }
	  
	  public void print(String title)
	  {
	    System.out.print(title + "[");
	    
	    for (int index = 0; index < count; index++)
	    {
	      if (index > 0)
	      {
	        System.out.print(", ");
	      }
	      
	      System.out.print(set[index]);
	    }
	    System.out.println("]");
	  }

}
