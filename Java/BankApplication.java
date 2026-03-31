class BankApplication {

    static void processTransaction() throws Exception {
        boolean success = true;

        if (success) {
            System.out.println("Transaction processed");
        } else {
            throw new Exception("Transaction failed");
        }
    }

    public static void main(String[] args) {
        try {
            processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
