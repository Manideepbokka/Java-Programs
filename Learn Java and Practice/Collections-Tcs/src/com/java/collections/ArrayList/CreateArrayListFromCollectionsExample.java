package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionsExample {

	public static void main(String[] args) {
		List<Integer> ffiprimenum=new ArrayList<>();
		ffiprimenum.add(2);
		ffiprimenum.add(3);
		ffiprimenum.add(5);
		ffiprimenum.add(7);
		ffiprimenum.add(11);
		
		List<Integer> ftenprimenum=new ArrayList<>(ffiprimenum);
		List<Integer> nextfiveprimenum=new ArrayList<>();
		nextfiveprimenum.add(13);
		nextfiveprimenum.add(17);
		nextfiveprimenum.add(19);
		nextfiveprimenum.add(23);
		nextfiveprimenum.add(29);
		
		ftenprimenum.addAll(nextfiveprimenum);
		
		System.out.println(ftenprimenum);
		

	}

}
