package com.kishan.ArrayList_;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class TraverseListUsingJava_8 {
//trverse a liost using java 8
	public static void main(String arg[])
	{
		List<Integer> l = new ArrayList();
		for(int i=0;i<=10;i++)
		l.add(2*i);	
		
		System.out.print(l);
			
		l.stream().collect(Collectors.toList()).forEach(i->System.out.println(i));
	}
}
