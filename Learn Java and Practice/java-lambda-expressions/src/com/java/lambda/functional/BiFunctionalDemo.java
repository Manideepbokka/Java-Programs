package com.java.lambda.functional;
import java.util.function.BiFunction;
import java.util.function.Function;
public class BiFunctionalDemo {
public static void main(String args[])
{
	BiFunction<Integer,Integer,Integer> bifadd=(a,b)->(a+b);
	System.out.println(bifadd.apply(10, 15));
	
	BiFunction<Integer,Integer,Integer> bifsub=(a,b)->(a-b);
	System.out.println(bifsub.apply(25, 15));
	
	BiFunction<Integer,Integer,Integer> bifmul=(a,b)->(a*b);
	System.out.println(bifmul.apply(10, 15));
	
	BiFunction<Integer,Integer,Integer> bifdiv=(a,b)->(a/b);
	System.out.println(bifdiv.apply(100, 15));
	
	Function<Integer,Integer> fne=(number)->(number*number);
	Integer ans=bifadd.andThen(fne).apply(25, 15);
	System.out.println(ans);
}
}
