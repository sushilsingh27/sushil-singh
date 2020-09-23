package com.hcl.poc.date.service;

import com.hcl.poc.date.parser.*;
import com.hcl.poc.date.util.DateBuilder;

public class DateFormatService {
	
	
	public String formatDate(String date) {
		
		String response="";
		DateBuilder builder=new DateBuilder();
		System.out.println("Date Entered :"+date);
		
		
		if (validateDate(date)) 
			response=builder.buildDate(date);
		else 
			response="Invalid Date format"+"\n"+"Please Enter Date in the Format : dd-mm-yyyy hh:mm:ss AM/PM";
			System.out.println(response);
			System.out.println();
		
		return response;
	}
	
	public boolean validateDate(String date) {
		
		DateFormatValidator parser= new DateFormatValidator();
		
		return parser.isDateValid(date);
		
	}
	

}
