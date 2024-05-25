import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerDigits {
	
	public static int count(int n) {
		n = Math.abs(n);
		return Integer.toString(n).length();
	}

	/* many, many times faster runtime than the version with Integer.toString, but much less compact. */
	public static int count_CStyle(int n) {
		int digitCount;

		//special cases and preprocessing
		if (n == 0)
			return 1;

		if (n < 0)
			n = -n;

		//in order to get digitCount, count how many times you can divide by 10
		for (digitCount = 0; (n > 0); ++digitCount) {
			n = n / 10;
		}

		return digitCount;
	}

}