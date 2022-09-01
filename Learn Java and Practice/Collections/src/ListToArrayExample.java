
import java.util.*;  
public class ListToArrayExample{  
public static void main(String args[]){  
 List<Integer> fruitList = new ArrayList<>();    
 fruitList.add(1);    
 fruitList.add(2);    
 fruitList.add(3);    
 fruitList.add(4);    
 //Converting ArrayList to Array  
 //int[] array = fruitList.toArray(new int[fruitList.size()]);    
 //System.out.println("Printing Array: "+Arrays.toString(array));  
 System.out.println("Printing List: "+fruitList);  
}  
}  