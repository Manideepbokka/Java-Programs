
public class Student567 {
    int sid;
	String sname;
	int rollno;
	/*Student56(int sid,String sname,int rollno)
	{
		this.sid=sid;
		this.sname=sname;
		this.rollno=rollno;
	}*/
	Student567(int sd,String sn,int rn)
	{
		sid=sd;
		sname=sn;
		rollno=rn;
	}
	void display()
	{
		System.out.println(sid+ " "+sname+" "+rollno);
	}
	



public static void main(String args[])
{
	Student567 s1=new Student567(111,"Nikhil",530);
	Student567 s2=new Student567(222,"victor",528);
	s1.display();
	s2.display();
}
}