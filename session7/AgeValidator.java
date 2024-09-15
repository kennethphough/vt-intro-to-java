package session7;

// Using the custom exception
public class AgeValidator {

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Step 3: Throw the custom exception with a meaningful message
            throw new InvalidAgeException("Age is too young to register.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.checkAge(15);  // Will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
