package com.kishan.String_Program;

public class Seperate_CharcterFormString {

	
	public static void main(String[] args) {
		String string="hello i am kishan";
		char[] arr =string.toCharArray();
	
		for(char e:arr)
		System.out.print(","+e);
	//second approch
		System.out.println();
		for(int i=0;i<string.length();i++)
		{
			
			System.out.print("|"+string.charAt(i));
		}
		
	}

}
