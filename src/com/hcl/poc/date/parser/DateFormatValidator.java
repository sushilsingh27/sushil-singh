package com.hcl.poc.date.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatValidator {
	
	
	public  boolean isDateValid(String date) 
    { 
		 
		String regex = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4} (0[1-9]|1[0-2])(:(00|0[1-9]|[1-5][0-9])){2} (AM|PM)$";
		
		Pattern pattern = Pattern.compile(regex);
		
		    Matcher matcher = pattern.matcher(date);
		    
		    boolean isvaliddate= matcher.matches();
//		    System.out.println(date +" : "+isvaliddate);
      
		    return isvaliddate;
		    
    } 
	

}
