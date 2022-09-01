import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		int len1=s1.length();
		int len2=s2.length();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		if(len1==len2)
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
				{
					len1-=1;
				}
			}
			/*if(Arrays.equals(ch1,ch2)==true)
			 * {
			 * }
			 */
			if(len1==0)
			{
				System.out.println("Both Strings are Anagrams");
			}
			else
			{
				System.out.println("Both Strings are Not Anagrams");
			}
		}
		else
		{
			System.out.println("Both Strings are Not Anagrams");
		}
		
	}

}
