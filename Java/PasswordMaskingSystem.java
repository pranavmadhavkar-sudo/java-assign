import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() > 2) {
           
            String masked = password.substring(0, password.length() - 2)
                             .replaceAll(".", "*")
                             + password.substring(password.length() - 2);

            System.out.println("Masked Password: " + masked);
        } else {
            System.out.println("Password too short to mask");
        }

        sc.close();
    }
}
