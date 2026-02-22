/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
public class StringMethod {
    public static void main(String[] args) {
        String str1 = "Music Therapy";
        int indexStr1 = str1.indexOf("T"); // shows index value = 6
        
        System.out.println("Output Result: " + indexStr1); // prints out the result of output 6
        
        String str2 = "Oro Plata Mata";
        int indexStr2 = str2.indexOf("B"); // shows index value = -1 
        
        System.out.println("Output Result: " + indexStr2); // prints out negative result that doesn't belong in the string
        
        String str3 = "Out , Inside";
        String[] parts = str3.split(",");  // separates the word from comma
        String first = parts[0].trim();  // removes spaces
        String second = parts[1].trim(); // removes spaces
        
        System.out.println("Output Result: ");
        System.out.println("First Word: " + second + " " + first); 
        System.out.println("Second Word: " + first + second );
        
        String str4 = "Programming";
        String str5 = "Coding";
        String str6 = "Writing";
        int r1 = str5.compareTo(str4); // compares Coding to Programming
        int r2 = str6.compareTo(str4); // compares Writing to Programming
        int r3 = str5.compareTo(str6); // compares Coding to Writing
        
        System.out.println("Output Result: ");
        System.out.println("Compared Strings: " + r1 + ", " + r2 + ", " + r3);
    }
    
}
