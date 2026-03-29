class Bank {
    final double interestRate = 0.05; // 5% fixed interest

    void calculateInterest(double amount) {
        double interest = amount * interestRate;
        System.out.println("Amount: " + amount + 
                           " | Interest: " + interest);
    }
}

// Main class
public class Main18 {
    public static void main(String[] args) {

        Bank b = new Bank();

        // Different customers
        b.calculateInterest(10000);
        b.calculateInterest(20000);
        b.calculateInterest(50000);
    }
}