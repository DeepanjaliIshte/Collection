package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> hm= new HashMap<Integer, String>();
	hm.put(101,"Atul");
	hm.put(102, "Arvind");
	hm.put(103, "Amol");
	hm.put(109, "Tejas");
	hm.put(null, "ojas");
	hm.put(101, "lucifer");
	hm.put(110, null);
	hm.put(111, "atul");
 	System.out.println(hm);
 	Set<Integer> s=hm.keySet();
 	for(Integer i:s) {            //i:s for each loop
 		System.out.println(i);
 	}
 	Collection<String> li=hm.values();
 	for(String s1:li) {
 		System.out.println(s1);
 		
 	}
}

}
