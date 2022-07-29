package com.kishan.Project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//solve this approch is TDD approch
//no warning 

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	App ob = new App();

	@Test
	public void isleap() {
		assertTrue(ob.isleap1(1988));
		// assertEquals(ob.isleap1(1988), true);
	}

	// (year % 4 == 0 && (year % 100 != 0) ||(year%400==0)
	@Test
	public void isNotleap() {
		System.out.println("checking");
		assertFalse(ob.isleap1(1989));
		assertEquals(ob.isleap1(1989), false);
	}

	@Test
	public void first() {
	//	int year = 2000;
		System.out.println("first Check");
		assertTrue(ob.isleap1(2000));
	}

	@Test
	public void second() {
		//int year = 2000;
		System.out.println("first Check");
		assertFalse(ob.isleap1(2017));
	}

	@Test
        public void third()
        {//int year=2000;
        	System.out.println("third Check");
        	assertTrue(ob.isleap1(400));
        
    
    
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
}
}
