
public class CreateObjectUsingNewinstance {
	void show()
	{
		System.out.println("Object has created");
	}
	public static void main(String args[])
	{
		try
		{
		Class cls=Class.forName("CreateObjectUsingNewinstance");
		CreateObjectUsingNewinstance obj=(CreateObjectUsingNewinstance) cls.newInstance();
		obj.show();
		}
		catch(IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(InstantiationException e)
		{
			e.printStackTrace();
		}
	}

}
