package com.hcl.poc.date.util;

import java.util.ArrayList;
import java.util.Arrays;

public class DateListBuilder {

	
	public ArrayList<String> buildDateList(){
		
		ArrayList<String> dateList = new ArrayList();

//		 dd-mm-yyyy hh:mm:ss AM/PM
		String date1 = "01-01-2020 05:70:70 AM";
		String date2 = "01-01-2020 05:59:59 AM";
		String date3 = "01-01-2020 12:59:00 PM";
		String date4 = "01-01-2020 12:59:00";
		String date5 = "30-24-2020 12:59:00";
		
			dateList.add(date1);
			dateList.add(date2);
			dateList.add(date3);
			dateList.add(date4);
			dateList.add(date5);
			return dateList;
		
		
		
		
	}
	
}
