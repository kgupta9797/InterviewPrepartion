package com.kishan.String_Program;

/**
 * @author kisha
 *
 */
public class StringReplacewithCharcter {

	public static void main(String[] args) {
		
		String string = "kishan gupta i am doing for better opportinity";
		
		string=string.replaceAll("\\s", "_");
		//string=string.replace(" ",""); also working fine
		System.out.println(string);

	}

}
