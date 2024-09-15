package session7;

// Step 1: Define a custom exception class
public class InvalidAgeException extends Exception {
    
    // Step 2: Constructor with custom message
    public InvalidAgeException(String message) {
        super(message);  // Pass the message to the parent Exception class
    }
}

