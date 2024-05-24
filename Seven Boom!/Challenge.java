import java.util.LinkedList;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Challenge {

	static final private String existsMessage = "Boom!";
	static final private String doesntExistMessage = "there is no 7 in the array";

	public static String sevenBoom(int[] arr) {	
		if (Arrays.toString(arr).contains("7")) {
			return existsMessage;
		}

		else return doesntExistMessage;
	}

	/* the other alternative function has ~3.5 times slower runtime,
	 * BUT you might learn a thing or two on where to use Streams and IntStreams..
	*/

	//use the abominable function below for a 'negligible' disadvantage in efficiency
	//at the benefit of.. what was it again?
	public static String sevenBoom_butFourTimesSlower(int[] arr) {
		// get string of digits

		int[] digits;

		for (int number : arr) {
			digits = Digitizer(number);

			if (IntStream.of(digits).anyMatch(i -> i == 7)) {
				return existsMessage;
			}

		}

		return doesntExistMessage;

	}

	// TODO: update visibiility to private
	public static int[] Digitizer(int number) {
		LinkedList<Integer> resultInReverse;
		Iterator<Integer> digitsIterator;
		ArrayList<Integer> digitsResult = new ArrayList<Integer>();

		resultInReverse = DigitizerHelper(number);
		digitsIterator = resultInReverse.descendingIterator();

		while (digitsIterator.hasNext()) {
			digitsResult.add(digitsIterator.next());
		}

		return digitsResult.stream().mapToInt(i -> i).toArray();
	}

	// TODO: update visibiility to private
	public static ArrayList<Integer> Digitizer_Experimental(int number) {
		LinkedList<Integer> resultInReverse;
		Iterator<Integer> digitsIterator;
		ArrayList<Integer> digitsResult = new ArrayList<Integer>();

		resultInReverse = DigitizerHelper(number);
		digitsIterator = resultInReverse.descendingIterator();

		while (digitsIterator.hasNext()) {
			digitsResult.add(digitsIterator.next());
		}

		return digitsResult;
	}

	// TODO: update visibiility to private
	public static LinkedList<Integer> DigitizerHelper(int number) {
		LinkedList<Integer> stack = new LinkedList<Integer>();

		// special cases
		if (number == 0) {
			stack.add(0);
		}

		// preprocessing
		if (number < 0)
			number = Math.abs(number);

		while (number > 0) {
			// add
			stack.add(number % 10);
			number = number / 10;
		}
		return stack;

	}

}