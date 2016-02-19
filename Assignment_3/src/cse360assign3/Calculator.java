/**
 * This class allows for the user to add, subtract, multiply, divide and
 * return the total of the calculations.  In addition to that, the class 
 * also has the option to return the history i.e. a string representing all
 * the calculations entered.
 * 
 * @author - Abel Gonzalez for CSE360
 * @version - 1.4
 * Due: February 22, 2016 @ 4pm
 */

package cse360assign3;

public class Calculator {
private int total;
private String totalString;
	
	/**
	 * This constructs a calculator with the initial total of 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		totalString = "0";
	}
	
	
	/**
	 * This method returns the total after one or multiple calculations are done
	 * @return the total 
	 */
	public int getTotal () {
		return total;
	}
	
	
	/**
	 * This method adds an integer to the total
	 * @param value input integer
	 */
	public void add (int value) {
		
		total = total + value;
		totalString = totalString + " + " + String.valueOf(value);
		
	}
	
	
	/**
	 * This method subtracts an integer from the total
	 * @param value input integer
	 */
	public void subtract (int value) {
		
		total = total - value;
		totalString = totalString + " - " + String.valueOf(value);
	}
	
	
	/**
	 * This method multiplies an integer with the total
	 * @param value input integer
	 */
	public void multiply (int value) {
		
		total = total * value;
		totalString = totalString + " * " + String.valueOf(value);
	}
	
	
	/**
	 * This method divides the total by the input integer
	 * @param value input integer
	 */
	public void divide (int value) {
		
		if (value == 0)
		{
			total = 0;
		}	
		else
		{
			total = total / value;
		}
		
		totalString = totalString + " / " + String.valueOf(value);
	}
	
	
	/**
	 * This method returns a String of the history of this calculator
	 * @return a String representing the history 
	 */
	public String getHistory () {
		
		return totalString;
	}

}
