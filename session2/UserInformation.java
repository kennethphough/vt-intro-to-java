package session2;

import java.util.Scanner;

public class UserInformation {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Collect user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your favorite number: ");
        double favoriteNumber = scanner.nextDouble();

        // Perform a simple calculation
        double luckyNumber = age * favoriteNumber;

        // Display the results
        System.out.println("\nHello, " + name + "!");
        System.out.println("Your age is " + age + " and your favorite number is " + favoriteNumber + ".");
        System.out.println("Your lucky number is " + luckyNumber + "!");

        // Close the scanner
        scanner.close();
    }
}
