package com.java.lambda;
interface Shape
{
	void draw();
}
public class LambdaExample {

	public static void main(String[] args) {
		Shape rectangle=()->System.out.println("Rectangle class : draw() method");
		Shape circle=()->System.out.println("Circle class : draww() method");
		Shape square=()->System.out.println("Square class : draw() method");
		rectangle.draw();
		circle.draw();
		square.draw();
		
		//passing lambda expression as functional parameter
		print(()->System.out.println("Rectangle class : draw() method"));
		print(()->System.out.println("Circle class : draww() method"));

	}
	public static void print(Shape s)
	{
		s.draw();
	}

}
