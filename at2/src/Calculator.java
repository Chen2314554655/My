public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double divide(int a, int b) {
        if (b == a) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a * 1.0 / b;
    }
}

