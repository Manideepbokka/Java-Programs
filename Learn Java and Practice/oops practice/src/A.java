
class B{  
B(){System.out.println("hello a");}  
B(int x){  
this();  
System.out.println(x);  
}  
}  
class A{  
public static void main(String args[]){  
B a=new B(10);  
}}  