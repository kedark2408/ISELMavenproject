package com.testing.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleUtilTest {
    @Test
	public void testAdd() {
        	System.out.println("add");
        	Integer a = 20;
        	Integer b = 30;
        	Integer expResult = 50;
        	Integer result = SampleUtil.add(a, b);
			assertEquals(expResult,result);
			assertEquals(expResult,SampleUtil.add(40, 10));
			assertEquals(expResult,SampleUtil.add(20, 30));
			assertEquals(null,SampleUtil.add(10, null)); 	
        			
	}
}
