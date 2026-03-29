abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    void calculateBonus() {
        double bonus = 0.20 * salary;
        System.out.println(name + " (Manager) Bonus = " + bonus);
    }
}

class Developer extends Employee {
    double salary;
    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    void calculateBonus() {
        double bonus = (0.10 * salary) + incentive;
        System.out.println(name + " (Developer) Bonus = " + bonus);
    }
}

public class Main13 {
    public static void main(String[] args) {

        Employee e1 = new Manager("Rahul", 101, 50000);
        Employee e2 = new Developer("Amit", 102, 40000, 5000);

        e1.calculateBonus();
        e2.calculateBonus();
    }
}
