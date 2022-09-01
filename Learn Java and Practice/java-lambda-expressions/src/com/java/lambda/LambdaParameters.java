package com.java.lambda;
interface Addable{
	int addition(int a,int b);
}
public class LambdaParameters {

	public static void main(String[] args) {
		Addable ad=(int a,int b)->(a+b);
		//System.out.println(ad.addition(13, 14));//lambda wont work like this
		int res=ad.addition(13, 14);
		System.out.println(res);
		
		Addable abc=(int a,int b)->{
			int c=a+b;
			return c;
		};
		int res12=abc.addition(15, 15);
		System.out.println(res12);

	}

}
