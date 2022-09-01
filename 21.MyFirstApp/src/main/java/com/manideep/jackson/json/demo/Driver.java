package com.manideep.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String args[])
	{
		try
		{
			
			//craete object mapper
			ObjectMapper mapper=new ObjectMapper();
			
			//read json file and map/convert to java pojo
			Student theStud=mapper
					.readValue(new File("data/sample-full.json"),
							Student.class);

			//print first name and last name
			System.out.println("First Name = "+theStud.getFirstName());
			System.out.println("Last Name ="+theStud.getLastName());
			System.out.println("Address = "+theStud.getAddress());
			Address temp=theStud.getAddress();
			System.out.println("Street = "+temp.getStreet());
			System.out.println("City = "+temp.getCity());
			System.out.println("state = "+temp.getState());
			System.out.println("Country = "+temp.getCountry());
			
			System.out.println("Languages ="+theStud.getLanguages());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}
