import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RandomNumberGeneration {
    int nextInt(int origin, int bound) {
        int rng = bound - origin;
        if (rng > 0) {
            return nextInt(rng) + origin;
        }
        else {  // range not representable as int
            int guessnum;
            do {
                guessnum = nextInt(50) ;
            } while (guessnum < origin || guessnum >= bound);
            return guessnum;
        }
    }
    private int nextInt(int rng) {
        return nextInt(50);
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        RandomNumberGeneration random = new RandomNumberGeneration();
        int guessnum = random.nextInt(50) + 1;
        int guessed_tries = 0;
        int guess;
        boolean guessed = false;
        try{
            while (guessed == false) {
                System.out.println("Guess a number between 1 to 50.");
                System.out.println("Enter the number guessed: ");
                guess = scan.nextInt();
                guessed_tries++;
                if (guess == guessnum) {
                    guessed = true;
                } else if (guess < guessnum) {
                    System.out.println("Number is too low!");
                    System.out.println("Guess Again!");
                } else if (guess > guessnum) {
                    System.out.println("Number is too high!");
                    System.out.println("Guess Again!");
                }
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
            System.out.println("You Guessed it RIGHT!");
            System.out.println("You WIN!");
            System.out.println("The Number was: " + guessnum);
            System.out.println("It took you " +guessed_tries + " tries.");

    }
}

