
public class CountNoOfChar {
	public static void main(String args[])
	{
		String s=new String("He said, 'The mailman loves you.' I heard it with my own ears.");
		int len=s.length();
		int ans=0;
		for(int i=0;i<len;i++)
		{
			char a=s.charAt(i);
			if(a==' ')
			{
				continue;
			}
			ans+=1;
		}
		System.out.println(ans);
	}

}
