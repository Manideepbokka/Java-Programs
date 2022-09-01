package com.java.methodreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.math.*;
@FunctionalInterface
interface printable
{
	void print(String m);
}
public class MethodReferencesDemo {
	public void display(String msg)
	{
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
	public static int addition(int a,int b)
	{
		return (a+b);
	}

	public static void main(String[] args) {
		//1.MethodReferences to a static method
		//lambda expression **sqrt is static method.
		Function<Integer,Double> fun= (a)->Math.sqrt(a);
		System.out.println(fun.apply(25));
		//methodreference
		Function<Integer,Double> funmethref= Math::sqrt;
		System.out.println(funmethref.apply(25));
		//lambda
		BiFunction<Integer,Integer,Integer> biflam=(a,b)->MethodReferencesDemo.addition(a,b);
		System.out.println(biflam.apply(10, 15));
		//methodreference
		BiFunction<Integer,Integer,Integer> biflammethodref=MethodReferencesDemo::addition;
		System.out.println(biflammethodref.apply(20, 15));
		

		//2.method refernce to instance method of object
		MethodReferencesDemo mrd=new MethodReferencesDemo();
		//lambda
		printable pb=(msg)->mrd.display(msg);
		pb.print("bokka manideep");
		//methodreference
		printable pbe=mrd::display;
		pbe.print("bokka chandra vamsi");
		
		//3.Reference to the instance method of arbitrary object
		//sometimes we call a method of argument in the lambda expression
		//In that case,we can use a method reference to call an instance
		//method of an arbitrary object of specific type
		//lambda
		Function<String,String> sf=(input)->input.toLowerCase();
		System.out.println(sf.apply("MANIDEEP"));
		//method reference
		Function<String,String> sfmdref=String::toLowerCase;
		System.out.println(sfmdref.apply("MANIDEEP"));
		
		String sar[]= {"A","E","I","O","U","a","e","i","o","u"};
		Arrays.sort(sar,(s1,s2)->s1.compareToIgnoreCase(s2));
		
		Arrays.sort(sar,String::compareToIgnoreCase);
		
		//4.reference to a constructor
		List<String> fruits=new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Sapota");
		
		//lambda
		Function<List<String>,Set<String>> fnew=(listnew)->new HashSet(listnew);
		fnew.apply(fruits);
		
		//method refernece
		Function<List<String>,Set<String>> fnewmethref=HashSet::new;
		fnewmethref.apply(fruits);
		
		
		
		
		
	}

}
