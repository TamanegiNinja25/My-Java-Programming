/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
public class SelectionStatements {
    public static void main(String[] args) {
        int iNumber = 3;
        if(iNumber >= 0){
            if(iNumber == 0){
                System.out.println("|=========|");
                System.out.println("| First String |");
                System.out.println("|=========|");
            }
            else{
                System.out.println("| ============= |");
                System.out.println("| Second String |");
                System.out.println("| ============= |");
            }
        }
        System.out.println("| ============ |");
        System.out.println("| Third String |");
        System.out.println("| ============ |");
        System.out.println();
        System.out.println("| ================================================================================================================================================== |");
        System.out.println("| Explanation: ");
        System.out.println("| When giving a value to iNumber which is 3, it evaluates the condition to what it should print out.");
        System.out.println("| So when the value is 3 and the first condition is having the value of iNumber>=0 which is true it goes to another selection of condition.");
        System.out.println("| On the second condition it goes false which is iNumber being equals to zero, hence going to the default value of printing the string: Second String.");
        System.out.println("| In this program it evaluates what condition and statement it deems true and fit to the value given then executes the code deemed true.");
        System.out.println("| ================================================================================================================================================== |");
    }
}
