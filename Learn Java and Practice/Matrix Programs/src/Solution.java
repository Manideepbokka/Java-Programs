import java.util.Scanner;
class Laptop {
	private int lapId;
	private String brandName;
	private String modelName;
	private int rating;
	private double price;
	Laptop(int lapId,String brandName,String modelName,int rating,double price)
	{
		this.lapId=lapId;
		this.brandName=brandName;
		this.modelName=modelName;
		this.rating=rating;
		this.price=price;
	}
	public int getlapId()
	{
		return lapId;
	}
	public void setlapId(int s)
	{
		this.lapId=s;
	}
	public String getbrandName()
	{
		return brandName;
	}
	public void setbrandName(String mn)
	{
		this.brandName=mn;
	}
	public String getmodelName()
	{
		return modelName;
	}
	public void setmodelName(String mni)
	{
		this.modelName=mni;
	}
	public int getrating() {
		return rating;
	}
	public void setrating(int rs)
	{
		this.rating=rs;
	}
	public double getprice()
	{
		return price;
	}
	public void setprice(int p)
	{
		this.price=p;
	}

}
public class Solution {
public static double totalPriceOfLaptops(Laptop arr[],String first,String last)
{
	double sum=0;
	for(int i=0;i<arr.length;i++)
	{
		String s=arr[i].getmodelName().toLowerCase();
		first=first.toLowerCase();
		last=last.toLowerCase();
		if(s.startsWith(first) && s.endsWith(last))
		{
			sum+=arr[i].getprice();
		}
		
	}
	if(sum>0)
	{
		return sum;
	}
	else
	{
	return 0.0;
	}
	
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Laptop l[]=new Laptop[4];
	for(int i=0;i<4;i++)
	{
		int id=sc.nextInt();sc.nextLine();
		String brand=sc.nextLine();
		String model=sc.nextLine();
		int r=sc.nextInt();sc.nextLine();
		double pr=sc.nextDouble();sc.nextLine();
		l[i]=new Laptop(id,brand,model,r,pr);
	}
	String first=sc.nextLine();
	String last=sc.nextLine();
	double ans=totalPriceOfLaptops(l,first,last);
	if(ans>0)
	{
		System.out.println(ans);
	}
	else
	{
		System.out.println("The given model is not availabe");
	}
	
}
}
