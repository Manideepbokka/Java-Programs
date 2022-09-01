
public class First {
	static int tyre=100;
	int speed;
	String bikeName;
	int bikeno;
	int noOfDiscs;
	boolean absExist;
    First(int sp,String bN,int bno,int nD,boolean aE)
	{
		this.speed=sp;
		this.bikeName=bN;
		this.bikeno=bno;
		this.noOfDiscs=nD;
		this.absExist=aE;
	}
	public void driving(int speed)
	{
		int speed_msec=speed*5/18;
		System.out.print("Bike is going in "+speed_msec+"m/sec");
	}
	
	public static void main(String args[])
	{
		First ktm390=new First(180,"Ktm Duke 390",9252,2,true);
		First r15=new First(130,"Yamaha R15",2599,2,true);
		System.out.println(ktm390.speed+" "+ktm390.bikeName+" "+ktm390.bikeno);
		System.out.println(r15.speed+" "+r15.bikeName+" "+r15.bikeno);
		ktm390.driving(ktm390.speed);
	}

}
