package com.java.lambda.functional;
import java.util.function.Function;
//class FunctionalImpl implements Function<String,Integer>{
//
//	@Override
//	public Integer apply(String t) {
//		// TODO Auto-generated method stub
//		return t.length();
//	}
//	
//}
public class Functional
{
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Function<String,Integer> fun=new FunctionalImpl();
//		System.out.println(fun.apply("Manideep"));
		
		Function<String,Integer> fun=(String t)->t.length();
		System.out.println(fun.apply("Manideep"));

	}

}
