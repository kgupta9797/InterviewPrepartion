package com.kishan.String_Program;

public class ValidIpAddresss {

	public static void main(String[] args) {

		String s = "555.5555.555.55.50.222.233.4.0.123.45.059.245.267.289.215";

		String[] str = s.split("\\.");
		for (int i = 0; i < str.length; i++) {
			// System.out.println(""+i+": "+str[i]); str[0]555,str[1]5555
			if (Integer.parseInt(str[i]) <= 255) {
				System.out.println("valid :" + str[i]);
			} else {
				System.out.println("not valid :" + str[i]);
			}
		}
	}

}
