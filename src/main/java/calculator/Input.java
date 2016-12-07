package calculator;
import java.util.Scanner;
import static java.lang.System.out;

public class Input {

	private static Scanner scan = new Scanner(System.in);
	private boolean status;
	
	public boolean on(){
		this.status = true;
		return status;
	}
	public boolean off(){
		this.status = false;
		return status;
	}
	
	public void start(){
		while(status){
			out.println("\n****CALCULON - 2.1****");
			out.println("\nGeben Sie eine Zahl ein: ");
			double firstNumber = Parser.toDouble(scan.next());
			double secondNumber = 0;
			Result result = new Result(firstNumber);
			
			String op = new String();
			
			while(!op.equals("=")){
				out.print("\nGeben Sie einen Opartor ein: ");
				for(Operator operator : Operator.values()){
					out.print(operator.toString() + " ");
				}
				op = scan.next();
				
				while(!Operator.contains(op)){
					out.println("\nBitte geben Sie einen korrekten Operator ein!");
					for(Operator operator : Operator.values()){
						out.print(operator.toString() + " ");
					}
					op = scan.next();
				}
				if(!op.equals("=")){
					out.println("\nGeben Sie die nächste Zahl ein:");
					secondNumber = Parser.toDouble(scan.next());
				}
				switch(op){
				case "+":
					Add add = new Add(firstNumber, secondNumber);
					firstNumber = add.calculate();
					out.println(add.getCalculation());
					out.println();
					break;
					
				case "-":
					Sub sub = new Sub(firstNumber, secondNumber);
					firstNumber = sub.calculate();
					out.println(sub.getCalculation());
					out.println();
					break;
					
				case "*":
					Multiply multiply = new Multiply(firstNumber, secondNumber);
					firstNumber = multiply.calculate();
					out.println(multiply.getCalculation());
					out.println();
					break;
					
				case "/":
					try {
						if(secondNumber == 0)
						{
							throw new Exception();
						}}
					catch(Exception e){
						while(secondNumber == 0){
							System.err.println("\nKeine Division durch 0!! Bitte geben Sie eine neue Zahl ungleich 0 ein: ");
							secondNumber = Parser.toDouble(scan.next());
						}
					}
					Div div = new Div(firstNumber, secondNumber);
					firstNumber = div.calculate();
					out.println(div.getCalculation());
					out.println();
					break;
					
				case "=":
					out.println(result.getResultString(firstNumber));
					break;
					
				default:
					out.println("Bitte neustarten!");
				}
				result.addResult(secondNumber, op);
			
			}
			
		}
	}
	
}
