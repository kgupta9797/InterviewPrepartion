package com.kishan.Array_Program;

public class missingNumberFromArray {
public static void main(String[] args) {
	int arr[] ={6,4,3,2,1};// 5 is missing
	int n=6;//one missing+ above 5
	int sumof_n=n*(n+1)/2;
	System.out.println("sum of all number upto 6:"+sumof_n );
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);
	System.err.println("the missing number form array is:"+(sumof_n-sum));
}
}
