package calculator;

public class Parser {

	public static double toDouble(final String string) {
		if(string == null){
			return 0.0;
		}
		try {
			return Double.parseDouble(string);
		}
		catch (final NumberFormatException nfe){
			System.err.println("Bitte geben Sie nur Zahlen ein");
			return 0.0;
		}
	}
}
