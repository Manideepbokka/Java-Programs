
public class RowColEachSum {
public static void main(String args[])
{
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int rowsum=0;
	int colsum=0;
	for(int i=0;i<3;i++)
	{
		rowsum=0;
		colsum=0;

		for(int j=0;j<3;j++)
		{
			rowsum+=a[i][j];
			colsum+=a[j][i];
		}
		System.out.println("row sum of row "+(i+1)+" = "+rowsum);
		System.out.println("col sum of col "+(i+1)+" = "+colsum);
	}
}
}
