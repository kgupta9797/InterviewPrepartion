package com.kishan.Array_Program;

public class ArrayInDescending_order {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) //(4,5)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(" "+arr[i]);
		}
		
	}

}
