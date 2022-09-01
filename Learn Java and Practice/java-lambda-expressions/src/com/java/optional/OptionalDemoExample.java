package com.java.optional;
import java.util.Optional;
public class OptionalDemoExample {

	public static void main(String[] args) {
		// Of,empty,OfNullable
		String email="saimanideep159@gmail.com";
		String emx=null;
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		//if we are  sure that object is not null then we can use of method,
		//if theres null then it will give Null Pointer exception.
		Optional<String> emailOptional=Optional.of(email);
		System.out.println(emailOptional);
		
		Optional<String> stringOptional=Optional.ofNullable(emx);
		System.out.println(stringOptional);
		Optional<String> stringOptionalnotnull=Optional.ofNullable(email);
		System.out.println(stringOptionalnotnull);
		
		
		System.out.println(stringOptionalnotnull.get());
		
		//in real time project we use get like below
		if(stringOptionalnotnull.isPresent())
	    {
			System.out.println(stringOptionalnotnull.get());
		}
		else
		{
			System.out.println("No such value present");
		}
		
		String defaultoptional=stringOptionalnotnull.orElse("default@gmail.com");
		System.out.println(defaultoptional);
		
		String defaultoptional2=stringOptionalnotnull.orElseGet(()->"default@gmail.com");
		System.out.println(defaultoptional2);
		
		String optionalobject=stringOptionalnotnull.orElseThrow(()->new IllegalArgumentException("Email is not exist"));
		System.out.println(optionalobject);
		
		//ifPresent
		Optional<String> gender=Optional.of("Male");
		Optional<String> emptyOptional2=Optional.empty();
		
		gender.ifPresent((s)->System.out.println("Value is present"));
		emptyOptional2.ifPresent((s)->System.out.println("No Value Present"));
		
		String result="  abcabc  ";
		Optional<String> ops2=Optional.of(result);
		ops2.filter(res->res.contains("abc"))
		    .map(String::trim)
		    .ifPresent(res->System.out.println(res));
		
	}

}
