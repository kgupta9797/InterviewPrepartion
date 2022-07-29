package com.kishan.Java_8_Program;

import java.util.Random;
import java.util.SortedSet;

public class GenerateRandomNumbers {
public static void main(String[] args) {
	Random random = new Random();
	//random.
	random.ints(1,100).limit(10).sorted().forEach(System.out::println);
}
}
