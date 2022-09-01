
import java.util.*;  
class ArrayListBasic {  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");
list.set(0,"Nikhil");
System.out.println(list.get(0));
Collections.sort(list);
for(String i:list)
{
	System.out.println(i);
}
System.out.println(list);
//Traversing list through Iterator  
Iterator itr=list.iterator(); 

while(itr.hasNext()){  
	
System.out.println(itr.next()); 

} 
System.out.println("---------------------------------------");
//ListIterator tho traversing.
ListIterator<String> l1=list.listIterator(list.size());
while(l1.hasPrevious())
{
	String st=l1.previous();
	System.out.println(st);
}
//forEach method
System.out.println("forEach method......");
list.forEach((i)->{
	System.out.println(i);
	});
}  
}