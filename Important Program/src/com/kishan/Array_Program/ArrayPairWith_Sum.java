package com.kishan.Array_Program;

/*Write a java program to find all pairs of elements
in an integerarray whose sum is equal to a given number
*/public class ArrayPairWith_Sum {

	// {1,2,3,4,5,6}->5{(1,4),(2,3),(3,2),(4,1)}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 4, 3, 6 };
		int num = 5;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == num && i != j) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}

	}

}
