package com.java.lambda.functional;
import java.util.function.BiPredicate;
public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<String,String> ans=(s1,s2)->s1.equals(s2);
		System.out.println(ans.test("Manideep", "Manideep"));
		
		BiPredicate<Integer,Integer> ans1=(s1,s2)->s1>s2;
		BiPredicate<Integer,Integer> ans2=(s1,s2)->s1==s2;
		
		System.out.println(ans1.and(ans2).test(200, 100));
		System.out.println(ans1.or(ans2).test(200, 100));

	}

}
