/**        
 * Name: Evan Wendt
 * Assignment #: 2
 * Class ID: 70642 (CSE 360 W (9:40-10:30AM) Seating ID: R E 1
 * Description: This simple calculator class is being used to obtain practice in using a version control system (github).
  */

package cse360assign2;

/**
 * This class can add or subtract from a total variable that is initially set at zero.
 * It can also return the history of operations done to the total and reset the 
 * total and the history shown to their initial values.
 * @author Evan Wendt
 * @version 2.0
 *
 */

public class AddingMachine {

	private int total;
	private String history = "";
	
	/**
	 * A constructor that sets the initial total to zero.
	 */
	
	public AddingMachine () {
		
		total = 0;  // not needed - included for clarity
		
	}
	
	/**
	 * Returns the current total
	 * @return current total
	 */
	
	public int getTotal () {
		
		return total;
		
	}
	
	/**
	 * Adds the parameter to the total
	 * Adds " + " and the parameter to the history string
	 * @param value is the integer added to the total
	 */
	
	public void add (int value) {
		
		total = total + value;
		
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the parameter from the total
	 * Adds " - " and the parameter to the history string
	 * @param value is the integer subtracted from the total
	 */
	
	public void subtract (int value) {
		
		total = total - value;
		
		history = history + " - " + value;
		
	}
	
	/**
	 * Returns the initial value "0" plus the history string containing all of operations done to the total.
	 */
		
	public String toString () {
		
		return "0" + history;
		
	}
	
	/**
	 * Resets the total to zero.
	 * Clears the history string of all previous operations done to the total.
	 */
	public void clear() {
		
		total = 0;
		
		history = "";
	
	}
	
}

