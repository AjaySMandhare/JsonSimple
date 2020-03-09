package com.jbk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.text.html.HTMLEditorKit.Parser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {
	
	private static final Object Empid = null;

	public static void main(String[] args) throws Exception, IOException, ParseException {
		
	
		Object obj=new JSONParser().parse(new FileReader("jsonDemo.json"));
			JSONObject jo=(JSONObject)obj;
			
			String fastname=(String) jo.get("FirstName");
			String lastname=(String) jo.get("LastName");
			String email=(String) jo.get("Email");
			String address=(String) jo.get("Address");
			String job=(String) jo.get("Job");
			String empid=(String) jo.get("Empid");
			
			System.out.println(fastname);
			System.out.println(lastname);
			System.out.println(email);
			System.out.println(address);
			System.out.println(job);
			System.out.println(empid);
			
	}

}
