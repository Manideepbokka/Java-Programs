package com.java.lambda.functional;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>
{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Consumer<String> cons=new ConsumerImpl();
//		cons.accept("Bokka Sai Manideep");
		
		Consumer<String> cs=(String t)->System.out.println(t);
		cs.accept("Manideep");
		
	}

}
