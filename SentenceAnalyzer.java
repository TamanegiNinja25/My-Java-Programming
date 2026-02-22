/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
import java.util.Scanner;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one sentence:");
        String sentence = scanner.nextLine();
        
        System.out.println("\n--- Analysis Results ---");
        int length = sentence.length();
        System.out.println("1. Length of the sentence: " + length);
        
        if (length > 0) {
            char firstChar = sentence.charAt(0);
            char lastChar = sentence.charAt(length - 1);
            System.out.println("2. First character: " + firstChar);
            System.out.println("3. Last character: " + lastChar);
        } else {
            System.out.println("2. The sentence is empty, no first character.");
            System.out.println("3. The sentence is empty, no last character.");
        }
        
        String upperCaseSentence = sentence.toUpperCase();
        System.out.println("4. Sentence in UPPERCASE: " + upperCaseSentence);
        
        String hyphenatedSentence = sentence.replace(' ', '-');
        System.out.println("5. Sentence with spaces replaced by hyphens: " + hyphenatedSentence);
        
        String targetWord = "PROGRAMMING";
        boolean isEqual = sentence.equals(targetWord);
        System.out.print("6. Is the sentence equal to \"" + targetWord + "\"? ");
        
        if (isEqual) {
            System.out.println("**Same**");
        } else {
            System.out.println("**Not the same**");
        }
        
        int indexOfA = sentence.indexOf('a');
        
        if (indexOfA != -1) {
            System.out.println("7. Index of the first letter 'a': " + indexOfA);
        } else {
            System.out.println("7. The letter 'a' was not found in the sentence.");
        }
        
        scanner.close();
    }
}