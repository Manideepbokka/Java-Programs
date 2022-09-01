package TimeDatePrograms;

import java.util.Date;

public class DateMethodsExample {
public static void main(String args[])
{
	Date d1=new Date(2000,11,21);
	Date d2= new Date();
	Date d3= new Date(2010,1,3);
	boolean a=d3.after(d1);
	System.out.println(a);
	boolean b=d1.before(d3);
	System.out.println(b);
	
	int c=d1.compareTo(d3);
	System.out.println(c);
	
	System.out.println("Milliseconds from date Jan 1,1970 to date "+d1.getTime());
	
	System.out.println("Before setting "+d2);
    d2.setTime(204587433443L);
    System.out.println("After setting "+d2);
	
}
}
