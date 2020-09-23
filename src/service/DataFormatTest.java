package com.hcl.poc.date.tests.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.hcl.poc.date.parser.DateFormatValidator;
import com.hcl.poc.date.service.DateFormatService;
import com.hcl.poc.date.util.DateBuilder;

import junit.framework.*;

public class DataFormatTest {

	@Test
	public void testFordayofWeek() {
		DateBuilder builder = new DateBuilder();
		assertEquals("Wednesday", builder.getDayOfWeek(2020, 9, 23));
		assertEquals("Thursday", builder.getDayOfWeek(2020, 9, 24));
	}
	
	

	@Test
	public void testForFullDate() {

		String fulldate = "Date : 03rd-July-Twenty Twenty" + "\n" + "Time : Six Hours Seven Minites Ten Seconds-Morning"
				+ "\n" + "Day of week : Friday";

		DateBuilder builder = new DateBuilder();
		assertEquals(fulldate, builder.buildDate("03-07-2020 06:07:10 AM"));
	}

	@Test
	public void testForYear() {
		DateBuilder builder = new DateBuilder();
		assertEquals("Twenty Twenty", builder.buildYearString("2020"));
		assertEquals("Twenty Twenty One", builder.buildYearString("2021"));
		assertEquals("Nineteen Seventy Three", builder.buildYearString("1973"));
	}

	@Test
	public void testForMonth() {
		DateBuilder builder = new DateBuilder();
		assertEquals("May", builder.getMonth("05"));
		assertEquals("Auguest", builder.getMonth("08"));
		assertEquals("December", builder.getMonth("12"));
	}

	@Test
	public void isValidDateFormat() {
		DateFormatValidator validator = new DateFormatValidator();

//		Cotrrect date format
//		23-09-2020 06:07:10 AM

//		Without PM/AM
		assertFalse(validator.isDateValid("01-01-2020 12:59:00"));

//		Month greater than > 12
		assertFalse(validator.isDateValid("23-14-2020 06:07:10 AM"));

//		Date greater than > 31
		assertFalse(validator.isDateValid("31-14-2020 06:07:10 AM"));

//		Hours greater than >12 hours1
		assertFalse(validator.isDateValid("31-14-2020 14:07:10 AM"));

//		Minutes greater than >59 
		assertFalse(validator.isDateValid("31-14-2020 06:60:10 AM"));

//		Seconds greater than >59 
		assertFalse(validator.isDateValid("31-14-2020 06:40:70 AM"));

//		Correct date format
		assertTrue(validator.isDateValid("23-09-2020 06:07:10 AM"));

	}

}
