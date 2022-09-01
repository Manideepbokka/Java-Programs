import java.util.Arrays;

public class Duplicates {
	public static void main(String args[])
	{
		int arr[]=new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int c=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=c;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		int prev=arr[0];
		int printed=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==prev && printed!=arr[i])
			{
				printed=arr[i];
				System.out.println(arr[i]);
			}
			prev=arr[i];
		}
	}

}
