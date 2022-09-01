package TimeDatePrograms;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UsingCalendarAndFormatterExample {
public static void main(String args[]) throws ParseException
{
	SimpleDateFormat ft=new SimpleDateFormat("dd-MM-yyyy");
	String str=ft.format(new Date());
	System.out.println(str);
	
	str="03/17/2022";
	ft=new SimpleDateFormat("MM/dd/yyyy");
	Date d=ft.parse(str);
	System.out.println(d);
}
}
