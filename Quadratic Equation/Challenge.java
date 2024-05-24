import java.lang.StrictMath;

public class Challenge {
    public static int quadraticEquation(int a, int b, int c) {
        // assumes that there'll always be two roots with the
        // same integer value within the range of int
        // quadratic formula: [-b +- sqrt(b^2 - 4ac)] / 2a
        int result;
        double discriminant;

        discriminant = Math.pow(b, 2) - (4 * a * c);

        result = (int) (-b + Math.sqrt(discriminant)) / (2 * a);

        return result;
    }
}