package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestData {
	static int count;
	@BeforeClass
	public static void globalTest(){
		System.out.println("Welcome to Junit Testing...");
		count=0;
	}
	@Before
	public void totalTestCases(){
		count++;
		System.out.println("Test Case No:"+count);
	}

	@Test(expected=ArithmeticException.class)
	public void testDivEx(){
		Data objData=new Data();
	    objData.div(5,0);
	}
	@Test
	public void testDiv(){
		Data objData=new Data();
		assertEquals(2, objData.div(5, 2));
	}
	
	@Test 
	public void testNotNull(){
		Data objData=new Data();
		assertNotNull(objData);
	}
		
	
	@Test 
	public void testGetProperty(){
		Data objData=new Data();
		assertNotNull(objData.getProperty("Bhargav"));
		assertNull(objData.getProperty("Tushar"));
	}
	@Test
	public void testNull(){
		Data objData=null;
		assertNull(objData);
	}
	
	
	
	@Test
	public void testEven(){
		Data objData=new Data();
		assertTrue(objData.even(10));
		assertFalse(objData.even(11));
	}
	@Test
	public void testMinArray(){
		int[] arr={-3,1,5,3,6};
		Data objData=new Data();
		assertEquals(-3, objData.minArray(arr));
	}
	@Test
	public void testMaxArray() {
		int[]arr={4,-2,5,7}; 
		Data objData=new Data();
		assertEquals(7, objData.maxArray(arr));
		
	}
	
	@Test
	public void testSum() {
		Data objDat=new Data();
		assertEquals(5, objDat.sum(2, 3));
		

	}

	@Test
	public void testsayHello() {
		Data objata=new Data();
		assertEquals("Welcome to java...",objata.sayHello());
		
	}
	@Test
	public void testMax() {
		Data objData=new Data();
		assertEquals(3, objData.max(3, 2, 1));
		assertEquals(3, objData.max(2, 3, 1));
		assertEquals(3, objData.max(1, 2, 3));

	}

}


