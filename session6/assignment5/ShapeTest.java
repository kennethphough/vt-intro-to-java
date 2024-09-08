package session6.assignment5;

public class ShapeTest {
    public static void main(String[] args) {
        // Create an array or list of Shape references
        Shape[] shapes = new Shape[3];

        // Add instances of Circle, Rectangle, and Triangle to the array
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        // Loop through the array and call the draw() method on each shape
        for (Shape shape : shapes) {
            shape.draw();  // This should call the overridden method
        }
    }
}
