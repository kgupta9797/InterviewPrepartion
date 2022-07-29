package com.kishan.Array_Program;

/*i/p {1,3,5,7,9,2,,4,6,8,0}--->{even 2,4,6,8} {odd 1,3,5,7}*/
//print even and odd from array
public class PrintEventOddNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				
				System.out.print("even " + arr[i]);
			} else {
				System.out.print("odd :"+arr[i]);
			}
		}

	}

}
