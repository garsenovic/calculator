package calculator;

public enum Operator {
	
	ADD("+"), SUBSTRACT("-"), MULTIPLY("*"), DIVISION("/"), RESULT("="), HELP("?");
	
	private String op;
	Operator(String op) {
		this.op = op;
	}
	
	public String toString(){
		return this.op;
	}

	public static boolean contains(String op2) {
		for(Operator operator : Operator.values()){
			if(operator.toString().equals(op2)){
				return true;
			}
		}
		return false;
	}
	

}
