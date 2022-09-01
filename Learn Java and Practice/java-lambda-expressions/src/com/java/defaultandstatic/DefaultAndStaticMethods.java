package com.java.defaultandstatic;
interface Vehicle
{
	String getBrand();
	String speedup();
	String slowdown();
	
	default String turnAlarmOn()
	{
		return "turning vehicle alarm on";
	}
	default String turnAlarmOff()
	{
		return "turning vehicle alarm off";
	}
	static String getCarBrand()
	{
		return "BMW";
	}
	
}
class Car implements Vehicle
{
	public String getBrand()
	{
		return "BMW CAR";
	}
	public String speedup()
	{
		return "car is speeding up";
	}
	public String slowdown()
	{
		return "car is slowing down";
	}
	
	
}
public class DefaultAndStaticMethods {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.getBrand());
		System.out.println(c.speedup());
		System.out.println(c.slowdown());
		System.out.println(c.turnAlarmOn());
		System.out.println(c.turnAlarmOff());
		System.out.println(Vehicle.getCarBrand());

	}

}
