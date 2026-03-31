import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Choices array
        String[] choices = {"Rock", "Paper", "Scissors"};

        // User input
        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = sc.nextLine();

        // Computer choice
        int index = rand.nextInt(3);
        String compChoice = choices[index];

        System.out.println("Computer chose: " + compChoice);

        // Convert to lowercase for comparison
        userChoice = userChoice.toLowerCase();
        compChoice = compChoice.toLowerCase();

        // Logic
        if (userChoice.equals(compChoice)) {
            System.out.println("Result: It's a Draw!");
        } 
        else if (
            (userChoice.equals("rock") && compChoice.equals("scissors")) ||
            (userChoice.equals("paper") && compChoice.equals("rock")) ||
            (userChoice.equals("scissors") && compChoice.equals("paper"))
        ) {
            System.out.println("Result: You Win!");
        } 
        else {
            System.out.println("Result: You Lose!");
        }

        sc.close();
    }
}
