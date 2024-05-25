import java.util.stream.IntStream;

public class ChallengeArray {
        public static int[] arrayOfMultiples(int num, int length) {
                int[] result = IntStream.range(1, length + 1).map(i -> num * i).toArray();

                return result;
        }

        /*
         * on my machine with 16 logical processors, running tests 1 to 7 take:
         * normal version : ~50ms
         * CStyle version : ~10ms
         * of course, 95% of the runtime is taken by
         * whatever the first method is within the testing file.
         */
        public static int[] arrayOfMultiples_CStyle(int num, int length) {
                int[] result = new int[length];

                for (int i = 1; i <= length; ++i)
                        result[i - 1] = num * i;

                return result;
        }

}