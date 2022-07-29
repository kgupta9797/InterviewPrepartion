package com.kishan.Map_;

import java.util.HashMap;
import java.util.Iterator;

public class Occurence_of_String {
	public static void main(String args[]) {
		String str = "hi am a kishan am kishan hi hi hi";
		String[] s = str.split(" ");
		//int ocur = 0;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String tempString : s)
		{
			//if (hm.get(tempString) != null) {
			if(hm.containsKey(tempString)) {
				hm.put(tempString, hm.get(tempString)+1);

			}
			else
			{
				hm.put(tempString, 1);
		    }
		}
		System.out.println(hm);
	int a=	hm.get("hi");
	System.out.println("a"+a);
	Iterator<String> iterator = hm.keySet().iterator();
	while(iterator.hasNext())
	{
		String next = iterator.next();
		if(hm.get(next)>1)
		{
			System.out.println(next+" no of time:"+hm.get(next));
		}
	}

	}

}
