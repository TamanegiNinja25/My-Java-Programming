/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;

/**
 *
 * @author 稲村カルロ
 */
public class ItemTaxCalculator {
    public double CalculateItemTax (double itemPrice, double taxPercent){
        double decrease = taxPercent / 10.0;
        return itemPrice * decrease;
    }
}
