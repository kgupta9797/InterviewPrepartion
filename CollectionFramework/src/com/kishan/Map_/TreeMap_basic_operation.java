package com.kishan.Map_;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_basic_operation {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();//(Collections.reverseOrder());
		tmap.put(9, "kishan");
		tmap.put(7, "ki");
		tmap.put(3, "kian");
		tmap.put(4, "kshan");
		tmap.put(2, "khan");
		tmap.put(5, "kishan");
		tmap.put(6, "an");
		tmap.put(8, "kishan");
		tmap.put(0, "ki");
		NavigableSet<Integer> descendingKeySet = tmap.descendingKeySet();
		System.out.println(descendingKeySet);

	//	SortedMap<Integer, String> subMap = tmap.subMap(2, 8);
		//System.out.println(subMap);
		SortedMap<Integer, String> tailMap = tmap.headMap(5);
	System.out.println(tailMap);
	}

}
