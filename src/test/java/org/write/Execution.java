package org.write;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {

	public static void main(String[] args) throws IOException, DatabindException {
		
		File f = new File("C:\\Users\\Deepanraj\\eclipse-workspace\\JSONwrite\\src\\test\\resources\\Write.json");
		
		Root r = new Root();
		r.setName("Deepanraj");
		r.setAge(27);
		r.setStatus(true);
		
		Address a = new Address();
		a.setCity("Chennai");
		a.setState("Tamilnadu");
		a.setCountry("India");
		
		r.setAddress(a);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Selenium");
		al.add("Python");
		
		r.setCourses(al);
		
		ObjectMapper ob = new ObjectMapper();
		ob.writeValue(f, r);
		
		
	}
}
