package session5;

public class MainClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Blue";
        myCar.model = "Ford Mustang";
        myCar.year = 2021;

        myCar.startEngine();
        myCar.stopEngine();
    }
}
