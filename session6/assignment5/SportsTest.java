package session6.assignment5;

public class SportsTest {
    public static void main(String[] args) {
        // Create instances of Football and Basketball
        Playable football = new Football();
        Playable basketball = new Basketball();

        // Use polymorphism to call the play() method on both sports
        football.play();  // Calls Football's implementation of play()
        basketball.play();  // Calls Basketball's implementation of play()
    }
}
