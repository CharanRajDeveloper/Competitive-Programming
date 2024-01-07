package com.logical.programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {
	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(12, "Charan");
		map.put(34,"Raj");
		map.put(1,"Shiva");
		
		System.out.println("Using keySet");
		//Using KeySet
		Set<Integer> i=map.keySet();
		for(int a:i) {
			System.out.println(a+"::"+map.get(a));
		}
		System.out.println("Using EntrySet");
		//Using EntrySet
		for(Map.Entry<Integer,String> m :map.entrySet()) {
			System.out.print("Key:"+m.getKey()+" Value:"+m.getValue()+"\n");
		}
		System.out.println("Using for While Loop");
		//Using while loop
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> kv=(Entry<Integer, String>) it.next();
			System.out.print(kv.getKey()+":"+kv.getValue()+"\n");
		}
	}

}
