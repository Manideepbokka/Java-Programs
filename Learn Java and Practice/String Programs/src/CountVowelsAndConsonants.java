
public class CountVowelsAndConsonants {
public static void main(String args[])
{
	String s=new String("SaI MaNiDeEp BoKkA");
	s=s.toUpperCase();
	int len=s.length();
	int vc=0;
	for(int i=0;i<len;i++)
	{
		char a=s.charAt(i);
		if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
		{
			vc+=1;
		}
	}
	System.out.println(vc);
}
}
