/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Combination of All Conditional Looping
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        // Variable names and Value
        int secretNum;
        int guess;
        int attempts = 0;
        char playAgain;
        secretNum = (int) (Math.random() * 10) + 1; //Randomizes the Number
        
        //Outputs
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("| NUMBER TO THE GUESSING GAME!");
        System.out.println("| ADVANCED MODE |");
        System.out.println("| WELCOME!");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("| I have Chosen a Number Between: (1- 100)");
            do{
                attempts = 0;
                secretNum = (int) (Math.random() * 10) + 1; //Randomizes the Number
            while(true){
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.print("| Enter Your Guess: ");
                guess = s.nextInt();
                attempts++;
                if(guess == secretNum){
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| Correct! You GUESSED THE NUMBER " + attempts + " attempts");
                    break;
                    }
                else if(guess < secretNum){
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                        System.out.println("| Number too Low! Try Again!");
                    }
                else{
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| Number too High! Try Again!");
                 }
                if(attempts == 10){
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| You Exhausted all your Attempts!" + secretNum);
                    System.out.println("| GAME OVER! TRY AGAIN NEXT TIME!");
                    break;
                }
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println("| Do you Want to Try Again? (Y/N)");
                playAgain = s.next().charAt(0);
        
        
                if(playAgain == 'N' || playAgain == 'n'){
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Thanks for Playing! Game Over!");
                    break;
                 }
                else if(playAgain == 'Y' || playAgain == 'y'){
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Starting a New Game. . .");
                    continue;
                }
                else{
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("INVALID INPUT! GAME WILL EXIT. . . ");
                    break;
            }      
            }
      }while(true);
 }
}
