import java.util.*;

public class StonePaperScissorGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("              *** Stone Paper Scissor Game *** ");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("-----------------------------------------------------------");
        int userScore = 0;
        int computerScore = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Round - "+(i+1));
            System.out.print("Choose 0 for Stone, 1 for Paper, 2 for Scissor: ");
            int userChoice = scanner.nextInt();
            int computerChoice = random.nextInt(3);

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice, try again.");
                i--; // Retry
                continue;
            }

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }

            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Final Score: " + name + " [ " + userScore + "/5 ]  ||  Computer [ " + computerScore +"/5 ]");

        if (userScore > computerScore) {
            System.out.println("\n                You won the game !");
        } else if (computerScore > userScore) {
            System.out.println("\n       s       Computer won the game !");
        } else {
            System.out.println("\n              The game is a tie !");
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        scanner.close();
    }
}
