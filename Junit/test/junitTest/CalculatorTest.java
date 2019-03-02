/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitTest;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ronsilva
 */
public class CalculatorTest {
    
    /**
     * Test of sum method, of class Calculator.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testSum() {
   
    System.out.println("assertEquals test:");   
        String obj1;
        obj1 = "test";
        String obj2;
        obj2 = null;
        int[] numbers1 = {1,2,3,4};
        int[] numbers2 = {1,2,3,4};
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = Calculator.sum(a, b);
        assertEquals(expResult, result);
        System.out.println("Passed");   
    
        System.out.println("assertNotSame test:");
        a = 5;
        b = 3;
        result = Calculator.sum(a, b);
        assertNotSame(a, result);
        System.out.println("Passed");
    
        System.out.println("assertSame test:");
        a = 5;
        b = 5;
        assertSame(a, b);
        System.out.println("Passed");
        
        System.out.println("assertTrue test:");
        a = 2;
        b = 5;
        result = Calculator.sum(a, b);
        assertTrue(result== 7);
        System.out.println("Passed");
    
        System.out.println("assertFalse test:");
        a = 5;
        b = 5;
        result = Calculator.sum(a, b);
        assertFalse(result==9);
        System.out.println("Passed");
        
        System.out.println("assertThat test:");
        a = 2;
        b = 3;
        expResult = 5;
        result = Calculator.sum(a, b);
        assertThat(result, is(expResult));
        System.out.println("Passed");
    
        System.out.println("assertNotNull test:");
        assertNotNull(obj1);
        System.out.println("Passed");
        
        System.out.println("assertNull test:");
        assertNull(obj2);
        System.out.println("Passed");
        
        System.out.println("assertArrayEquals test:");
        assertArrayEquals(numbers1, numbers2);
        System.out.println("Passed");
    }
}
