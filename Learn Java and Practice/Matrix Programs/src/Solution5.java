import java.util.Scanner;
public class Solution5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		Corn c[]=new Corn[n];
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();sc.nextLine();
			String name=sc.nextLine();
			double protein=sc.nextDouble();
			int price=sc.nextInt();
			c[i]=new Corn(id,name,protein,price);
		}
		int id12=sc.nextInt();
		double ans=findAvgOfProtein(c);
		if(ans!=0)
		{
			System.out.println(ans);
		}
		else
		{
			System.out.println("No Corn found with mentioned attribute.");
		}
		Corn a=searchCornById(c,id12);
		if(a==null)
		{
			System.out.println("No Corn found with mentioned attribute.");
		}
		else
		{
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getProtein());
			System.out.println(a.getPrice());	
		}
		
	}
	public static double findAvgOfProtein(Corn c[])
	{
		double avg=0;
		for(int i=0;i<c.length;i++)
		{
			avg+=c[i].getProtein();
		}
		return (avg/c.length);
	}
	public static Corn searchCornById(Corn c[],int id12)
	{
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getId()==id12)
			{
				return c[i];	
			}
		}
		return null;
	}
	
}
class Corn
{
	private int id;
	private String name;
	private double protein;
	private int price;
	
	public Corn(int id, String name, double protein, int price) {
		super();
		this.id = id;
		this.name = name;
		this.protein = protein;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
