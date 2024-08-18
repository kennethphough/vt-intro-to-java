package session3.assignment2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // TODO: Display a menu with options for the user
            // 1. Add two numbers
            // 2. Subtract two numbers
            // 3. Multiply two numbers
            // 4. Divide two numbers
            // 5. Exit
            // Prompt the user to enter their choice

            choice = scanner.nextInt();

            // TODO: Use a switch statement to handle the user's choice
            // For each case (1-4), prompt the user to enter two numbers
            // Perform the corresponding arithmetic operation and display the result
            // Handle the case where the user chooses to exit

        } while (choice != 5); // TODO: Repeat the loop until the user chooses to exit

        // Close the scanner
        scanner.close();
    }
}
