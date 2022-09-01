import java.util.HashMap;
import java.util.Scanner;

public class Nikhil3 {
	public static void main(String args[])
	{
		int r;
		HashMap<Integer,Integer> m1=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		//radius take as 3
		//r=sc.nextInt();
		r=3;
		int x=3;
		int y=3;
		m1.put(3,0);
		m1.put(-3,0);
		m1.put(0,-3);
		m1.put(1,2);
		m1.put(-2, 1);
		m1.put(3,6);
		m1.put(0,3);
		
		m1.forEach((k,v)->{
			if(Math.pow(Math.abs(x-k),2)+Math.pow(Math.abs(y-v),2)==Math.pow(r,2))
			{
				System.out.println("The given Point (" +k+","+v+") is on circumference of circle.");
			}
			else
			{
				System.out.println("The given Point (" +k+","+v+") is not on circumference of circle.");
			}
		});
	}	
}
