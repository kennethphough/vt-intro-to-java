package session3.assignment2;

import java.util.Scanner;

public class AgeCategorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // TODO: Use if-else if-else statements to categorize the age
        // if the age is less than 12, print "You are a child."
        // else if the age is between 13 and 19, print "You are a teenager."
        // else if the age is between 20 and 64, print "You are an adult."
        // else, print "You are a senior."

        // Close the scanner
        scanner.close();
    }
}

