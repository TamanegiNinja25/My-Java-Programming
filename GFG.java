import java.util.InputMismatchException;
import java.util.Scanner;
public class GFG {
    public static void guessingNumberGame() {
        Scanner scan = new Scanner(System.in);
        int guessnumber = 1 + (int) (50 * Math.random());
        int guesses = 30;
        int i, guess;
        System.out.println("A number is chosen randomly between 1 to 50." + " Guess the number within 30 trials.");
        System.out.println("Extinguish the trials, PERISH or DIE!");
        try {
            for (i = 0; i < guesses; i++) {
                System.out.println("Guess the number:");
                guess = scan.nextInt();
                if (guessnumber == guess) {
                    System.out.println("Congratulations!" + " You guessed the number!");
                    break;
                } else if (guessnumber > guess && i != guesses - 1) {
                    System.out.println("Number is too low!");
                    System.out.println("Guess Again!");
                    System.out.println("The number is " + "greater than " + guess);
                } else if (guessnumber < guess && i != guesses - 1) {
                    System.out.println("Number is too high!");
                    System.out.println("Guess Again!");
                    System.out.println("The number is" + " less than " + guess);
                }
            }
            if (i == guesses) {
                System.out.println("You have exhausted" + " K trials.");
                System.out.println("The number was " + guessnumber);
            }
        }
        catch(InputMismatchException ime){
            System.out.println("Wrong Input!");
            System.out.println("Please Enter a NUMBER!");
        }
        catch(StringIndexOutOfBoundsException sioobe) {
            System.out.println("Wrong Input!");
            System.out.println("Please Enter a NUMBER!");
        }
    }
    public static void main(String arg[])
    {
        guessingNumberGame();
    }
}
