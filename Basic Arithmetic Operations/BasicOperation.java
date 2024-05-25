public class BasicOperation {
    public static int operation(String a, String b, String op) {
        int aInt;
        int bInt;

        aInt = Integer.parseInt(a);
        bInt = Integer.parseInt(b);

        switch (op) {
            case "add":
                return aInt + bInt;

            case "subtract":
                return aInt - bInt;

            case "multiply":
                return aInt * bInt;

            case "divide":
                if (bInt == 0)
                    return Integer.MIN_VALUE;
                else
                    return aInt / bInt;

            default:
                throw new IllegalArgumentException("Operation type op: " + op + "is unsupported");
        }

    }

}