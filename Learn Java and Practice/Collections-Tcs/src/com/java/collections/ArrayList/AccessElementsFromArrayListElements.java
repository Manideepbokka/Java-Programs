package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<>();
		
		System.out.println(li.isEmpty());
		
		li.add("Python");
		li.add("Java");
		li.add("c#");
		li.add("JavaScript");
		
		System.out.println(li.isEmpty());
		
		System.out.println(li.size());
		
		System.out.println(li.get(2));
		li.set(2, "Ruby");
		System.out.println(li);
		

	}

}
