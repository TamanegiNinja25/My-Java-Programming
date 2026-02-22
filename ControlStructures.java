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
public class ControlStructures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int month;
        int v1,v2,v3,v4,v5;
        System.out.println("|================================|");
        System.out.println("|============Welcome!============|");
        System.out.println("|================================|");
        System.out.println("|==Peformance Task Controlled Structures=|");
        System.out.println("|================================|");
        System.out.println("| Please Enter a Number: ");
        num = sc.nextInt();
        System.out.println("| Deciding if the Value is positive or negative: ");
        System.out.println((num>0) ? "| Number is a Positive Number" : (num<0) ? "| Number is a Negative Number" :"| Not a Number"); //ternary condition for determining given value is positive or negative.
        System.out.println("|=================================================|");
        System.out.println("| Enter a Number that Ranges from (1-12): ");
        month = sc.nextInt();
        System.out.println("|=================================================|");
        System.out.println("| Will now indicate what Month it is today!");
        switch(month){ // switch casing for the inputted value determining name of the month.
            case 1:
                System.out.println("| Today is January.");
                System.out.println("|=================================================|");
                break;
            case 2:
                System.out.println("| Today is February.");
                System.out.println("|=================================================|");
                break;
            case 3:
                System.out.println("| Today is March.");
                System.out.println("|=================================================|");
                break;
            case 4:
                System.out.println("| Today is April.");
                System.out.println("|=================================================|");
                break;
             case 5:
                System.out.println("| Today is May.");
                System.out.println("|=================================================|");
                break;   
             case 6:
                System.out.println("| Today is June.");
                System.out.println("|=================================================|");
                break;
             case 7:
                System.out.println("| Today is July.");
                System.out.println("|=================================================|");
                break;
             case 8:
                System.out.println("| Today is August.");
                System.out.println("|=================================================|");
                break;
             case 9:
                System.out.println("| Today is September.");
                System.out.println("|=================================================|");
                break;
             case 10:
                System.out.println("| Today is October.");
                System.out.println("|=================================================|");
                break;
             case 11:
                System.out.println("| Today is November.");
                System.out.println("|=================================================|");
                break;
             case 12:
                System.out.println("| Today is December.");
                System.out.println("|=================================================|");
                break;   
             default:
                 System.out.println("| Invalid Value. Please Enter a Number.");
                 System.out.println("|=================================================|");
                 break;
        }
        System.out.println();
        System.out.println("|=================================================|");
        System.out.println("| Finding Average of Five Numbers inputted.");
        System.out.print("| Enter First Value: ");
        v1 = sc.nextInt();
        System.out.print("| Enter Second Value: ");
        v2 = sc.nextInt();
        System.out.print("| Enter Third Value: ");
        v3 = sc.nextInt();
        System.out.print("| Enter FourthValue: ");
        v4 = sc.nextInt();
        System.out.print("| Enter Fifth Value: ");
        v5 = sc.nextInt();
        System.out.println("| Now Calculating the Average Value of given Five Inputs.");
        double avg = (v1+v2+v3+v4+v5)/5; // calculation for the average value of 5 numbers.
        System.out.println("| Average Value Calculated: " + avg);
        System.out.println("|=================================================|");
        System.out.println("| Program Successfully Executed. Now Ending. . .");
        sc.close(); 
    }
    
}
