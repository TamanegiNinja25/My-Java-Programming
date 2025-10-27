import java.util.Scanner;

public class QuizTrial extends ArrayIndexOutOfBoundsException {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        System.out.println("Multiple Choice Questions.");
        System.out.println("Choose the Letter of your answer.");
        System.out.println("Use Capital or Small letters only!");
        String[][] questions = new String[10][10];
        questions = new String[][]{
                {"What is the capital of France?", "A. London", "B. Paris", "C. Rome", "B"},
                {"Which planet is known as the Red Planet?", "A. Venus", "B. Mars", "C. Jupiter", "B"},
                {"What is the chemical symbol for water?", "A. Wa", "B. Wo", "C. H2O", "C"},
                {"What do you get when you combine red and blue?", "A. Green", "B. Orange", "C. Purple", "C"},
                {"What is the planet we live in?", "A. Earth", "B. Venus", "C. Uranus", "A"},
                {"What is a dog's favourite food?", "A. Apple", "B. Bone", "C. Cat food", "B"},
                {"What is the capital of Philippines?", "A. Moscow", "B. Beijing", "C. Manila", "C"},
                {"What is four letters?", "A. Yes", "B. No", "C. Maybe", "A"},
                {"Are you Racist?", "A. Yes", "B. No", "C. Sometimes", "A"},
                {"Do you love coding?", "A. No!", "B. VeryMuch!", "C. Yes", "B"}
        };
        String[] size = questions[10];
        Scanner scan = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i < 10; i++) {
            for (String[] q : questions) {
                String question = q[0];
                String choiceA = q[1];
                String choiceB = q[2];
                String choiceC = q[3];
                String choiceD = q[4];
                String choiceE = q[5];
                String choiceF = q[6];
                String choiceG = q[7];
                String choiceH = q[8];
                String choiceI = q[9];
                String correctAnswer = q[10];
                System.out.println(question);
                System.out.println(choiceA);
                System.out.println(choiceB);
                System.out.println(choiceC);
                System.out.println(choiceD);
                System.out.println(choiceE);
                System.out.println(choiceF);
                System.out.println(choiceG);
                System.out.println(choiceH);
                System.out.println(choiceI);
                System.out.print("Your choice (A, B, or C): ");
                String userAnswer = scan.nextLine().toUpperCase();
                try {
                    if (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C")) {
                        throw new IllegalArgumentException("Invalid choice. Enter the Appropriate Letter of Choice. Please choose A, B, or C.");
                    }
                    else {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Skipping to the next question.");
                    System.out.println("Enter the appropriate choice.");
                    continue;
                } catch (ArrayIndexOutOfBoundsException aioobe) {
                    System.out.println("You may continue!");
                    System.out.println("Enter your letter of choice.");
                }
                if (userAnswer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                    System.out.println("You get 1 point");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is: " + correctAnswer);
                    System.out.println("You should study more!");
                }
                System.out.println();
            }
        }
        System.out.println("Quiz completed!");
        System.out.println("Good Job!");
        System.out.println("Your score: " + score + "/" + questions.length);
        System.out.println("If you got 5 above, Well done!");
        System.out.println("If you got 5 below, You can try again!");
        scan.close();
    }
}