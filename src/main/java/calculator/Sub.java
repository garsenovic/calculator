package calculator;

public class Sub implements Operators {
	private double firstNumber, secondNumber;
	
	public Sub(double firstNumber, double secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double calculate() {
		return firstNumber - secondNumber;
	}

	public String getCalculation() {
		return getFirstNumber() + " - " + getSecondNumber() + " = " + calculate();
	}

	public double getFirstNumber() {

		return firstNumber;
	}

	public double getSecondNumber() {

		return secondNumber;
	}

}