package com.kishan.Array_Program;

public class CopyArrayIntoAntherArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		for (int a : arr2) {
			System.out.println(a);
		}
		//reverse print
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("print array for even postiton");
		for (int i = 0; i < arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
