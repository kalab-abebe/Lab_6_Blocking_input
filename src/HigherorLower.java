import java.util.Scanner;
import java.util.Random;

public class HigherorLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int secretNum = rand.nextInt(10) + 1; // 1 to 10
        int userGuess = 0;
        boolean isValid = false;

        do {
            System.out.print("Guess a number between 1 and 10: ");

            if (scan.hasNextInt()) {
                userGuess = scan.nextInt();
                scan.nextLine(); // clear buffer

                if (userGuess >= 1 && userGuess <= 10) {
                    isValid = true;
                } else {
                    System.out.println("Invalid range. Please pick between 1 and 10.");
                }
            } else {
                String badInput = scan.next();
                System.out.println("That's not a valid number. Try again.");
            }
        } while (!isValid);

        System.out.println("\nRandom number was: " + secretNum);

        if (userGuess == secretNum) {
            System.out.println("Spot on! You got it right.");
        } else if (userGuess > secretNum) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }

        scan.close();
    }
}