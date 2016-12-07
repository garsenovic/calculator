package calculator;

public class Result {
	private String result;
	
	public Result(double firstNumber){
		result = "" + firstNumber;
	}

	public void addResult(double secondNumber, String op) {
		result += (" " + op + " " + secondNumber);
		
	}

	public String getResultString(double firstNumber) {
		// TODO Auto-generated method stub
		return result + " = " + firstNumber;
	}
	

}
