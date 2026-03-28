class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}


class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area = " + area);
    }
}

public class Main10 {
    public static void main(String[] args) {

        Circle c = new Circle(3);
        c.display();
        c.calculateArea();

        Rectangle r = new Rectangle(4, 5);
        r.display();
        r.calculateArea();
    }
}