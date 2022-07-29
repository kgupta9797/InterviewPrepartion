package com.kishan.String_Program;

//Program to replace lower-case characters with upper-case and vice versa.
public class lowercaseToUppercase {

	public static void main(String[] args) {

		String str1 = "Great Power";
		StringBuffer newStr = new StringBuffer(str1);
		for (int i = 0; i < str1.length(); i++) {

			if (Character.isUpperCase(str1.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			} else {
				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}

		}
		System.out.println(newStr);

	}
}

/*
 * for (int i = 0; i < newStr.length(); i++) { if
 * (Character.isUpperCase(newStr.charAt(i))) { sBuffer.setCharAt(i,
 * Character.toUpperCase(string.charAt(i))); System.out.println(sBuffer); }
 * 
 * else { sBuffer.setCharAt(i, Character.toLowerCase(string.charAt(i)));
 * 
 * }
 * 
 * } System.out.println(sBuffer); }
 * 
 * }
 */