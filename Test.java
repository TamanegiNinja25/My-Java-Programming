/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
import java.util.*;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter initials to print: ");
        String in = sc.nextLine().trim().toUpperCase().replaceAll("\\s+","");
        if (in.isEmpty()) {
            System.out.println("No input. Exiting.");
            sc.close();
            return;
        }
        Map<Character, String[]> patterns = new HashMap<>();
        patterns.put('K', new String[] {
            "**    ** ",
            "**   **  ",
            "**  **   ",
            "** **    ",
            "****     ",
            "** **    ",
            "**  **   ",
            "**   **  ",
            "**    ** "
        });
        patterns.put('R', new String[] {
            "******  ",
            "**    ** ",
            "**    ** ",
            "******  ",
            "** **    ",
            "**  **   ",
            "**   **  ",
            "**    ** ",
            "**     **"
        });
        final int rows = 9;
        final int width = 9;
        final int gap = 4;
        for (int r = 0; r < rows; r++) {
            for (int i = 0; i < in.length(); i++) {
                char ch = in.charAt(i);
                String[] pat = patterns.get(ch);
                String line = (pat == null) ? String.format("%" + (-width) + "s", "") : pat[r];
                if (line.length() < width) {
                    line = String.format("%-" + width + "s", line);
                }
                for (int c = 0; c < width; c++) {
                    System.out.print(line.charAt(c));
                }
                if (i != in.length() - 1) {
                    for (int g = 2; g < gap; g++) System.out.print(' ');
                }
            }
            System.out.println();
        }
        sc.close();
    }
 }
   
