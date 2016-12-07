package calculator;

public interface Operators {

	/**
	 * 
	 * @return - returns the result
	 */
	public double calculate();
	
	/**
	 * 
	 * @return - returns the calculation with result
	 */
	public String getCalculation();
	/**
	 * 
	 * @return - returns the first number of the calculation
	 */
	public double getFirstNumber();
	
	/**
	 * 
	 * @return - returns the second number of the calculation
	 */
	public double getSecondNumber();
}
