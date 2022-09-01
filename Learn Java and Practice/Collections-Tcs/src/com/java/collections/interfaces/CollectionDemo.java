package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
public static void main(String args[])
{
	Collection<String> coll=new ArrayList<>();
	coll.add("Apple");
	coll.add("Mango");
	coll.add("orange");
	System.out.println(coll);
	
	coll.remove("Apple");
	System.out.println(coll);
	
	System.out.println(coll.contains("Mango"));
	
	coll.forEach((x)->{
		System.out.println(x);
	});
	
}
}
