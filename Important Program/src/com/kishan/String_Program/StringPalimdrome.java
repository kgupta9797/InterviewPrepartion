package com.kishan.String_Program;

import java.util.Iterator;

public class StringPalimdrome {
	public static void main(String[] args) {

		String string = "aba";
		// this also be fine
		/*
		 * StringBuffer bgBuffer=new StringBuffer(string); StringBuffer reverse =
		 * bgBuffer.reverse(); String string2 = new String(reverse);
		 * System.out.println(reverse);
		 * 
		 * if(string.equalsIgnoreCase(string2)) System.out.println("palimdrome"); else {
		 * System.out.println("not palim drone"); }
		 * 
		 */

		String reverStr = "";

		for (int i = string.length() - 1; i >= 0; i--) {
			reverStr = reverStr + string.charAt(i);

		}
		if (string.equalsIgnoreCase(reverStr)) {
			System.out.println(reverStr);
			System.out.println("palimdrome");
		}

		else

		{
			System.err.println(reverStr);
			System.out.println("not palim drone");
		}

	}
}
