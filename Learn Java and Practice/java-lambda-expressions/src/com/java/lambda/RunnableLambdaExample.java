package com.java.lambda;
class Threaddemo implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method called...");
	}
	
}
public class RunnableLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread th=new Thread(new Threaddemo());
			th.start();
			
			Runnable rb=()->System.out.println("run method called using lambda..");
			Thread tb=new Thread(rb);
			tb.start();
			
			Thread rbe=new Thread(()->System.out.println("run method called using lambda.."));
			rbe.start();
			
			Runnable rbcd=()->System.out.println("run method called using lambda..");
			rbcd.run();
			
	}

}
