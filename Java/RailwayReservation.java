class RailwayReservation {
    int tickets = 2;

    synchronized void bookTicket(String passengerName) {
        if (tickets > 0) {
            System.out.println(passengerName + ": Ticket booked successfully");
            tickets--;
        } else {
            System.out.println(passengerName + ": No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation rr = new RailwayReservation();

        Thread t1 = new Thread(() -> rr.bookTicket("Prajwal"));
        Thread t2 = new Thread(() -> rr.bookTicket("Rahul"));
        Thread t3 = new Thread(() -> rr.bookTicket("Amit"));

        t1.start();
        t2.start();
        t3.start();
    }
}