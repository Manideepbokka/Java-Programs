
public class CreateObjectusingClone implements Cloneable
{
	
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	String str="New object created";
	public static void main(String args[])
	{
		CreateObjectusingClone obj1=new CreateObjectusingClone();
		try
		{
			CreateObjectusingClone obj2=(CreateObjectusingClone) obj1.clone();
			System.out.println(obj2.str);
			
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
