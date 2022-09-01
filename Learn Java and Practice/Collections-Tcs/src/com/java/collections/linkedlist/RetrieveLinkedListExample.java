package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RetrieveLinkedListExample {
public static void main(String args[])
{
	LinkedList<String> fts=new LinkedList<>();
	fts.add("Apple");
	fts.add("Orange");
	fts.add("Mango");
	fts.add("Pineapple");
	
	System.out.println(fts.getFirst());
	System.out.println(fts.getLast());
	
	for(String st:fts)
	{
		System.out.println(st);
	}
}
}
