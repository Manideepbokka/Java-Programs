import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Nikhil {
	
		public static List<Integer> removedups(List<Integer> abc)
		{
			List<Integer> ans=new ArrayList<>();
			Collections.sort(abc);
			
			for(int i=0;i<abc.size();i++)
			{
				if(ans.contains(abc.get(i)))
				{
					continue;
				}
				else
				{
					ans.add(abc.get(i));
				}
			}
			
			return ans;
		}
		public static void main(String[] args)
		{
			
			List<Integer> a1=new ArrayList<>();
			a1.add(1);
			a1.add(2);
			a1.add(3);
			a1.add(2);
			a1.add(3);
			a1.add(5);
			a1.add(4);
			a1.add(5);
			List<Integer> a2=Arrays.asList(6,3,4,7,8,7,10,6);
			a1.addAll(a2);
			
			
			List<Integer> newl1=removedups(a1);
			newl1.forEach((a)->System.out.println(a));
		}
}
