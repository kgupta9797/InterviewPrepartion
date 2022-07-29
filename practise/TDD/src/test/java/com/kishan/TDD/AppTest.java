package com.kishan.TDD;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
  //400,16
	//17, 100
	App ob = new App();
    @Test
    public void integercheck()
    {
    	
		assertTrue(ob.isleap(400));
		assertTrue(ob.isleap(16));
		assertFalse(ob.isleap(1000));
		assertFalse(ob.isleap(1717));
		
		assertTrue(ob.stringChck("4000")); //false
		assertFalse(ob.stringChck(""));
	//	assertFalse(ob.stringChck("4000"));

    }
    @Test
    public void objectnotNull()
    {
    	assertNotNull(ob);
		
    }
    @Test
    public void objectNull()
    {
    	ob=null;
    	assertNull(ob);
		
    }
    
}
