package session3.assignment2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number for which the multiplication table will be generated
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // TODO: Use a for loop to generate and print the multiplication table for the entered number
        // The loop should iterate from 1 to 10
        // For each iteration, calculate the product of the number and the loop counter
        // Print the result in the format "number x loop_counter = result"

        // Close the scanner
        scanner.close();
    }
}
