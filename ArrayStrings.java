/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
public class ArrayStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char ch [] = {'T', 'E', 'S','T', ' ', 'P','R','O','G','R','A','M','M','I','N','G',};
        String str = new String(ch);
        System.out.println(str);
        
        String test = "WORD SCRABBLE";
        System.out.println("Message: " +test);
        System.out.println("Length: " + test.length());
        
        char c [] = {'P','E','A','C','E','F','U','L'};
        String word = new String(c, 0, 8);
        System.out.println(word);
        
        char letter = 'K';
        int asciiValue = (int) letter;
        System.out.println("Character: " + letter);
        System.out.println("ASCII Value: " + asciiValue);
    }
    
}
