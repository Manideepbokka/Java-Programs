
class Student7{  
	   int rollno;  
	   String name;  
       static String college="SRKR";
	   Student7(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  

	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
	   }  
	}  
 
	public class TestStaticVariable1{  
	 public static void main(String args[]){  
	 Student7 s1 = new Student7(111,"Karan");  
	 Student7 s2 = new Student7(222,"Aryan");  
 
	 Student7.college="JNTUK";  
	 s1.display();  
	 s2.display();  
	 }  
	}