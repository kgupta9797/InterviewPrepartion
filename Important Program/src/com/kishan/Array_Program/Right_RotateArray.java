package com.kishan.Array_Program;
/*Given an array, rotate the array by one position
in clock-wise direction.*/

public class Right_RotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
//op->     {5,1,2,3,4}

		int temp;
		for (int i = arr.length - 1; i > 0; i--) {
			temp = arr[i];
			arr[i] = arr[i - 1];
			arr[i - 1] = temp;
		}
		for (int ar : arr)
			System.out.print(ar);
	}

}
