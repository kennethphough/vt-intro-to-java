package session3;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; // Skip numbers divisible by 3
            }
            System.out.println("Number: " + i);
        }
    }
}
