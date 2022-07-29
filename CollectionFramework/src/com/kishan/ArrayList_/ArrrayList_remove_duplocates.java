package com.kishan.ArrayList_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrrayList_remove_duplocates {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(
				Arrays.asList(1, 1, 9, 1, 2, 2, 2, 3, 3, 4, 5, 6, 66, 6, 7, 8, 9));
		LinkedHashSet<Integer> nl = new LinkedHashSet<Integer>(al);
		System.out.println(al);
		System.out.println(nl);
		ArrayList<Integer> sal = new ArrayList<Integer>(
				Arrays.asList(1, 1, 9, 1, 2, 2, 2, 3, 3, 4, 5, 6, 66, 6, 7, 8, 9));
		List<Integer> collect = sal.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);
		

	}

}
