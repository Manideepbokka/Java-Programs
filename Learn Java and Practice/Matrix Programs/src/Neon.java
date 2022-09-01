import java.util.Scanner;

public class Neon {
public static void main(String args[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int square=(int)Math.pow(n,2);
	int sum=0;
	while(square>0)
	{
		int r=square%10;
		sum+=r;
		square=square/10;
	}
	if(sum==n)
	{
		System.out.println("Given number "+n+" is a Neon number");
	}
	else
	{
		System.out.println(n+" is not a Neon number");
	}
	
}
}
