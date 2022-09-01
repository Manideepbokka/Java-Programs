package com.java.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class StreamListSorting {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Sapota");
		//ascending order
		List<String> sortedlist=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedlist);
		
		List<String> sortedlist1=fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist1);
		
		List<String> sortedlist2=fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedlist2);
		
		//descending order
		List<String> sortedlist3=fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedlist3);
		
		List<String> sortedlist4=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedlist4);
		
		List<Employeee> emps=new ArrayList<Employeee>();
		emps.add(new Employeee(11,"Manideep",22,750000));
		emps.add(new Employeee(12,"Bokka",23,850000));
		emps.add(new Employeee(13,"Sai",20,650000));
		emps.add(new Employeee(14,"Vamsi",19,550000));
		emps.add(new Employeee(15,"Chandra",18,450000));
		List<Employeee> Sortedempsdesc=emps.stream().sorted(new Comparator<Employeee>() {
			@Override
			public int compare(Employeee e1,Employeee e2)
			{
				return (int) (e2.getSalary()-e1.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(Sortedempsdesc);
		//using lambda
		List<Employeee> Sortedempsasc=emps.stream().
				sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(Sortedempsasc);
		
		//with comparator ascending
		List<Employeee> sortedemp=emps.stream()
				.sorted(Comparator.comparingLong(Employeee::getSalary))
				.collect(Collectors.toList());
		System.out.println(sortedemp);
		
		//with comparator descending
		List<Employeee> sortedempdes=emps.stream()
				.sorted(Comparator.comparingLong(Employeee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(sortedempdes);
		
		//By Age
		List<Employeee> sortedempage=emps.stream()
				.sorted(Comparator.comparingLong(Employeee::getAge))
				.collect(Collectors.toList());
		System.out.println(sortedempage);
		
	}

}
