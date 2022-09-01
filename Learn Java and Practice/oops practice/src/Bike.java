
abstract class TestAbstraction2{  
	TestAbstraction2(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class Honda extends TestAbstraction2{  
	 void run(){System.out.println("running safely..");}  
	 }  
	//Creating a Test class which calls abstract and non-abstract methods  
	 class Bike{  
	 public static void main(String args[]){  
		 TestAbstraction2 obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}