// Abstract class
abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract void calculateFare();
}

// Bike Ride
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    void calculateFare() {
        double fare = distance * 5;
        System.out.println("Bike Ride Fare = ₹" + fare);
    }
}

// Auto Ride
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    void calculateFare() {
        double fare = distance * 8;
        System.out.println("Auto Ride Fare = ₹" + fare);
    }
}

// Car Ride
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    void calculateFare() {
        double fare = distance * 12;
        System.out.println("Car Ride Fare = ₹" + fare);
    }
}

// Main class
public class Main15 {
    public static void main(String[] args) {

        Ride rides[] = new Ride[3];

        rides[0] = new BikeRide(10);   // 10 km
        rides[1] = new AutoRide(10);   // 10 km
        rides[2] = new CarRide(10);    // 10 km

        for (Ride r : rides) {
            r.calculateFare();
        }
    }
}
