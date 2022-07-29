package com.kishan.String_Program;

public class SubSetOfString_ {

	public static void main(String[] args) {
		String string="kishan";
		int len=string.length();
		//n(n+1)/2
		String []strings = new String[len*(len+1)/2];
		int temp=0;
		
		for(int i=0;i<string.length();i++)
		{
			for(int j=i;j<string.length();j++)
			{
				strings[temp]=string.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<strings.length;i++)
		System.out.println(strings[i]);
		

	}

}
