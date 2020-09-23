package com.hcl.poc.date.util;

import java.util.Date;
import java.util.TreeMap;

public class DateBuilder {


//	public static void main(String[] args) {
//
//		DateBuilder builder = new DateBuilder();
//
//		builder.buildDateUints();
//	}

	public String buildDate(String dummydate) {

//		String dummydate = "03-07-2020 06:07:00 PM";
//		String dummydate = "23-07-2123 06:07:00 AM";
//		String dummydate2 = "03-07-2020 06:07:00 PM";
//		String dummydate3 = "03-07-2020 06:07:00 PM";

		String[] wholedatearray = dummydate.split(" ");
		String datestr = wholedatearray[0];
		String timestr=wholedatearray[1];
		String daywish=wholedatearray[2];
		
		String[] datearray = datestr.split("-");
		String day = getExponent(datearray[0]);
		String month = getMonth(datearray[1]);
		String year = datearray[2];
		
		
		
		String []timearray=timestr.split(":");
		String hour=hour=numberToWord(timearray[0]);
		String minutes=numberToWord(timearray[1]);
		String seconds=numberToWord(timearray[2]);
		String dayofweek=getDayOfWeek(Integer.parseInt(year),Integer.parseInt(datearray[1]) ,Integer.parseInt(datearray[0]));
		
		String finaldaywishes=daywish.equals("AM")?"Morning":"Evening";
		String datefinalstr="Date : " + day+"-"+month+"-"+buildYearString(year);
		String weekday= "Day of week : "+dayofweek;
		String timefinalstr="Time : "+hour+" Hours"+" "+minutes+" Minites"+" "+seconds+" Seconds"+"-"+finaldaywishes;
		
		
		System.out.println(datefinalstr);
		System.out.println(timefinalstr);
		System.out.println(weekday);
		
		String datetime=datefinalstr+"\n"+timefinalstr+"\n"+weekday;

		return datetime;
	}
	
	
	public String numberToWord(String yearprefix) {
		
		String year="";
		String yearfirstchar = Character.toString(yearprefix.charAt(0));
		String yearsecondtchar = Character.toString(yearprefix.charAt(1));
		
		Integer yearscddigit = Integer.parseInt(yearsecondtchar);
		
		Integer yearprefixint = Integer.parseInt(yearprefix);

		if (yearprefixint < 21 || yearscddigit==0) {
			year = getYear(yearprefixint);
		}

		if (yearprefixint>20 && yearscddigit!=0) {
			
			String twodigit=yearfirstchar+"0";
			year=getYear(Integer.parseInt(twodigit)).toString().trim();
			year = year + " "+getYear(yearscddigit);
		}
		return year;
		
	}
	
	
	
	public String buildYearString(String year) {
		String yearprefix = year.substring(0, 2);
		String yearsuffix = year.substring(2, 4);
//		Integer yearsuffixint = Integer.parseInt(yearsuffix);
		String yearfinalstr=numberToWord(yearprefix)+" "+numberToWord(yearsuffix);
		
		return yearfinalstr;
		
	}

	String getExponent(String dateunit) {

		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("1", "st");
		map.put("2", "nd");
		map.put("3", "rd");
		map.put("4", "th");
		map.put("5", "th");
		map.put("6", "th");
		map.put("7", "th");
		map.put("8", "th");
		map.put("9", "th");
		map.put("0", "th");

		String scdchar = Character.toString(dateunit.charAt(1));
		String expostr = map.get(scdchar);

		return dateunit + expostr;
	}

	public String getMonth(String month) {
		TreeMap<String, String> monthmap = new TreeMap<String, String>();
		monthmap.put("01", "January");
		monthmap.put("02", "Feburay");
		monthmap.put("03", "March");
		monthmap.put("04", "April");
		monthmap.put("05", "May");
		monthmap.put("06", "June");
		monthmap.put("07", "July");
		monthmap.put("08", "Auguest");
		monthmap.put("09", "September");
		monthmap.put("10", "October");
		monthmap.put("11", "November");
		monthmap.put("12", "December");

		return monthmap.get(month);

	}

	public String getYear(Integer year) {
		
		TreeMap<Integer, String> yearmap = new TreeMap<Integer, String>();
		yearmap.put(0, "Zero");
		yearmap.put(1, "One");
		yearmap.put(2, "two");
		yearmap.put(3, "Three");
		yearmap.put(4, "Four");
		yearmap.put(5, "Five");
		yearmap.put(6, "Six");
		yearmap.put(7, "Seven");
		yearmap.put(8, "Eight");
		yearmap.put(9, "Nine");
		yearmap.put(10, "Ten");
		yearmap.put(11, "Eleven");
		yearmap.put(12, "Twelve");
		yearmap.put(13, "Thirteen");
		yearmap.put(14, "Forteen");
		yearmap.put(15, "Fifteen");
		yearmap.put(16, "Sixteen");
		yearmap.put(17, "Seventeen");
		yearmap.put(18, "Eighteen");
		yearmap.put(19, "Nineteen");
		yearmap.put(20, "Twenty");
		yearmap.put(30, "Thirty");
		yearmap.put(40, "Fourty");
		yearmap.put(50, "Fifty");
		yearmap.put(60, "Sixty");
		yearmap.put(70, "Seventy");
		yearmap.put(80, "Eighty");
		yearmap.put(90, "Ninety");

		return yearmap.get(year);
	}
	
	
	
	public String getDayOfWeek(int year,int month,int dt) {
		
		
		Date date=new Date(year-1900,month-1,dt);
		
		String day=date.toString().substring(0, 4).trim();
		
		System.out.println("Substring is : "+day);
		
		System.out.println(date.toString());
		
		TreeMap<String, String> yearmap = new TreeMap<String, String>();
		yearmap.put("Mon", "Monday");
		yearmap.put("Tue", "Tuesday");
		yearmap.put("Wed", "Wednesday");
		yearmap.put("Thu", "Thursday");
		yearmap.put("Fri", "Friday");
		yearmap.put("Sat", "Saturday");
		yearmap.put("Sun", "Sunday");
		
		
		return yearmap.get(day);
	}

}
