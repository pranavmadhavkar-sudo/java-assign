abstract class Shape {
    
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

public class Main6 {
    public static void main(String[] args) {

        // ❌ This will give compilation error
        // Shape s = new Shape();

        // Circle object
        Circle c = new Circle(3);
        c.display_info();
        System.out.println("Circle Area = " + c.calculate_area());

        // Rectangle object
        Rectangle r = new Rectangle(4, 5);
        r.display_info();
        System.out.println("Rectangle Area = " + r.calculate_area());
    }
}