package Day2;
import javax.swing.JOptionPane;
public class BasicGame
{
	private String secretWord = "duck";
	private String usersGuess;
	private int tries = 0;
	
	
	
	
	public void playOneGame()
	{
		tries = 0;
		askUsersFirstChoice();
		while ( shouldContinue() && (tries < 5) )
		{
			showUpdatedStatus();
			asksUsersNextChoice();
		}
		showFinalStatus();
	}

	public void playManyGames()
	{
		int again = 0;
		tries = 0;
		do
		{
			playOneGame();
			again = JOptionPane.showConfirmDialog( null, "Again" );
		}
		while ( again == JOptionPane.YES_OPTION && (tries < 5));
	}
	
	public void askUsersFirstChoice()
	{
		String prompt = "Guess the secret Word";
		usersGuess = JOptionPane.showInputDialog( null, prompt );
	}
	
	public void asksUsersNextChoice()
	{
		askUsersFirstChoice();
	}
	public boolean shouldContinue()
	{
		boolean rval = !usersGuess.equals(secretWord);
		return rval;
	}
	public void showUpdatedStatus()
	{
		String message = "Nope. Guess again.";
		secretWord = "turtle";
		tries += 1;
		System.out.println(tries);
		JOptionPane.showMessageDialog( null,  message);
	}
	public void showFinalStatus()
	{
		String message;
		if ( tries < 5)
		{
			message = "Congratulations! You win!";
		}
		else
			message = "Bad";
		JOptionPane.showMessageDialog(null, message);
	}
	

}
