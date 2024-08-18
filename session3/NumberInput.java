package session3;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number (negative number to exit): ");
        number = scanner.nextInt();

        while (number >= 0) {
            System.out.println("You entered: " + number);

            // Prompt the user again
            System.out.print("Enter another number (negative number to exit): ");
            number = scanner.nextInt();
        }

        System.out.println("You entered a negative number. Exiting...");
        scanner.close();
    }
}
