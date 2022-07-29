package com.kishan.Project;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

//year is leap year
public class App {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		//System.out.println();
		// System.out.println("Enter a year");

//    	year=sc.nextInt();
//    	
//    	if(year%4==0 && (year%100==0))
//    	{
//    		System.out.println("Year is leap Year");
//    		
//    	}
//    	else
//    	{
//    		System.out.println("Year is not leap Year");
//    	}
//    	
//    }
	}

	public boolean isleap1(int year) {

//		Scanner sc = new Scanner(System.in);
//		year = sc.nextInt();

		if (year % 4 == 0 && (year % 100 != 0) ||(year%400==0)) {
			System.out.println("Year is leap Year");
			return true;

		} else {
			System.out.println("Year is not leap Year");
			return false;
		}
	}

}
