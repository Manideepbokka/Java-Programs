package com.java.collections.linkedlist;

import java.util.LinkedList;

public class CreateLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fts=new LinkedList<>();
		fts.add("Apple");
		fts.add("Orange");
		fts.add("Mango");
		fts.add("Pineapple");
		System.out.println(fts);
		fts.add(2,"WaterMelon");
		
		fts.addFirst("Strawberry");
		fts.addLast("MuskMelon");
		System.out.println(fts);

	}

}
