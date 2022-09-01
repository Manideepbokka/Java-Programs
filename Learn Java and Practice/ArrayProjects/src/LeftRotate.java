import java.util.Arrays;

public class LeftRotate {
	public static void leftrotate(int m[])
	{
		int len=m.length;
		int strt=m[0];
		int i;
		for(i=0;i<len-1;i++)
		{
			m[i]=m[i+1];
			//m[i-1]=m[i] Blunder
		}
		m[i]=strt;
		System.out.println(Arrays.toString(m));
	}
	public static void main(String args[])
	{
		int arr[]=new int[] {1,2,3,4,5,6,7};
		leftrotate(arr);
	}

}
