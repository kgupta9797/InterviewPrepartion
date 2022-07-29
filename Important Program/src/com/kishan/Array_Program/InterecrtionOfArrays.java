package com.kishan.Array_Program;
//Write a java program to find the intersection of two arrays
public class InterecrtionOfArrays {

	public static void main(String[] args) {

		int arr1[]= {1,3,5,7,9,6};
		int arr2[]= {2,3,6,8,9,1};
		//intersection be line{1,3,6,9}
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
				System.out.print(":"+arr2[j]);	
				}
			}
		}
	}

}
