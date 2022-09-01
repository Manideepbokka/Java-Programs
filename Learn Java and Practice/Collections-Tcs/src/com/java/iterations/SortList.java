package com.java.iterations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> nwl=new ArrayList<Integer>();
//		nwl.add(10);
//		nwl.add(30);
//		nwl.add(20);
//		nwl.add(50);
//		nwl.add(40);
//		
//		Collections.sort(nwl);  //ascending
//		System.out.println(nwl);
//		
//		Collections.reverse(nwl);//descending
//		System.out.println(nwl);
		List<Employeee> emps=new ArrayList<Employeee>();
		emps.add(new Employeee(11,"Manideep",22,750000));
		emps.add(new Employeee(12,"Bokka",23,850000));
		emps.add(new Employeee(13,"Sai",20,650000));
		emps.add(new Employeee(14,"Vamsi",19,550000));
		emps.add(new Employeee(15,"Chandra",18,450000));
		Collections.sort(emps, new Mysort());
		System.out.println(emps);
		
		
		Collections.sort(emps,new Comparator<Employeee>() {
			@Override
			public int compare(Employeee e1,Employeee e2)
			{
				return (int) (e2.getSalary()-e1.getSalary());
			}
		});
		System.out.println(emps);
		
		
		//Lambda expression
		Collections.sort(emps,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		System.out.println(emps);
	}

}
class Mysort implements Comparator<Employeee>{
	@Override
	public int compare(Employeee e1,Employeee e2)
	{
		return (int) (e1.getSalary()-e2.getSalary());
	}
	
}
