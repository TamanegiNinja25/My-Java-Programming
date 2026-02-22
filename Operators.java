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
public class Operators {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number1;
        int number2;
        int num1 = 1;
        int num2 = 0;
        boolean flag = true;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter the Value of First Number: ");
        number1 = read.nextInt();
        System.out.println("Enter the Value of Second Number: ");
        number2 = read.nextInt();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Calculating Results....");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Result Calculated: ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Arithmetic Operators: ");
        System.out.println("Sum of First Number and Second Number: " + (number1 + number2));
        System.out.println("Difference of First Number and Second Number: " + (number1 - number2));
        System.out.println("Product of First Number and Second Number: " + (number1 * number2));
        System.out.println("Quotient of First and Second Number: " + (number1 / number2));
        System.out.println("Modulo of First and Second Number: " + (number1 % number2));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Relational or Comparison Operators: ");
        System.out.println("First Number is Bigger than Second Number?: " + (number1 > number2));
        System.out.println("First Number is Smaller than Second Number?: " + (number1 < number2));
        System.out.println("First Number is Equals to Second Number?: " + (number1 == number2));
        System.out.println("First Number is NOT Equal to Second Number?: " + (number1 != number2));
        System.out.println("First Number is Greater than Equal to Second Number?: " + (number1 >= number2));
        System.out.println("First Number is Less than Equal to Second Number?: " + (number1 <= number2));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Bitwise Operators: " );
        System.out.println("Bitwise AND: "  + (number1&number2));
        System.out.println("Bitwise OR: " + (number1|number2));
        System.out.println("Bitwise XOR:" + (number1^number2));
        System.out.println("Bitwise Inversion:" + (~number1));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Assignment Operators: ");
        System.out.println("Assigned Number 1: " + (number1));
        System.out.println("Add and Assign: " + (number1 += number2));
        System.out.println("Subtract and Assign: " + (number1 -= number2));
        System.out.println("Multiply and Assign: " + (number1 *= number2));
        System.out.println("Divide and Assign: " + (number1 /= number2));
        System.out.println("Modulus and Assign: " + (number1 %= number2));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Unary Operators: ");
        System.out.println("Unary Plus: " + number1 + " = " + (+number1));
        System.out.println("Original Number: " + number1);
        System.out.println("Pre-Increment: " + (++number1));
        System.out.println("Post-Increment: " + (number1++));
        System.out.println("Unary Minus: " + number2 + " = " + (-number2));
        System.out.println("Original Number: " + number2);
        System.out.println("Pre-Decrement: " + (--number2));
        System.out.println("Post-Decrement: " + (number2--));
        System.out.println("Logical Complement: " + flag);
        System.out.println("Logical Complement Flagged: " + (!flag));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Logical Operators: ");
        System.out.println("Logical AND: " + (number1<number2 && number1>number2));
        System.out.println("Logical OR: " + (number1<number2 || number1>number2));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("END OF OPERATOR CATEGORIES SAMPLE.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Description: ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("6 Category of Operator is used and shows that 2 numbers are calculated according to the operator used.");
        System.out.println("In Logical, Bitwise, and Comparison Operator it show how the numbers compared is true or false.");
        System.out.println("In Unary Operator it show that the number is incremented or decremented, or increased and decreased until certain condition is met.");
        System.out.println("In Arithmetic and Assignment Operator it shows basic calculation or addition, subtraction, multiplication, and division by the given number or itself.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        /*
        6 Category of Operator is used and shows that 2 numbers are calculated according to the operator used.
        In Logical, Bitwise, and Comparison Operator it show how the numbers compared is true or false.
        In Unary Operator it show that the number is incremented or decremented, or increased and decreased until certain condition is met.
        In Arithmetic and Assignment Operator it shows basic calculation or addition, subtraction, multiplication, and division by the given number or itself.
        */
    }
    
}
