package com.kishan.Array_Program;

import java.util.Arrays;

public class Find_SMallest_Largest {

	public static void main(String[] args) {
		int[] arr = { -1, -2, -9, 20, 2, 54, 99999, -999 };
		/*
		 * System.out.println("using buil in function"); Arrays.sort(arr);
		 * System.out.println(Arrays.toString(arr)); int smallest = arr[0]; int largest
		 * = arr[arr.length - 1]; System.out.println("smallest" + smallest + "largest" +
		 * largest);
		 */
		System.out.println("-----------using brutforce Approach---------");
		int small = arr[0];
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest=arr[i];
			}
			else if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println("small:"+small+""+"large:"+largest);
	}

}
