package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveElemntsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> som=new ArrayList<>();
		som.add("Apple");
		som.add("Mango");
		som.add("Orange");
		som.add("Pineapple");
		som.add("Coconut");
		
		System.out.println(som.remove(4));
		System.out.println(som.remove("Mango"));
		System.out.println(som);
		List<String> somsublist=new ArrayList<>();
		somsublist.add("Pineapple");
		somsublist.add("Orange");
		
		som.removeAll(somsublist);
		
		System.out.println(som);
		
		
		som.clear();
		System.out.println(som);

	}

}
