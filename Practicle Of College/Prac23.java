public class Circle {
    private double radius;
    private double area;

    // Constructor that accepts a double value for the radius
    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    // Constructor that accepts an integer value for the radius
    public Circle(int radius) {
        this.radius = (double) radius;
        this.area = Math.PI * radius * radius;
    }

    // Getter method for the radius
    public double getRadius() {
        return radius;
    }

    // Getter method for the area
    public double getArea() {
        return area;
    }

    // Main method for testing the Circle class
    public static void main(String[] args) {
        // Create a Circle object using the double constructor
        Circle circle1 = new Circle(3.5);
        System.out.println("Circle 1 has radius " + circle1.getRadius() + " and area " + circle1.getArea());

        // Create a Circle object using the integer constructor
        Circle circle2 = new Circle(5);
        System.out.println("Circle 2 has radius " + circle2.getRadius() + " and area " + circle2.getArea());
    }
}
