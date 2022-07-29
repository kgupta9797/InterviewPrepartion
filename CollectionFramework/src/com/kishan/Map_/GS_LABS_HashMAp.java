package com.kishan.Map_;

import java.util.ArrayList;
import java.util.HashMap;

public class GS_LABS_HashMAp {

	public static void main(String args[]) {
		HashMap<String, Integer> hp = new HashMap<String, Integer>();

		ArrayList<String> l = new ArrayList<String>();
		l.add("pune:40");
		l.add("mumbai:50");
		l.add("pune:40");
		l.add("mumbai:10");

		for (int i = 0; i < l.size(); i++) {
			String[] s = l.get(i).split(":");
			System.out.println("Key:" + s[0] + " value:" + s[1]);

			// we have to add the value having same key pune=80, mumbai 60
			if (hp.containsKey(s[0])) {
				hp.put(s[0], hp.get(s[0]) + Integer.parseInt(s[1]));
			} else {
				hp.put(s[0], Integer.parseInt(s[1]));
			}
		}
		System.out.println(hp);
	}
	
}
