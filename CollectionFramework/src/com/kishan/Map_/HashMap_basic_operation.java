package com.kishan.Map_;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;

public class HashMap_basic_operation {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(111, "kishan");
		h.put(222, "kishan");
		h.put(333, "khan");
		h.put(444, "khan");
		h.put(555, "kian");
		h.put(666, "kn");
		h.put(null, "intellict");
		System.out.println(h.size());
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());

		Set<java.util.Map.Entry<Integer, String>> s1 = h.entrySet();
		for (java.util.Map.Entry<Integer, String> es : s1) {
			System.out.println(es);
		}
	}

}
