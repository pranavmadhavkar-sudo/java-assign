class PriorityTask extends Thread {
    public PriorityTask(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running");
        }
    }
}

public class ThreadPrioritySystem {
    public static void main(String[] args) {
        PriorityTask t1 = new PriorityTask("Low Priority Thread");
        PriorityTask t2 = new PriorityTask("Medium Priority Thread");
        PriorityTask t3 = new PriorityTask("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
