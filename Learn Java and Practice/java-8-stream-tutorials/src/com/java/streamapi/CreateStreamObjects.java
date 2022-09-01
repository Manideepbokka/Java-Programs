package com.java.streamapi;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import  java.util.stream.Stream;
public class CreateStreamObjects {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("a","b","c");
		stream.forEach(System.out::println);
		
		List<String> coll=Arrays.asList("Bokka","Sai","Manideep");
		Stream<String> str=coll.stream();
		str.forEach(System.out::println);
		
		Collection<String> coll2=Arrays.asList("Java","MySQl","spring","springBoot","Hibernate");
		Stream<String> str2=coll2.stream();
		str2.forEach(System.out::println);
		
		Set<String> s30=new HashSet<>(coll);
		Stream<String> str3=s30.stream();
		str3.forEach(System.out::println);
		
		String[] newstrarr= {"M","A","N","I","D","E","E","P"};
		Stream<String> str4=Arrays.stream(newstrarr);
		str4.forEach(System.out::println);	
		

	}

}
