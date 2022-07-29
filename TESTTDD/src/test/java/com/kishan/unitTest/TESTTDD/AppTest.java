package com.kishan.unitTest.TESTTDD;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
	App ob = new App();
   
    @Test
   public void divby400()
   {
    	assertTrue(ob.leap(400));
    	assertTrue(ob.leap(1616));
    	assertFalse(ob.leap(1000));
    	assertFalse(ob.leap(1717));
    	assertTrue(ob.stringTest("4000"));
    	assertFalse(ob.stringTest(""));
    	assertFalse(ob.stringTest("abcd"));
    	//assertTrue(ob.leap(Integer.parseInt("400")));
   }
    @Test
    public void ObjectNotNull()
    {
    //	ob=null;
     	assertNotNull(ob);
    }
    @Test
    public void ObjectNull()
    {
    	ob=null;
     	assertNull(ob);
    }
}
