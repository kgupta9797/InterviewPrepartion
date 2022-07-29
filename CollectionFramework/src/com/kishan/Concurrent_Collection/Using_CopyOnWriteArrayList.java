package com.kishan.Concurrent_Collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class Using_CopyOnWriteArrayList {

	public static void main(String[] args) {
CopyOnWriteArrayList<String> al  = new CopyOnWriteArrayList<String>();
al.add("k");
al.add("b");
al.add("b");
al.add("v");
al.add("kddd");
al.add("kddd");
System.out.println(al);
//here no need to of Synchronizaed keyword beacause it is alerdy thread sage
	}

}
