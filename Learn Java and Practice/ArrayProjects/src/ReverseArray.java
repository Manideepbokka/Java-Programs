import java.util.Arrays;
public class ReverseArray {
	public static void main(String args[])
	{
		int arr[]=new int[] {1,2,3,4,5,6};
		int i=0;
		int j=arr.length-1;
		
		while(i<j)
		{
			int c=arr[i];
			arr[i]=arr[j];
			arr[j]=c;
			i++;
			j--;			
		}	
		System.out.println(Arrays.toString(arr));
	}

}
