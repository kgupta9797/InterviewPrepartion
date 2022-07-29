package com.kishan.String_Program;

public class N_equal_parts {
	/*
	 * str = "aaaabbbbcccc"
	 *  Equal parts of given string are aaaa bbbb cccc
	 */	
	public static void main(String[] args) {
		String str="aaabbbccc";
		int n=3;
		int div=str.length()/n;
		System.out.println(div);
		
		for(int i=0;i<str.length();i++)
			str.charAt(i);
	}

}
