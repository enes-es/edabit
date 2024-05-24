public class Challenge {
	public static int[][] squarePatch(int n) {
		int[][] result = new int[n][n];
        for (int i = 0; i < n; ++i)
        for (int j = 0; j < n; ++j)
            result[i][j] = i*n + j;

        return result;

	}

    public static void main(String args) {

        
    }
}