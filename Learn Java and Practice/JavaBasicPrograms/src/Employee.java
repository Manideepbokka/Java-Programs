
public class Employee   
{  
	/*
	//override code
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		if(obj==this)
		{
			return true;
		}
		return this.getRegno()==((Employee) obj).getRegno();
	}
	*/
private int regno;  
private String name;   
public Employee(int regno, String name)   
{  
this.name = name;  
this.regno = regno;  
}  
public int getRegno()   
{  
return regno;  
}  
public void setRegno(int Regno)   
{  
this.regno = regno;  
}  
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  
}  