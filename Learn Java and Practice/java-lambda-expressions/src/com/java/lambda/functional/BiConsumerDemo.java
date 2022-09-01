package com.java.lambda.functional;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
class BiConsumerDemo {
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> bifadd=(a,b)->System.out.println(a+b);
		bifadd.accept(10, 15);
		
		BiConsumer<Integer,Integer> bifsub=(a,b)->System.out.println(a-b);
		bifsub.accept(25, 15);
		
		BiConsumer<Integer,Integer> bifmul=(a,b)->System.out.println(a*b);
		bifmul.accept(10, 15);
		
		BiConsumer<Integer,Integer> bifdiv=(a,b)->System.out.println(a/b);
		bifdiv.accept(100, 15);
		
		Map<String,Integer> ms=new HashMap<>();
		
		ms.put("Manideep", 1);
		ms.put("Bokka", 2);
		ms.put("Victor", 3);
		ms.put("Nikhil", 4);
		ms.put("Karna", 5);
		ms.put(null, 6);
		ms.forEach((K,V)->{
			System.out.println(K);
			System.out.println(V);
		});
	}

}
