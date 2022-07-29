package com.kishan.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		System.out.println(map);
		System.out.println(map.get("a"));

		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next + ":" + map.get(next));
			//using for each
			map.forEach((k,v)->System.out.println(k+":"+""+v));
			
		}

	}

}
