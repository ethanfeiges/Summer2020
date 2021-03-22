package Day3;

import java.util.Random;

import javax.swing.JOptionPane;

import Day2.BasicGame;

public class GuessNumber extends BasicGame
{
	private final int lowLimit;
	private final int highLimit;
	
	private Random rand;
	private int secretNumber;
	private int usersGuess;
	
	public GuessNumber(int low, int high)
	{
		lowLimit = low;
		highLimit = high;
		rand = new Random();
		
		
	}
	
	
	public void askUsersFirstChoice()
	{
		int diff = highLimit - lowLimit;
		secretNumber = rand.nextInt( diff ) + lowLimit; // + 1 makes range 0 to 100
		askUsersNextChoice();
	}
	
	
	
	public void askUsersNextChoice()
	{
		String msg = "Guess a number between " + lowLimit + " and " + highLimit;
		String str = JOptionPane.showInputDialog(null, msg );
		if ( str == null )
			usersGuess = -1;
		else 
			usersGuess = Integer.parseInt( str );
	}
	
	
	
	
	public boolean shouldContinue()
	{
		boolean rval = usersGuess != secretNumber;
		return rval;
	}
	
	
	
	public void showUpdatedStatus()
	{
		String msg = null;
		if ( usersGuess < secretNumber )
			msg = "Your guess was too low";
		else
			msg = "Your guess was too high";
		JOptionPane.showMessageDialog(null, msg);
	}

}
