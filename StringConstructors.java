/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
public class StringConstructors {
    public static void main(String[] args) {
        char nameMonth[] = {'K','A','R','U','R','O',' ','J','A','N','U','A','R','Y',}; //Characters for First Name and Birth Month
        String output1 = new String(nameMonth);
        
        System.out.println("| ================== |");
        System.out.println("| = " + output1 + " = |");
        
        String output2 = new String(nameMonth, 0, 7); // Getting the array index from 0 to 7 which outputs to First Name
        System.out.println("| ===== " + output2 + " ==== |");
        
        byte month[] = {74, 65, 78, 85, 65, 82, 89}; // Referred to ASCII Character numbering
        String output3 = new String(month);
        System.out.println("| ===== " + output3 + " ==== |");
        
        String output4 = new String(month, 0, 3); // Getting the index from 0 to 3 which outputs to the Abbreviation of the month
        System.out.println("| ======= " + output4 + " ====== |");
        System.out.println("| ================== |");
        
        System.out.println("| ========================================================= |");
        System.out.println("| From char[]: " + output1); // String word formed from the array characters
        System.out.println("| From char[]: Index starting 0 to count 7 " + output2); // Word formed from character with indexing to 0 to 7
        System.out.println("| From byte[]: " + output3); // String formed from the ASCII numbering
        System.out.println("| From byte[]: Index starting to 0 to count 3 " + output4); // String formed from the ASCII character when specified index is given
        System.out.println("| ========================================================= |");
        
        String word = "KARURO JANUARY"; // To know the ASCII number values per Character
        System.out.print("| Character: " + word + "\n| ASCII Values: ");
        for (char c : word.toCharArray()) {
            System.out.print((int) c + " ");
        }
        System.out.println("\n| ========================================================= |");
    } 
}
