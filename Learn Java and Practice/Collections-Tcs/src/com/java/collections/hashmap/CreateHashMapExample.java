package com.java.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CreateHashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> ms=new HashMap<>();
	
		ms.put("Manideep", 1);
		ms.put("Bokka", 2);
		ms.put("Victor", 3);
		ms.put("Nikhil", 4);
		ms.put("Karna", 5);
		ms.put(null, 6);
		
		
		System.out.println(ms);
		
		System.out.println(ms.isEmpty());
		System.out.println(ms.size());
		System.out.println(ms.containsKey("Victor"));
		System.out.println(ms.containsValue(5));
		
		//get value by key
		int vs=ms.get("Bokka");
		System.out.println(vs);
		
		//get all keys
		Set<String> ex=ms.keySet();
		System.out.println(ex);
		
		//get all values
		Collection<Integer> ix=ms.values();
		System.out.println(ix);
		
		//different ways to iterate over hashmap
		
		//forEach method
		for(Map.Entry<String, Integer> exsp : ms.entrySet())
		{
			System.out.println(exsp.getKey() +"  "+ exsp.getValue());
			
		}
		//using iterator
		Set<Map.Entry<String,Integer>> smpd=ms.entrySet();
		Iterator<Map.Entry<String,Integer>> itr=smpd.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry<String, Integer> entry=itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//hashmap using java8 forEach
		ms.forEach((K,V)->{
			System.out.println(K+"  "+V);
		});
		

	}

}


//Integer.valueOf(5) Autoboxing
//i.intValue()   unboxing