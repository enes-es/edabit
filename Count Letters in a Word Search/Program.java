public class Program {
	public static int letterCounter(char[][] arr, char target) {
		int count = 0;
		final int wordCount = 5; // arr will always have 5 sub-arrays.

		
		for (char[] word: arr){
			for (char ch : word) {
				if (ch == target)
					++count;
			}
		}

		return count;
	}
}