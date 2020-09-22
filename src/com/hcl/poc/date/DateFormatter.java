package com.hcl.poc.date;

import java.util.ArrayList;
import java.util.Arrays;

import com.hcl.poc.date.service.*;
import com.hcl.poc.date.util.DateListBuilder;

public class DateFormatter {

	public static void main(String[] args) {
		
		DateListBuilder buider=new DateListBuilder();
		ArrayList<String> dateList = new ArrayList();
		dateList = (args.length > 0)?(ArrayList<String>) (Arrays.asList(args)):buider.buildDateList();
		DateFormatService dateservice = new DateFormatService();

		for (String date : dateList) {
			dateservice.formatDate(date);
		}

	}

}
