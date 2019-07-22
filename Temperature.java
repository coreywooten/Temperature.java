package cw.temp;

import java.util.Scanner;

/**
 *  The Temperature class will hold temperatures in 
 * degrees Fahrenheit with methods of converting to
 *  Celsius and Kelvin. 
 * @author Corey Wooten
 * 
 */

public class Temperature 
{
	// Field
	private double ftemp;
	
	/*
	 * The constructor will set the input temperature 
	 * in degrees Fahrenheit.
	 */
	public Temperature(double degFarhenheit)
	{
		double degrFahr = 0;
		
		ftemp = 0;
	}
	
	/*
	 *  The mutator will set the temperature in
	 *  Fahrenheit as a double. 
	 */
	
	public void setFahrenheit(double degrFahr)
	{
		ftemp = degrFahr;
	}
	
	/*
	 * The accessor will return the value of the
	 * ftemp field in degrees F with no conversion.
	 */
	
	public double getFahrenheit( )
	{
		return ftemp;
	}
	
	/*
	 * The program can now return the values of the
	 *  temperature (F) in units Celsius and Kelvin.
	 */
	
	// Call and return degrees Celsius.
	public double getCelsius( )
	{
		return ((ftemp - 32) * (5/9));
	}
	// Call and return degrees Kelvin.
	public double getKelvin( )
	{
		return ((ftemp - 32) * (5/9 )+ 273);
	}
	
	public static void main(String[] args) 
	{
		// Create an object of the Scanner class. 
		Scanner keyboard = new Scanner(System.in);

		// Set the value of the input. 
		double fkey;

		// User input.

		System.out.print("Enter degrees in Fahrenheit: ");
		fkey = keyboard.nextDouble( );

		Temperature myTemp = new Temperature(fkey);

		// Display temperature conversions on the screen.
		System.out.println("Celsius: " + myTemp.getCelsius());
		System.out.println("Kelvin: " + myTemp.getKelvin());
	}
}
