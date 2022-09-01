
public class ExceptionExample1 {
	public static void main(String args[])
	{
		try
		{
			int data=100/0;
			System.out.println("Rest of try code executes");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//Custom Message
			System.out.println("Can't divide by zero");
		}
		System.out.println("Rest of the code executes");
	}

}
