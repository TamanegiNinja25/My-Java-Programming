/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit1106;

/**
 *
 * @author 稲村カルロ
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SalaryCalculatorv2 {
    public static void main(String[] args) {
        final BigDecimal MONTHLY_SALARY = new BigDecimal("35000");
        final BigDecimal WORKING_DAYS = new BigDecimal("21");
        final BigDecimal SSS_RATE = new BigDecimal("0.045");         // 4.5%
        final BigDecimal WITHHOLDING_RATE = new BigDecimal("0.10"); // 10%
        final BigDecimal PAGIBIG_MONTHLY = new BigDecimal("200");   // ₱200 per month
        final int MONTHS_PAGIBIG_ADJUSTED = 2; // "late for past 2 months" -> add 2 months backpay
        final int VACATION_DAYS_TAKEN = 5;
        final int LEAVE_CREDITS_LEFT = 3;
        final int LATE_MINUTES = 30;
        BigDecimal dailyRate = MONTHLY_SALARY.divide(WORKING_DAYS, 10, RoundingMode.HALF_UP);
        BigDecimal perMinute = dailyRate.divide(new BigDecimal("480"), 10, RoundingMode.HALF_UP); // 8 hrs * 60
        int paidLeaveDays = Math.min(LEAVE_CREDITS_LEFT, VACATION_DAYS_TAKEN);
        int unpaidDays = VACATION_DAYS_TAKEN - paidLeaveDays;
        BigDecimal unpaidDeduction = dailyRate.multiply(new BigDecimal(unpaidDays));
        BigDecimal lateDeduction = perMinute.multiply(new BigDecimal(LATE_MINUTES));
        BigDecimal gross = MONTHLY_SALARY.subtract(unpaidDeduction).subtract(lateDeduction);
        BigDecimal sss = gross.multiply(SSS_RATE).setScale(2, RoundingMode.HALF_UP);
        BigDecimal pagibigTotal = PAGIBIG_MONTHLY
                .multiply(new BigDecimal(1 + MONTHS_PAGIBIG_ADJUSTED)) // monthly + backpay months
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal withholding = gross.multiply(WITHHOLDING_RATE).setScale(2, RoundingMode.HALF_UP);
        BigDecimal grossRounded = gross.setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalDeductions = sss.add(pagibigTotal).add(withholding).setScale(2, RoundingMode.HALF_UP);
        BigDecimal netPay = grossRounded.subtract(totalDeductions).setScale(2, RoundingMode.HALF_UP);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        // === Payslip output ===
        System.out.println("Payslip for: Magdalena Leones");
        System.out.println("--------------------------------------------");
        System.out.println("Monthly salary (base) : P" + df.format(MONTHLY_SALARY));
        System.out.println("Working days in month  : " + WORKING_DAYS);
        System.out.println("Daily rate             : P" + df.format(dailyRate.setScale(2, RoundingMode.HALF_UP)));
        System.out.println();
        System.out.println("Vacation taken (days)  : " + VACATION_DAYS_TAKEN);
        System.out.println("Leave credits available: " + LEAVE_CREDITS_LEFT);
        System.out.println("Paid leave days        : " + paidLeaveDays);
        System.out.println("Unpaid days (deducted) : " + unpaidDays + "  -> deduction P" + df.format(unpaidDeduction.setScale(2, RoundingMode.HALF_UP)));
        System.out.println("Late (minutes)         : " + LATE_MINUTES + " -> deduction P" + df.format(lateDeduction.setScale(2, RoundingMode.HALF_UP)));
        System.out.println();
        System.out.println("Gross pay              : P" + df.format(grossRounded));
        System.out.println();
        System.out.println("Deductions:");
        System.out.println("  SSS (4.5%)           : P" + df.format(sss));
        System.out.println("  Pag-IBIG (incl. backpay) : P" + df.format(pagibigTotal));
        System.out.println("  Withholding (10%)    : P" + df.format(withholding));
        System.out.println("--------------------------------------------");
        System.out.println("Total deductions       : P" + df.format(totalDeductions));
        System.out.println();
        System.out.println("Net pay                : P" + df.format(netPay));
    }
}
