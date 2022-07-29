package com.kishan.Map_;

public class ATest {
public static void main(String[] args) {
	int num[]= {6,4,3,5,2,1,6, 6,6};
	int target=12;
	ATest ob  = new ATest();
	ob.findparofarray(num, target);
}
public void findparofarray(int arr[],int target)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==target)
			{
				System.out.println(arr[i]+":"+arr[j]+":"+target);
				
			}
		}
	}
	}
	
}
