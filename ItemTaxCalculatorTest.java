/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.taxcalculator.ItemTaxCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 稲村カルロ
 */
public class ItemTaxCalculatorTest {
    @Test
    public void testCalculateItemTax(){
        System.out.println("CalculateItemTax Method!");
        ItemTaxCalculator instance = new ItemTaxCalculator();
        double itemPrice = 50.0;
        double taxPercent = 1.0;
        double expectedResult = 5.0;
        double result = instance.CalculateItemTax(itemPrice, taxPercent);
        assertEquals(expectedResult, result, 0.0);
    }
    public ItemTaxCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

}
