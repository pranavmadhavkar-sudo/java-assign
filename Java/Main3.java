import java.util.Scanner;

class CARRENTAL {
    private int CarId;
    private String CarType;
    private float Rent;

    // Method to accept CarId and CarType
    public void GetCar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car ID: ");
        CarId = sc.nextInt();

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        CarType = sc.next();
    }

    // Method to calculate and return rent based on CarType
    public float GetRent() {
        if (CarType.equalsIgnoreCase("Small")) {
            Rent = 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        } else {
            Rent = 0;
            System.out.println("Invalid Car Type!");
        }
        return Rent;
    }

    // Method to display car details
    public void ShowCar() {
        System.out.println("\nCar Details:");
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}
public class Main3 {
    public static void main(String[] args) {
        CARRENTAL car = new CARRENTAL();

        car.GetCar();       // Input details
        car.GetRent();      // Calculate rent
        car.ShowCar();      // Display details
    }
}
123
