/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
public class StringsandArrays {

    public static void main(String[] args) {
        String sentence = "This is a sample Sentence";
        
        int length = sentence.length();
        
        String target = "PROGRAMMING";
        boolean isEqual = sentence.equals(target);
        
        int index = sentence.indexOf('a');
        
        
        System.out.println("Sentence Given: " + sentence);
        System.out.println("Sentence Length: " + length);
        if (length > 0) {
            char firstChar = sentence.charAt(0);
            char lastChar = sentence.charAt(length - 1);
            System.out.println("First character: " + firstChar);
            System.out.println("Last character: " + lastChar);
        } else {
            System.out.println("The sentence is empty, no first character.");
            System.out.println("The sentence is empty, no last character.");
        }
        System.out.println("Sentence in Upper Case: " + sentence.toUpperCase());
        System.out.println("Sentence's Spaces replaced with '-': " + sentence.replace(' ', '-'));
        
        System.out.println("Is Sentence Equals to?: " + target);
        if(isEqual){
            System.out.println("Same.");
        }
        else{
            System.out.println("Not Same.");
        }
         if (index != -1) {
            System.out.println("Index of the first letter 'a': " + index);
        } else {
            System.out.println("There exist no 'a' in the Sentence.");
        }
    }
}
