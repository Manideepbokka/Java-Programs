import java.util.Arrays;
public class MaxAndMinChar {
public static void main(String args[])
{
	String s="grass is greener on other side";
	s=s.replaceAll(" ", "");
	char ch[]=s.toCharArray();
	String temp="";
	for(int i=0;i<s.length();i++)
	{
		if(temp.indexOf(ch[i])==-1)
		{
			temp+=ch[i];
		}
	}
	System.out.println(temp);
	int arr[]=new int[temp.length()];
	for(int i=0;i<temp.length();i++)
	{
		int c=0;
		for(int j=0;j<s.length();j++)
		{
			
			if(temp.charAt(i)==s.charAt(j))
			{
				c+=1;
			}
		
		}
		arr[i]=c;
	}
	int dup[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		dup[i]=arr[i];
	}
	Arrays.sort(dup);
	int min_index=Arrays.binarySearch(arr,dup[0]);
	int max_index=Arrays.binarySearch(arr,dup[dup.length-1]);
	
	System.out.println(temp.charAt(min_index));
	System.out.println(temp.charAt(max_index));
	
	
	
}
}
