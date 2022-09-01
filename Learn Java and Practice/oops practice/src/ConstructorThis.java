class Student56
{
	int sid;
	String sname;
	int rollno;
	/*Student56(int sid,String sname,int rollno)
	{
		this.sid=sid;
		this.sname=sname;
		this.rollno=rollno;
	}*/
	Student56(int sd,String sn,int rn)
	{
		sid=sd;
		sname=sn;
		rollno=rn;
	}
	void display()
	{
		System.out.println(sid+ " "+sname+" "+rollno);
	}
	
}
public class ConstructorThis {

public static void main(String args[])
{
	Student56 s1=new Student56(111,"Nikhil",530);
	Student56 s2=new Student56(222,"victor",528);
	s1.display();
	s2.display();
}
}
