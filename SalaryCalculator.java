/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;
/**
 *
 * @author 稲村カルロ
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        String employeename = "Magdalena Leones";
        double monthlySalary = 35000;
        int workingDays = 21;
        int leaveCredits = 3; 
        double dailyPay = 1666.67;
        int vacationLeave = 5; // 1 week long vacation
        int timeLate = 30; // 30 minutes
        double sssRate = 0.045; // converted from 4.5% 
        double withholdingRate = 0.10; // converted from 10%
        int monthlyPagibig = 200;
        int adjustedPagibig = 2; // 2 for 2 months adjustment
        double dailyRate = monthlySalary / workingDays;
        double hourlyRate = dailyRate / (8 * 60); // per 8 hours * 60minutes or 1hour
        int unpaidDays = vacationLeave - leaveCredits; 
        unpaidDays = unpaidDays < 0 ? 0 : unpaidDays;
        double unpaidDeduction = unpaidDays * dailyRate;
        double deductionFee = timeLate * hourlyRate;
        double grossPay = monthlySalary - unpaidDeduction - deductionFee;
        double sss = grossPay * sssRate;
        double pagibig = monthlyPagibig * (1 +adjustedPagibig);
        double withholdingTax = grossPay * withholdingRate;
        double totalDeduction = sss + pagibig + withholdingTax;
        double netPay = grossPay - totalDeduction;
        System.out.println("================================= Employee Payslip ================================");
        System.out.println("| Name: " + employeename );
        System.out.println("| Base Monthly Salary: " + monthlySalary + "Php" );
        System.out.printf("| Daily Rate: %.2f Php%n", dailyRate);
        System.out.println("===============================================================================");
                if (unpaidDays > 0 && timeLate > 0) {
                    System.out.println("Please provide an Incident Report Why you have so much late and unpaid days.");
                } else if (unpaidDays > 0 || timeLate > 0) {
                    System.out.println("You have some Lates or Unpaid Days");
                } else {
                    System.out.println("Congratulations! Perfect Attendance! You are a Company Slave!");
                }
        System.out.println("===============================================================================");
        System.out.printf("| Unpaid Days: %d ( Deduction: %.2f Php )%n", unpaidDays, unpaidDeduction);
        System.out.printf("| Late Minutes: %d ( Deduction: %.2f Php )%n", timeLate, deductionFee);
        System.out.printf("| Gross Pay: %.2f Php%n", grossPay);
        System.out.println("===============================================================================");
        System.out.println();
        System.out.println("===============================================================================");
        System.out.println("| Deductions: ");
        System.out.println("===============================================================================");
        System.out.printf("| SSS (4.5%%): %.2f Php%n", sss);
        System.out.println("| Pag-IBIG: " + pagibig + "Php");
        System.out.printf("| Withholding Tax (10%%): %.2f Php%n", withholdingTax);
        System.out.printf("| Total Deductions: %.2f Php%n", totalDeduction);
        System.out.println("===============================================================================");
        System.out.println();
        System.out.println("===============================================================================");
        System.out.printf("| Net Pay: %.2f Php%n", netPay);
        System.out.println("===============================================================================");
    }
}
