package com.kishan.String_Program;

import java.util.Arrays;

public class duplicate_charcter {
	public static void main(String[] args) {
		String string = "helllo";
		string = string.toLowerCase();

		char[] charArray = string.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		int count = 0;

		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length - 1; j++) {
				if (charArray[i] == charArray[j]) {
					System.out.print(charArray[i]);
					count++;
				}
			}
			// System.out.print(charArray[i]);
		}
		System.out.println("count" + count);
		System.out.println();
	}
}
