/** Calculator will be able to add, subtract, multiply, divide, get the history, and show the total 
 * 
 * @author Manuel Aguirre
 * @version Feb 20,2016. (initial)
 */

package cse360assign3;

public class Calculator {
	/** total will be the running total of the performed operations */
	private int total;
	
	/** The Calculator constructor will initialize the total to 0 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** getTotal() will return the total of the operations performed 
	 * 
	 * @return total			total will be the total value
	 * */

	public int getTotal () {
		return total;
	}
	
	/** add(int value) will add @param value to the total
	 * 
	 * @param value				value is the value that the user wants added to the total
	 */
	
	public void add (int value) {
		total = total + value;		
	}
	
	/** subtract(int value) will subtract @param value from the total
	 * 
	 * @param value				value is the value that the user wants subtracted from the total
	 */
	
	public void subtract (int value) {
		total = total - value;
	}
	
	/** multiply(int value) will multiply @param value with the total
	 * 
	 * @param value				value is the value that the user wants the total multiplied by
	 */
	
	public void multiply (int value) {
		total = total * value;
	}
	
	/** divide(int value) will divide the total by @param value
	 * 
	 * @param value				value is the value that the user wants the total divided by
	 */
	
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/** getHistory() will return the history of the operations used so far
	 * 
	 * @return history			history will be all the operations performed so far				
	 */
	
	public String getHistory () {
		return "";
	}
}
