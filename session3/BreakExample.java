package session3;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number (negative number to exit): ");
            number = scanner.nextInt();
            if (number < 0) {
                break; // Exit loop if number is negative
            }
            System.out.println("You entered: " + number);
        }

        System.out.println("Loop terminated due to negative input.");
        scanner.close();
    }
}
