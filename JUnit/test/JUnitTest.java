/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.JUnit;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 *
 * @author adam
 */
public class JUnitTest {
    
   JUnit calc;
       
    @Before
    public void before() {
        calc = new JUnit();
    }
    
    @After
    public void after() {
        calc.clear();
    }
  
    @Test
    public void testAdd() {
        int result = calc.add(2, 3);
        int expected = 5; // 2 + 3 = 5
        assertEquals(expected, result);
    }
    
    @Test
    public void testAnsAdd() {
        calc.add(2,3);
        int result = calc.ans();
        int expected = 5; // 2 + 3 = 5
        assertEquals(expected, result);
    }
    
    @Test
    public void testSub() {
        calc.sub(5, 4);
        int result = calc.ans();
        int expected = 0; // 5 - 4 = 1
        assertEquals(expected, result);
    }
    
}