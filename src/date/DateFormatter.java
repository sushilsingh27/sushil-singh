package com.hcl.poc.date;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.hcl.poc.date.service.*;
import com.hcl.poc.date.util.DateBuilder;
import com.hcl.poc.date.util.DateListBuilder;

public class DateFormatter {

	public static void main(String[] args) {
		
		DateListBuilder buider=new DateListBuilder();
		ArrayList<String> dateList = new ArrayList<String>();
		dateList = (args.length > 0)?(ArrayList<String>) (Arrays.asList(args)):buider.buildDateList();
		DateFormatService dateservice = new DateFormatService();

		for (String date : dateList) {
			dateservice.formatDate(date);
		}
		

	}

}
