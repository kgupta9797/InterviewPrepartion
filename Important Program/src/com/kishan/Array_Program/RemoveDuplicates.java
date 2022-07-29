package com.kishan.Array_Program;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 4, 5, 6, 7 };
		int unque[] = new int[arr.length];
		int j=0;
		//int temp=0;
		for (int i = 0; i < arr.length-1; i++) 
			{
				if(arr[i]!=arr[i+1])
				{
					unque[j]=arr[i];
					j++;
				}
				
			}
		unque[j++]=arr[arr.length-1];
		for(int n:unque)
		{
			System.out.print(n);
		}
	}
}
