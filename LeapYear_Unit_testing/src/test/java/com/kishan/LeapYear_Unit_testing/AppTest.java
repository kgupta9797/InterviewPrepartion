package com.kishan.LeapYear_Unit_testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	App ob = new App();

	@Test
	public void firstCondition() {
		assertTrue(ob.isleap(400)); // div by 400

	}

	@Test
	public void SecondCondition() {
		assertTrue(ob.isleap(16)); // div by 4

	}

	@Test
	public void thirdCondition() {
		assertFalse(ob.isleap(17)); // div by 4

	}

	@Test
	public void fourthCondition() {
		assertFalse(ob.isleap(100)); // div by 100
		}

	@Test
	public void ObisNull() {
		assertNotNull(ob); // div by 400
}
	@Test
	public void withEmptyInput()
	{
	//	int expected=0;
		//assertEquals(expected, ob.isleap());
	}
	//user can give empty input

}
