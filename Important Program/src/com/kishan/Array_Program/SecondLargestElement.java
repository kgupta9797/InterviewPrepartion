package com.kishan.Array_Program;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 10,5,10};
Arrays.sort(arr);
for(int a:arr)
System.out.print(a);
System.out.println(":"+arr[arr.length-2]);
	}

}
