package com.kishan.Array_Program;

import java.util.HashSet;
import java.util.Set;

/*Write a java program to find duplicate elements 
in an array?*/
public class Duplicates_fromArray {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = { 1, 1,2, 2, 0,3,4,5,6,76,7,6,7};

		Set<Integer> aset = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(aset.add(arr[i])==false)
			{
				System.out.println(arr[i]);
			}
			boolean add = aset.add(arr[i]);
			
			System.out.println(aset);
		}

	}
}
