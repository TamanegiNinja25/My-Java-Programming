import java.util.*;
import java.io.*;
public class Quiz {
    public static void main(String[] args) {
        Questions();
    }
    public static void Questions() {
        Scanner scan = new Scanner(System.in);
        String[][] Question = new String[20][];
        try {
            for (int i = 0; i < 20; i++) {
                if (i == 0 || i % 2 == 0) {
                    Question[i] = new String[1];
                } else {
                    Question[i] = new String[3];
                }
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Please Enter Appropriate Answer!");
        } catch (InputMismatchException ime) {
            System.out.println("Only Letter of CHOICE!");
            System.out.println("Enter the Letter of Choice.");
        }
        String[] Answer = new String[10];
        Question[0][0] = "A champion who has wind blade?";
        Question[1][0] = "A) Yone";
        Question[1][1] = "B) Yasuo";
        Question[1][2] = "C) Riven";
        Answer[0] = "B";
        Question[2][0] = "This quote 'My right arm is a lot stronger than my left arm' belongs to? ";
        Question[3][0] = "A) Tryndamere";
        Question[3][1] = "B) Aatrox";
        Question[3][2] = "C) Volibear";
        Answer[1] = "A";
        Question[4][0] = "What is Jhin's Favourite number?";
        Question[5][0] = "A) 1(one)";
        Question[5][1] = "B) 4(four)";
        Question[5][2] = "C) 3(three)";
        Answer[2] = "B";
        Question[6][0] = "Which team won last year's World's Tournament?";
        Question[7][0] = "A) SSG";
        Question[7][1] = "B) DWG";
        Question[7][2] = "C) T1";
        Answer[3] = "C";
        Question[8][0] = "Who got the most skins in league?";
        Question[9][0] = "A) Ezreal";
        Question[9][1] = "B) Miss Fortune";
        Question[9][2] = "C) Ahri";
        Answer[4] = "A";
        Question[10][0] = "Who is the champion that has many runes?";
        Question[11][0] = "A) Veigar";
        Question[11][1] = "B) Ryze";
        Question[11][2] = "C) Ziggs";
        Answer[5] = "B";
        Question[12][0] = "Who is Shen's brother and mortal enemy?";
        Question[13][0] = "A) Zed";
        Question[13][1] = "B) Akali";
        Question[13][2] = "C) Kennen";
        Answer[6] = "A";
        Question[14][0] = "Who is Yasuo's Older brother?";
        Question[15][0] = "A) Yone";
        Question[15][1] = "B) Yi";
        Question[15][2] = "C) Jax";
        Answer[7] = "A";
        Question[16][0] = "What is the object or item used to power up weapons in league of legends?";
        Question[17][0] = "A) Fuel";
        Question[17][1] = "B) Runes";
        Question[17][2] = "C) Hex stones";
        Answer[8] = "C";
        Question[18][0] = "What is Pantheon's dream job?";
        Question[19][0] = "A) Digger";
        Question[19][1] = "B) Farmer";
        Question[19][2] = "C) Baker";
        Answer[9] = "C";
        int a = 0;
        int correctCount = 0;
        int counter = 0;
        try {
            for (int i = 0; i < Question.length; i++) {
                for (int j = 0; j < Question[i].length; j++) {
                    System.out.print(Question[i][j] + "\n");
                    if (j >= 2) {
                        counter = TakeQuiz(Answer, a, correctCount);
                        a++;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Please Enter Appropriate Answer!");
        } catch (InputMismatchException ime) {
            System.out.println("Only Letter of CHOICE!");
            System.out.println("Enter the Letter of Choice.");
        }
        System.out.print("Total: " + counter);
    }
    public static int TakeQuiz(String[] A, int a, int correctCount) {
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();
        response = response.toUpperCase();
        try {
            while (!response.equals("A") && !response.equals("B") && !response.equals("C")) {
                System.out.println("Input not appropriate. Enter a valid response: ");
                response = scan.nextLine();
            }
            if (response.equals(A[a])) {
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