package com.kishan.String_Program;

public class DUplicateWord {
	public static void main(String[] args) {
		String str = "kishan gupta hello kishan gupta kishan gupta hello gupta";

		String[] split = str.split(" ");
		// System.out.println(split[0]);
		int count = 0;
		System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					count++;

				}
			}

		}
		System.out.println("count" + count);
	}

}
