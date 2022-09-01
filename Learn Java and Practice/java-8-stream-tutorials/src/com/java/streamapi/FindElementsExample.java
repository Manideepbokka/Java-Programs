package com.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8);
		//Find elements in list
		Optional<Integer> element=li.stream().findFirst();
		if(element.isPresent())
		{
			System.out.println(element.get());
		}
		else
		{
			System.out.println("stream is empty");
		}
		
		Optional<Integer> elem2=li.stream().findAny();
		if(elem2.isPresent())
		{
			System.out.println(elem2.get());
		}
		else
		{
			System.out.println("stream is empty");
		}

	}

}
