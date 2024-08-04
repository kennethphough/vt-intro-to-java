import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
