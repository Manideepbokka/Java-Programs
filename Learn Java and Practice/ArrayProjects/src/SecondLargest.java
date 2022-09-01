
public class SecondLargest {
public static void main(String args[])
{
	int arr[]=new int[] {1,2,3,4,5};
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	int prev=max-arr[0];
	int ans=0;
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]==max)
		{
			continue;
		}
		if(max-arr[i]<prev)
		{
			ans=arr[i];
			prev=max-arr[i];
		}
	}
	System.out.println(ans);
}
}
