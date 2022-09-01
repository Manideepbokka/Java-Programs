
public class HashCodeExample  
{  

public static void main(String[] args)   
{  
//creating two instances of the Employee class  
Employee emp1 = new Employee(918, "Maria");  
Employee emp2 = new Employee(918, "Maria");  
System.out.println(emp1.equals(emp1));
System.out.println(emp2.equals(emp2));
//invoking hashCode() method  
int a=emp1.hashCode();  
int b=emp2.hashCode();  
System.out.println("hashcode of emp1 = " + a);  
System.out.println("hashcode of emp2 = " + b);  
System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  
}  
}  