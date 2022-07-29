package com.kishan.LeapYear_Unit_testing;

import java.util.Scanner;

public class App 
{
//    public static void main( String[] args )
//    {
////    	App ob = new App();
////    	System.out.println("Enter year to be check..");
////    	Scanner sc = new Scanner(System.in);
////    	int year=sc.nextInt();
////    	System.out.println("is Leap:"+ob.isleap(year));
//       
//    }
    
    public   boolean isleap(int year)
    {
    	if(year%400==0 || year%4==0 && year%100!=0)
    	{
    	return true;
    	}
    	else
    	{
    		return false;
    	}
    }//400 true first condtion is true
     //16  true second condtion true and third are true
     //100 false last condition fail
     //17 middle condion fail
}
