class Employee {
    String name;
    double salary;

    // Constructor using this keyword
    Employee(String name, double salary) {
        this.name = name;       // object variable = parameter
        this.salary = salary;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("--------------------");
    }
}

// Main class
public class Main20 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 50000);
        Employee e2 = new Employee("Sneha", 60000);

        e1.display();
        e2.display();
    }
}