package com.kishan.Java_8_Program;
//Program to find the frequency of each element in the array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuerenceOfElement {

	public static void main(String[] args) {
		
		Integer arr[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,6,78,9};
		ArrayList arlist = new ArrayList<>(Arrays.asList(arr));
	System.out.println(arlist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));	
		
		
		
		
		
		
		for(int i=0;i<arlist.size();i++)
		{
			System.out.print(arlist.get(i));
		}

	}

}
