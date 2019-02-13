/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.JUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adam
 */
public class JUnitTest {
    
    //assertEquals
	@Test
	public void testRectangle() {	
		JUnit test = new JUnit();
		int result = test.rectangle(2, 5);
		int testValue = 10;
		assertEquals(testValue, result);			
	}
	
	//assertFalse and assertTrue
	@Test
	public void testEvenNumber(){
		JUnit test = new JUnit();
		int testValue1 = 3;
		assertFalse(test.isEvenNumber(testValue1));
		int testValue2 = 4;
		assertTrue(test.isEvenNumber(testValue2));		
	}
	
	//assertNotNull and assertNull
    @Test
    public void testGetNullValue(){
        JUnit test = new JUnit();
        String testValue1 = "key1";
        assertNotNull(test.getValue(testValue1));
        String testValue2 = "key1";
        //assertNull(test.getValue(testValue2));
    }
    
    //assertSame and assertNotSame
    @Test
    public void testGetSameValue(){
        JUnit test = new JUnit();
        String testValue1 = "key1";    
        String testValue2 = "key2";  
        assertSame(test.getValue(testValue1), test.getValue(testValue1));
        assertNotSame(test.getValue(testValue1), test.getValue(testValue2));
    }    
    
    //assertArrayEquals
    @Test
    public void testGetTheStringArray() {
        JUnit test = new JUnit();
        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray =  JUnit.stringArray();
        assertArrayEquals(expectedArray, resultArray);
    }
    
}