package com.kishan.Map_;

import java.util.HashMap;

public class HashSetNullCheck {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(null, null);
		map.put(null, "Kishan");
		map.put(null, null);
		
		
		System.out.println(map);

	}

}
