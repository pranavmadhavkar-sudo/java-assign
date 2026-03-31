class Restaurant {
    boolean foodReady = false;

    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() {
        while (!foodReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Waiter served food");
        foodReady = false;
    }
}

class Chef extends Thread {
    Restaurant r;

    Chef(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.prepareFood();
    }
}

class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.serveFood();
    }
}

public class ProducerConsumerSystem {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Waiter w = new Waiter(r);
        Chef c = new Chef(r);

        w.start();
        c.start();
    }
}
