import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
private	static boolean isArmstrong(int num)
{
	int digit=0,sum=0;
	int temp=num;
	int n=num;
	while(n>0)
	{
		n=n/10;
		digit++;
	}
	while(num>0)
	{
		int r=num%10;
		sum+=(Math.pow(r,digit)); 
		num=num/10;
	}
	if(sum==temp)
	{
		return true;
	}
	else
	{
	return false;
	}
}
public static void main(String[] args)
{
	int end;
	Scanner sc=new Scanner(System.in);
	end=sc.nextInt();
	for(int i=1;i<=end;i++)
	{
		if(isArmstrong(i))
		{
			System.out.print(i+",");
		}
	}
}
}
