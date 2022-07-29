package com.kishan.Array_Program;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] arr = { 7, 7, 6, 6, 4, 2, 4, 5, 1 };
		Arrays.sort(arr);
		int[] unique = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				unique[j] = arr[i];
				j++;
			}
		}
		unique[j++] = arr[arr.length - 1];
		for (int i = 0; i < unique.length; i++) {
			System.out.print(unique[i]);
		}
	}

}
