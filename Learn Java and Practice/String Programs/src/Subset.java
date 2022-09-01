
public class Subset {
public static void main(String args[])
{
	String s="Mani";
	int len=s.length();
	String ar[]=new String[(len*(len+1)/2)];
	int c=0;
	for(int i=0;i<len;i++)
	{
		for(int j=i;j<len;j++)
		{
			ar[c]=s.substring(i, j+1);
			c++;
		}
	}
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
	}
}
}
