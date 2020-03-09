package com.jbk;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;

public class JsonWrite {
	
	public static void main(String[] args) throws Exception {
		JSONObject jo=new JSONObject();
		jo.put("FirstName", "Ajay");
		jo.put("LastName", "Mandhare");
		jo.put("Email", "ajaymandhare33@gmail.com");
		jo.put("Address","pune");
		jo.put("Job", "Java devloper");
		jo.put("Empid", "12485");
		
		
		PrintWriter pw=new PrintWriter("jsonDemo.json");
		pw.write(jo.toString());
		pw.flush();
		pw.close();
		System.out.println("Recorede addred in josnDemo jeson file");
}
		
		
		

		
		 
	}


