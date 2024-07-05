package com.sample.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.pojo.Implementer;
import java.io.File;
import java.io.IOException;

public class Controller1 {
	public static void main(String[] args) throws JsonProcessingException 
	{
	
    //Create ObjectMapper
	ObjectMapper mapper=new ObjectMapper();
	
	//Json to java
    
	try 
	{
		Implementer implementer = mapper.readValue(new File("jsondata/sample-complex.json"), 
				Implementer.class);
		
		//Printing data on console recieved from json and coverted to java obj
		System.out.println("Implementer id: " +implementer.getId());
		System.out.println("Implementer name: " +implementer.getName());
		System.out.println("Implementer city: " +implementer.getCity());
		System.out.println("Implementer status: " +implementer.isActive());
		
		System.out.println("Implementers Course details : "+ implementer.getCourse());
		//String[] hobbies = implementer.getHobbies();
		for(String hobby:implementer.getHobbies())
		{
			System.out.print(hobby + " ");
		}
		System.out.println();
	
	} 
	
	catch (IOException e) 
	{
		e.printStackTrace();
	}

}
}

