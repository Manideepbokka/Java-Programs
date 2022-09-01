package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIteartion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> samp=new LinkedList<>();
		samp.add("C");
		samp.add("C++");
		samp.add("Python");
		samp.add("Java");
		samp.add("C#");
		samp.add("C#");
		boolean result=samp.contains("C");
		System.out.println(result);
		
		int index=samp.indexOf("Python");
		System.out.println(index);
		
		int li=samp.lastIndexOf("C#");
		System.out.println(li);
		
		Iterator<String> it=samp.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		samp.forEach((s)->System.out.println(s));
		
		for(String i:samp)
		{
			System.out.println(i);
		}
		
	}

}
