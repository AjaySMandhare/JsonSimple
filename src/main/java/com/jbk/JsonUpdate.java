package com.jbk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class JsonUpdate {
	
		
	@Test
	public void test1() throws FileNotFoundException, IOException, ParseException {
		
		Object obj=new JSONParser().parse(new FileReader("jsonDemo.json"));
		
		JSONObject jo=(JSONObject)obj;
		String firstname=(String) jo.get("FirstName");
		String lasttname=(String) jo.get("LastName");
		
		//Update Operation
		jo.put(firstname, "Saily");
		jo.put(lasttname, "Kasurde");
		System.out.println("Update as:"+jo.toString());
	}
		
	}


