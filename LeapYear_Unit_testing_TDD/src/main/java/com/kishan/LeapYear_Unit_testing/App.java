package com.kishan.LeapYear_Unit_testing;

public class App {
	
///
	public boolean isleap(Integer year) {
		if(year==null)
		{
			//System.out.println("null pointer exception");
			throw new NullPointerException("num is null");
		}
		if
		(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	/// 400 true first condtion is true
	// 16 true second condtion true and third are true
	// 100 false last condition fail
	// 17 middle condion fail
}
