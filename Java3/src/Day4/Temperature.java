package Day4;

public class Temperature
{
		
	private double celsius;
	
	public Temperature(double temp)
	{
		celsius = temp;		
	}
	public Temperature (double temp, String scale )
	{
		double myTemp = temp;
		if (scale.startsWith("F") )
			myTemp = toCelsius(temp);
		celsius = myTemp;
		// if scale starts with "F"
		// myTemp = convert my temp to celsius 
		// celsius = myTemp	
	}
	
	public double getCelsius()
	{
		return celsius;
	}
	
	public void setCelsius( double cels )
	{
		celsius = cels;
	}
	
	public double getFahrenheit()
	{
		double result = toFahrenheit(celsius);
		return result;
	}
	public void setFahrenheit( double fahr )
	{
		celsius = toCelsius(fahr);
	}
	
	private static double toFahrenheit( double cels)
	{
		double result = cels * 9 / 5 + 32;
		return result;
	}
	private static double toCelsius(double fahr)
	{
		double result = fahr * 5 / 9 - 32;
		return result;
	}
	
	

}
