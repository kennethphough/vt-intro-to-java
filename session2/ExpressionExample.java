package session2;

public class ExpressionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        int d = 20;
        int e = 4;

        // Combining arithmetic operators
        int result = (a + b) * c - d / e;
        System.out.println("Result of expression: " + result);

        // Using relational and logical operators
        boolean isEligible = (a > b) && (c < d);
        System.out.println("Is eligible: " + isEligible);

        // Using parentheses for clarity
        int complexResult = (a * (b + c)) - (d / e);
        System.out.println("Complex result: " + complexResult);
    }
}
