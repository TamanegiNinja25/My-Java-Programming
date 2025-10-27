import java.nio.file.*;
import java.io.*;
import java.util.*;
public class LabExer6A {
    public LabExer6A(){
        String filename = "C:\\Users\\稲村カルロ\\IdeaProjects\\Task Performance\\src\\word.txt"; // dito nakalagay yung directory path ng file mo
        Path path = Paths.get(filename.toString());
        String tempoarr[] = new String[100]; // temporary storage ng words na randomized
        String newarr[]; // dito mag vieview yung napiling word sa temporary storage na narandomized
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); // taga random or juggle ng words
        String hideword; // dito para naka question mark yung words na nasa array
        String showword; // dito para makita yung word na nasa array
        int guess_tries = 0;
        int counter = 0; // pang increment kung ilang loop gagawin
        try{
            InputStream input = Files.newInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String word = null;
            while((word=br.readLine())!=null){
                // System.out.println(word);
                tempoarr[counter] = word;
                ++counter;
            } // dito nakalagay yung kung ilang rotation sa word text mo na mararandomize yung need ilabas or kunin
                newarr = new String[counter];
                newarr = tempoarr;
                hideword = newarr[rand.nextInt(counter)];
                //System.out.println(hideword);
                showword = hideword;
                for(int x=0;x<hideword.length()-2;x++) {
                    showword = showword.replace(showword.charAt(rand.nextInt(showword.length())), '?');
                } // eto yung magrereplace sa mismong words with question mark tapos kada hula mawawala yon
                boolean isTrue = true;
                boolean found = false;
                do{
                    System.out.println("\n\n" + showword.toUpperCase() + "\n\n");
                    System.out.println("Enter a Word or Letter: ");
                    String guess = sc.nextLine();
                    if(guess.length()>1){
                        if(guess.equalsIgnoreCase(hideword)){
                            System.out.println("Good Job! You Guessed it Correctly!");
                            System.out.println("You Guessed the word " + hideword);
                            System.exit(0);
                        }
                        else{
                            System.out.println("Nice Try! Guess Again!");
                        }
                    }
                    else{
                        found=false;
                        for(int x=0;x<hideword.length();x++){
                            if(guess.equalsIgnoreCase(String.valueOf(hideword.charAt(x)))){
                                showword = showword.substring(0, x) + guess + showword.substring(x+1);
                            }
                        }
                    }
                    if(found==true){
                        System.out.println(guess.toUpperCase() + " Letter is CORRECT! Keep Guessing!");
                    }
                    else if(found==false){
                        System.out.println("Guess AGAIN!");
                    }
                    else{
                        System.out.println("It took you to guess it at " + guess_tries + " tries");
                    }
                }while(isTrue);
                //System.out.println(showword);
        }
        catch(IOException ex){
            System.out.println("Enter the GUESSED WORD or LETTER!");
        }
    }
    public static void main(String[]args){
        new LabExer6A();
    }
}
