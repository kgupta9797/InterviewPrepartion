package com.kishan.Concurrent_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConcurrentArraylist_using_Synchronized_method {

	public static void main(String[] args) {
//		   List list = Collections.synchronizedList(new ArrayList(...));

		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("k");
		list.add("ss");
		// ArrayList<String> al=Collections.synchronizedCollection(list);
//
		synchronized (list) { //synchronized keyword needed for explicit synchronizaed
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}

	}

}
