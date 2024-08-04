/**
 * This class represents a simple Student with a name and age.
 */
public class Student {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.displayInfo();
    }
}