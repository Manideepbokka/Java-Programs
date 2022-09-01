import java.util.Scanner;
public class Palindrome {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String original,reverse="";
	original=sc.nextLine();
	int len_ori=original.length();
	for(int i=len_ori-1;i>=0;i--)
	{
		reverse=reverse+original.charAt(i);
		
	}
	if(original.equals(reverse))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
}
}
