package com.kishan.LeapYear_Unit_testing;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
//object is not null
//object is null

/// 400 true first condtion is true
// 16 true second condtion true and third are true
// 100 false last condition fail
// 17 middle condion fail
public class AppTest {
	App ob = new App();

	@Test
	public void objectNotNull() {
		assertNotNull(ob);
	}

	@Test
	public void objecNull() {
		ob = null;
		assertNull(ob);
	}
	@Test
	public void divBy16() {
		assertTrue(ob.isleap(1616));
	}

	@Test
	public void divBy400() {
		assertTrue(ob.isleap(2000));
	}

	@Test
	public void divby17() {
		assertFalse(ob.isleap(1717));
	}

	@Test
	public void divby100() {
		assertFalse(ob.isleap(1000));
	}

	@Test(expected = NullPointerException.class)
	public void isIntegerNull() {
		assertTrue(ob.isleap(null));
	//	assertNotNull(ob.isleap(null));
		// System.out.println("hi"+ob.isleap(null));
		// String expeted=null;
		// System.out.println(expeted);
		// boolean isleap = ob.isleap(null);
		// assertEquals(null, ob.isleap(null));
	}
}
