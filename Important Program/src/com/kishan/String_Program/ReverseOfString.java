 
package com.kishan.String_Program;

public class ReverseOfString {

	
	public static void main(String[] args) {

		String string="Hello i am kishan i want store this string in reverse order";
		
		String reverstring = "";
		
		for (int i = string.length()-1; i > 0; i--) {
			reverstring=reverstring+string.charAt(i);
		}
		System.out.println(reverstring);
	}

}
