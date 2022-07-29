package com.kishan.String_Program;

import java.util.HashMap;

public class Occuerence_String {
	public static void main(String args[]) {
		String str = "hi i am kishan hi i am kishan";
		String[] split = str.split(" ");

		HashMap<String, Integer> map = new HashMap<>();
		for (String s : split)

		{
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}

}
