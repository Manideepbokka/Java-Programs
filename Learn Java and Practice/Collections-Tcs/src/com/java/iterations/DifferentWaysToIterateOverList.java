package com.java.iterations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses=Arrays.asList("C","C++","Java","Spring","Hibernate","Spring Boot");
		//Basic for Loop
		for(int i=0;i<courses.size();i++)
		{
			System.out.println(courses.get(i));
		}
		//For-Each Loop
		for(String i:courses)
		{
			System.out.println(i);
		}
		
		//Iterator with while loop
		Iterator<String> i=courses.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//Java8 Stream+lambda
		
		courses.stream().forEach(c->System.out.println(c));
		
		//Java8 forEach+lambda
		
		courses.forEach((course)->{System.out.println(course);});
		
		

	}

}
