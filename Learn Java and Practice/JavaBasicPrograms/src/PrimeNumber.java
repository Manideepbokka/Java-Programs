import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" is a prime number");
			}
		}
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		if(n<=3)
		{
			return true;
		}
		if(n%2==0 || n%3==0)
		{
			return false;
		}
		for(int i=5;i*i<=n;i+=6)
		{
			if(n%i==0 || n%(i+2)==0)
			{
				return false;
			}
		}
		return true;
	}

}
