package com.kishan.unitTest.TESTTDD;

public class App {

	public boolean leap(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			// System.out.println("is leap :"+year);
			return true;
		}
		{
			// System.out.println("is not leap :"+year);
			return false;
		}
	}

	public boolean stringTest(String string) {
		if (string.length() == 0 && string.isBlank()
				|| !string.matches("[0-9]{4}")) {
			return false;
		}
		int year = Integer.parseInt(string);
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
