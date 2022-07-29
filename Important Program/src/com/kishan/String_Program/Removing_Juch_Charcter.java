package com.kishan.String_Program;

public class Removing_Juch_Charcter {

	public static void main(String args[])
	{
		int num=12345;
		int rev = 0,rem;
		String str="325345kishan gupta876543214567890i hello @@@";
		String str1=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);
		System.out.println("Reverse of Number:");
while(num!=0)		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.print(rev);
	}
}
