package com.kishan.String_Program;

//total subset of string
public class SUbsetOfString {

	public static void main(String[] args) {
		String string = new String("Fun");
		int len = string.length();
		int temp = 0;
		// n(n+1)/2
		String[] strarray = new String[len * (len + 1) / 2]; // posible subset size

		for (int i = 0; i < string.length(); i++) {
			for (int j = i; j < string.length(); j++) {
				strarray[temp] = string.substring(i, j + 1);
				temp++;
			}
		}
		for (int i = 0; i < strarray.length; i++)
			System.out.println(strarray[i]);
	}
}
