//Handling ArithmeticException with ArrayIndexOutOfBoundsException
public class TryCatchEx3 {
	public static void main(String args[])
	{
		try
		{
			int data=100/0;
			System.out.println("Rest of try code doesn't executes");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			//Custom Message
			//System.out.println("Can't divide by zero");
		}
		System.out.println("Rest of the code executes");//This line wont exec
	}

}

