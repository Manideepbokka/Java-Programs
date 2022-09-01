package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
public static void main(String args[])
{
	List<String> l=new ArrayList<>();
	//list allows dups.
	l.add("element1");
	l.add("element2");
	l.add("element3");
	l.add("element1");
	l.add("element2");
	System.out.println(l);
	
	l.add(null);
	l.add(null);
	l.add(null);
	//List allows null in it.
	System.out.println(l);
	
	//List maintains insertion order.
	//access elements from list.
	System.out.println(l.get(0));
	System.out.println(l.get(2));
	
	
}
}
