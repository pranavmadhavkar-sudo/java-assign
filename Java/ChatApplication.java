class Sender extends Thread {
    public void run() {
        System.out.println("Sender thread state: " + Thread.currentThread().getState());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Sending message " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Receiver extends Thread {
    public void run() {
        System.out.println("Receiver thread state: " + Thread.currentThread().getState());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Receiving message " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ChatApplication {
    public static void main(String[] args) {
        Sender s = new Sender();
        Receiver r = new Receiver();

        System.out.println("Before start Sender state: " + s.getState());
        System.out.println("Before start Receiver state: " + r.getState());

        s.start();
        r.start();

        try {
            s.join();
            r.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("After execution Sender state: " + s.getState());
        System.out.println("After execution Receiver state: " + r.getState());
    }
}