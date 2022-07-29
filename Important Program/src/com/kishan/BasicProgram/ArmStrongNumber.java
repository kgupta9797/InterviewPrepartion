package com.kishan.BasicProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int orinum = 1534;
		int num1=orinum;
		
		int countdigit=0;
		while(orinum>0)
		{
			orinum=orinum/10;
			countdigit++;
		}
		System.out.println(countdigit);
			
		int num=orinum; 
		int rem;
		int sum=0;
		while(num>0)
		{
			rem=num%10; //to find last digit i.e. rem
			sum= (int) (sum+Math.pow(orinum, countdigit));				//(rem*rem*rem);  //cube all seperate element
			num=num/10; //to find  remaining two digit
		}
		//System.out.println(sum);
		if(sum==num1)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

	}

}
