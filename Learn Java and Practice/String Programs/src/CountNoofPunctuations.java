
public class CountNoofPunctuations {
	public static void main(String args[])
	{
		String s=new String("He said, 'The mailman loves you.' I heard it with my own ears.");
		int len=s.length();
		int spaces=0;
		int alpha=0;
		for(int i=0;i<len;i++)
		{
			char a=s.charAt(i);
			if(a==' ')
			{
				spaces+=1;
				continue;
			}
			int z=(int)a;
			if((z>=65 && z<=90)||(z>=97 && z<=122)) {
				alpha+=1;
				
			}	
		}
		System.out.println(len-spaces-alpha);
	}
}
