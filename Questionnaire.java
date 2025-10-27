import java.util.InputMismatchException;
import java.util.Scanner;
public class Questionnaire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice[] = new char[10];
        String[] correctAnswer = new String[10];
        String[][] question = new String[10][4];
        int test = 0;
        int counter = 0;
        int correct = 0;
        int incorrect = 0;
        question[0][0] = "Which one of these is not a primitive data type?";
        question[0][1] = "A) integer";
        question[0][2] = "B) char";
        question[0][3] = "C) String";
        correctAnswer[0] = "C";
        question[1][0] = "Java source code is stored in files with what extension?";
        question[1][1] = "A) .class";
        question[1][2] = "B) .java";
        question[1][3] = "C) .jav";
        correctAnswer[1] = "B";
        question[2][0] = "The best environment for developing Java applications is?";
        question[2][1] = "A) A UNIX server hosted by a corporate entity";
        question[2][2] = "B) Eclipse IDE";
        question[2][3] = "C) Whatever you are most comfortable in";
        correctAnswer[2] = "C";
        question[3][0] = "Java can be used to write?";
        question[3][1] = "A) Web Applications";
        question[3][2] = "B) Desktop programs";
        question[3][3] = "C) All of the above";
        correctAnswer[3] = "C";
        question[4][0] = "Which GUI toolkit comes included with Java?";
        question[4][1] = "A) Swing";
        question[4][2] = "B) Gtk";
        question[4][3] = "C) JavaFX";
        correctAnswer[4] = "A";
        question[5][0] = "The current version of Java is?";
        question[5][1] = "A) 7";
        question[5][2] = "B) 1.7";
        question[5][3] = "C) This is a trick question (aka both)";
        correctAnswer[5] = "C";
        question[6][0] = "Java is a?";
        question[6][1] = "A) Byte-Code compiled language";
        question[6][2] = "B) Interpreted language";
        question[6][3] = "C) Compiled language";
        correctAnswer[6] = "A";
        question[7][0] = "The file extension for MyApp.java after running \"javac MyApp.java\" is?";
        question[7][1] = "A) .exe";
        question[7][2] = "B) .class";
        question[7][3] = "C) .java";
        correctAnswer[7] = "B";
        question[8][0] = "In Java console output is achieved by using?";
        question[8][1] = "A) std::cout";
        question[8][2] = "B) printf";
        question[8][3] = "C) System.out.println";
        correctAnswer[8] = "C";
        question[9][0] = "Java applications are executed in?";
        question[9][1] = "A) an interpreter";
        question[9][2] = "B) a virtual machine";
        question[9][3] = "C) on your computer";
        correctAnswer[9] = "B";
        try {
            for (int i = 0; i < question.length; i++) {
                for (int j = 0; j < question[i].length; j++) {
                    System.out.print(question[i][j] + "\n");
                    if (j >= 2) {
                        counter = TakeQuiz(choice, test, correct);
                        counter++;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Please Enter Appropriate Answer!");
        } catch (InputMismatchException ime) {
            System.out.println("Only Letter of CHOICE!");
            System.out.println("Enter the Letter of Choice.");
        }
    }

    public static int TakeQuiz(char[] A, int a, int correctCount) {
        Scanner scan = new Scanner(System.in);
        String chosen = scan.nextLine();
        chosen = chosen.toUpperCase();
        try {
            while (!chosen.equals("A") && !chosen.equals("B") && !chosen.equals("C")) {
                System.out.println("Input not appropriate. Enter a valid response: ");
                chosen = scan.nextLine();
            }
            if (chosen.equals(A[a])) {
                correctCount++;
                System.out.println("Correct!!");
                System.out.println();
            } else {
                System.out.println("Incorrect, the correct answer is: " + A[a]);
                System.out.println();
            }
            return correctCount;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Please Enter Appropriate Answer!");
        } catch (InputMismatchException ime) {
            System.out.println("Only Letter of CHOICE!");
            System.out.println("Enter the Letter of Choice.");
        }
        return correctCount;
    }
}
