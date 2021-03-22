package Day5;

import javax.swing.JOptionPane;

public class Ex6_2
{

	public static void main(String[] args)
	{
		double dollarsPerEuro = getDouble("Dollars per Euro");
		double eurosPerLiter = getDouble("Euros per Liter? ");
		double litersPerGallon = 1/.264;
		double dollarsPerGallon = dollarsPerEuro * eurosPerLiter * litersPerGallon;
		String msg = "Dollars per Gallon in Germany: " + dollarsPerGallon;
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
	private static double getDouble(String prompt)
	{
		String sNum = JOptionPane.showInputDialog(prompt);
		double num = Double.parseDouble(sNum);
		return num;
		
		
	}

}
