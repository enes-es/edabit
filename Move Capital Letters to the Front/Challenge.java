import java.text.DateFormat;
import java.text.NumberFormat;

public class Challenge {

	// send a string filled with only English alphabet letters
	public static String capToFront(String str) {
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder capitalCase = new StringBuilder();

		for (int i = 0; i < str.length(); ++i) {
			if (isCapital(str.charAt(i))) {
				capitalCase.append(str.charAt(i));
			} else {
				lowerCase.append(str.charAt(i));
			}
		}

		capitalCase.append(lowerCase);

		String result = new String(capitalCase);

		return result;
	}

	static boolean isCapital(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			return true;

		else
			return false;
	}

	public static void main(String[] args) {
		
		System.out.println("\n\n\n" + NumberFormat.getInstance().getRoundingMode() + "\n\n\n");
		System.out.println("\n\n\n" + NumberFormat.getNumberInstance() + "\n\n\n");
		System.out.println("\n\n\n" + NumberFormat.getPercentInstance() + "\n\n\n");
		System.out.println("\n\n\n" + NumberFormat.getAvailableLocales() + "\n\n\n");


	}
}