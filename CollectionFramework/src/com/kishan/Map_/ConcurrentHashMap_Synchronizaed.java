package com.kishan.Map_;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class ConcurrentHashMap_Synchronizaed {
public static void main(String[] args) {
	
	HashMap<Integer, String>hashMap =new HashMap<Integer,String>();
	hashMap.put(1, "ade");
	hashMap.put(2, "ttt");
	hashMap.put(3, "tt");
	hashMap.put(4, "d");
	
	Map<Integer,String> synchronizedMap = Collections.synchronizedMap(hashMap);
	
	System.out.println(synchronizedMap);
	
	
	
 ConcurrentHashMap<Integer, String> concurrentHashMap=new ConcurrentHashMap<Integer,String>();
 concurrentHashMap.put(1, "ade");
 concurrentHashMap.put(2, "ttt");
 concurrentHashMap.put(3, "tt");
 concurrentHashMap.put(4, "d");
 System.out.println(concurrentHashMap);
	
	
}
}
