package session5;

public class Person {
    String name;
    int age;
    String gender;

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name);
    }

    void celebrateBirthday() {
        age++;
        System.out.println("Happy Birthday! I am now " + age + " years old.");
    }

    int calculateRetirementAge() {
        return 65 - age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
