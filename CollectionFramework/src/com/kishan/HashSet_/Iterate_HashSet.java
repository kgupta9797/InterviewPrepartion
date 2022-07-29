package com.kishan.HashSet_;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Iterate_HashSet {
	public static void main(String args[]) {
		HashSet<String> books = new HashSet();
		books.add("C programming");
		books.add("Java ");
		books.add("Data Strucutre");
		books.add("Data Strucutre");
		books.add("os");
		books.add("Hibernate");
		books.add("Spring");
		System.out.println("iteration of book");
		books.forEach(s -> System.out.println(s));// using for each

		System.out.println("Using enhance for loop");
		for (String book : books) {
			System.out.print(book);
		}

		System.out.println("using java 8");
		books.stream().collect(Collectors.toList()).forEach(s -> System.out.println(s));
		System.out.println("count no of element");
		long count = books.stream().count();
		System.out.println(count);
	}

}
