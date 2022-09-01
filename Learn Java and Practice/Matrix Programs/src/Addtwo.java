import java.util.Scanner;
public class Addtwo {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a1[][]=new int[n][n];
		int b1[][]=new int[n][n];
		int c[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a1[i][j]+b1[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}

}
