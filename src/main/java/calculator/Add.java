package calculator;

public class Add implements Operators {
	private double firstNumber, secondNumber;
	
	public Add(double firstNumber, double secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double calculate() {
		return firstNumber + secondNumber;
	}

	public String getCalculation() {
		return getFirstNumber() + " + " + getSecondNumber() + " = " + calculate();
	}

	public double getFirstNumber() {

		return firstNumber;
	}

	public double getSecondNumber() {

		return secondNumber;
	}

}
