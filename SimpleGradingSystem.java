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
public class SimpleGradingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg;
        int g1,g2,g3,g4,g5;
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("|================Simple Grading System================|");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("| Enter the Grade of your First Subject: (0-100)");
        g1 = sc.nextInt();
        System.out.println((g1>=90&&g1<=100) ? "Excellent Grade!" : (g1>=80&&g1<=89) ? "Very Good!" : (g1>=70 && g1<=79) ? "Good!" : (g1>=60 && g1<=69) ? "Fair!" : (g1>=0 && g1<60) ? "Failed" : "Invalid");
        System.out.println("| Enter the Grade of your Second Subject: (0-100)");
        g2 = sc.nextInt();
        System.out.println((g2>=90&&g2<=100) ? "Excellent Grade!" : (g2>=80&&g2<=89) ? "Very Good!" : (g2>=70 && g2<=79) ? "Good!" : (g2>=60 && g2<=69) ? "Fair!" : (g2>=0 && g2<60) ? "Failed" : "Invalid");
        System.out.println("| Enter the Grade of your Third Subject: (0-100)");
        g3 = sc.nextInt();
        System.out.println((g3>=90&&g3<=100) ? "Excellent Grade!" : (g3>=80&&g3<=89) ? "Very Good!" : (g3>=70 && g3<=79) ? "Good!" : (g3>=60 && g3<=69) ? "Fair!" : (g3>=0 && g3<60) ? "Failed" : "Invalid");
        System.out.println("| Enter the Grade of your Fourth Subject: (0-100)");
        g4 = sc.nextInt();
        System.out.println((g4>=90&&g4<=100) ? "Excellent Grade!" : (g4>=80&&g4<=89) ? "Very Good!" : (g4>=70 && g4<=79) ? "Good!" : (g4>=60 && g4<=69) ? "Fair!" : (g4>=0 && g4<60) ? "Failed" : "Invalid");
        System.out.println("| Enter the Grade of your Fifth Subject: (0-100)");
        g5 = sc.nextInt();
        System.out.println((g5>=90&&g5<=100) ? "Excellent Grade!" : (g5>=80&&g5<=89) ? "Very Good!" : (g5>=70 && g5<=79) ? "Good!" : (g5>=60 && g5<=69) ? "Fair!" : (g5>=0 && g5<60) ? "Failed" : "Invalid");
        avg = (int) ((g1+g2+g3+g4+g5)/5.0);
        if(avg>=70 && avg <= 100){
            System.out.println("| Outstanding Class Performance! |");
            System.out.println("Average Grade: " + avg);
        }
        else if (avg >=75 && avg<=89){
            System.out.println("| Satisfactory Class Performance! |");
            System.out.println("Average Grade: " + avg);
        }
        else if (avg < 75){
            System.out.println("| Failed. Needs more Improvement! |");
            System.out.println("Average Grade: " + avg);
        }
        else{
            System.out.println("| Invalid Average Grade Calculation! |");
        }
    }
    
}
