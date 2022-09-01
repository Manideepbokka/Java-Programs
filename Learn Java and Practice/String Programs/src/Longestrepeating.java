
public class Longestrepeating {
	static String str = "acbdfghybdf";
	static String t2="acbdfghybdf";
	static int l=str.length();
	
	static char ch1[]=str.toCharArray();
	static char ch2[]=str.toCharArray();
	
	public static void main(String args[])
	{
		int maxlen=0;
		String ans="";
		int len=0;
		for(int i=0;i<l-1;i++)
		{
			String temp="";
			len=0;
			for(int j=i+1;j<l;j++)
			{
				if(ch1[i]==ch2[j])
				{
					temp+=ch1[i];
					len+=1;
					for(int k=i+1,m=j+1;m<l;)
					{
						if(ch1[k]==ch2[m])
						{
							len++;
							temp+=ch1[k];
							k++;
							m++;
						}
						else
						{
							break;
						}
					}
					if(len>maxlen)
					{
						maxlen=len;
						ans=temp;
					}
				}
				
			}
		}
		System.out.println(ans+"  "+maxlen);
	}

}
