class BankingSystem {
    int balance = 1000;

    void withdraw(String user, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(user + " is trying to withdraw " + amount);
                balance = balance - amount;
                System.out.println(user + " deducted " + amount + ", Remaining balance: " + balance);
            } else {
                System.out.println(user + " cannot withdraw " + amount + ", Insufficient balance");
            }
        }
    }
}

class Customer extends Thread {
    BankingSystem b;
    String name;
    int amount;

    Customer(BankingSystem b, String name, int amount) {
        this.b = b;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        b.withdraw(name, amount);
    }
}

public class BankingDemo {
    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        Customer c1 = new Customer(b, "User1", 400);
        Customer c2 = new Customer(b, "User2", 500);
        Customer c3 = new Customer(b, "User3", 300);

        c1.start();
        c2.start();
        c3.start();
    }
}