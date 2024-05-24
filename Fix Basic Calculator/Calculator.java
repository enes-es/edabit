
public class Calculator {

	public static Number basicCalculator(Number a, char operation, Number b) {
		
		if (a == null || b == null)
			throw new IllegalArgumentException("a or b have null values.");
		

			


		return 1;
	}
	
	public static Integer basicCalculator(Integer a, char operation, Integer b) {
	if (a instanceof Integer && b instanceof Integer) {
		int a_int = (int) a;
		int b_int = (int) b;

		if (operation == '+')
			return a_int + b_int;

		if (operation == '-')
			return a_int - b_int;

		if (operation == '/') {
			if (b_int == 0)
				return null;
			else
				return a_int / b_int;
		}
		if (operation == '*')
			return a_int * b_int;

	}
}