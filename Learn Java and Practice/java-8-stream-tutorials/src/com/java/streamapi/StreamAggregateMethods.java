package com.java.streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamAggregateMethods {

	public static void main(String[] args) {
		//count(),min() and max() methods
		Stream<Integer> s1=Stream.of(1,2,3,4,5,6,7,8);
		System.out.println(s1.count());
		//The below min and max methods wont work if we use like s1.min it will work only like 
		//Stream.of(1,2,3,4,5,6,7,8)
		Integer minint=	Stream.of(1,2,3,4,5,6,7,8).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minint);
		Integer maxint=Stream.of(1,2,3,4,5,6,7,8).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxint);
		
	}

}
