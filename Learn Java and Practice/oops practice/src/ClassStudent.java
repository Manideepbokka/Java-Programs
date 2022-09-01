abstract class Student
{
	int sid;
	String sname;
	
}
public class ClassStudent extends Student {
	int stphno;
	String address;
public static void main(String args[])
{
	//Student s1=new Student();
	//System.out.println(s1.sid+" "+s1.sname);
	ClassStudent s2=new ClassStudent();
	System.out.println(s2.address+" "+s2.stphno);
	System.out.println(s2.sid+" "+s2.sname);
}
}
