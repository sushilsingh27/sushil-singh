package com.hcl.poc.date.service;

import com.hcl.poc.date.parser.*;
import com.hcl.poc.date.util.DateBuilder;

public class DateFormatService {
	
	
	public String formatDate(String date) {
		
		DateBuilder builder=new DateBuilder();
		
		System.out.println("Date Entered :"+date);
		
		if (validateDate(date)) 
			builder.buildDate(date);
		else 
			System.out.println("Invalid Date format");
			System.out.println("Please Enter Date in the Format : dd-mm-yyyy hh:mm:ss AM/PM");
		
		return "";
	}
	
	public boolean validateDate(String date) {
		
		DateFormatValidator parser= new DateFormatValidator();
		
		return parser.isDateValid(date);
		
	}
	

}
