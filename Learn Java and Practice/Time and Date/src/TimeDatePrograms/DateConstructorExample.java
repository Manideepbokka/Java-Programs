package TimeDatePrograms;

import java.util.Date;

public class DateConstructorExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println("Current date is: "+ d1);
		Date d2=new Date(2323223232L);
		System.out.println("date represented is "+d2);
		Date d3=new Date(2001,4,30);
		Date d4=new Date(2001,4,30,21,30,55);
		System.out.println(d3);
		System.out.println(d4);
		

	}

}
