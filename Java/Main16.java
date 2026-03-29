// Base class
class Staff {
    void work() {
        System.out.println("Staff is working");
    }
}

// Doctor class
class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treats patients");
    }
}

// Nurse class
class Nurse extends Staff {
    void work() {
        System.out.println("Nurse takes care of patients");
    }
}

// Receptionist class
class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist manages appointments");
    }
}

// Main class
public class Main16 {
    public static void main(String[] args) {

        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}
