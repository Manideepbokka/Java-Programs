package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fts=new LinkedList<>();
		fts.add("Apple");
		fts.add("Orange");
		fts.add("Mango");
		fts.add("Pineapple");
		
		fts.removeFirst();
		fts.removeLast();
		System.out.println(fts);
		fts.remove("Mango");
		fts.clear();
		System.out.println(fts);

	}

}
