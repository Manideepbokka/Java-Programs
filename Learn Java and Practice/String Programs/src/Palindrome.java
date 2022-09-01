import java.lang.*;
import java.io.*;
import java.util.*;
public class Palindrome {
	public static void main(String args[])
	{
		String s="madam";
		String v=new String(s);
		StringBuilder temp=new StringBuilder();
		
		temp.append(s);
		temp.reverse();
		String a=temp.toString();
		if(v.equals(s))
		{
			System.out.println("Palindrome");
		}
		
		
	}

}
