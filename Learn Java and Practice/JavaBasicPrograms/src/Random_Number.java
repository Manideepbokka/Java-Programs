import java.io.*;
import java.lang.Math;
import java.util.Random;
public class Random_Number {
	/*OTP Generation code using Random class in util library*/
	public static void otp_gen_using_random() {
		Random r=new Random();
		String s="";
		for(int i=0;i<6;i++)
		{
			s+=r.nextInt(10);
		}
		System.out.println(s);
		
	}
public static void main(String[] args)
{
	/*OTP Generation code using Math.random()*/
	int min=1,max=9;
	String ans="";
	for(int i=0;i<6;i++)
	{
		int a=(int)(Math.random()*(max-min+1)+min);
		//System.out.println(a);
		ans+=a;
		
	}
	System.out.println(ans);
	otp_gen_using_random();
}
}
