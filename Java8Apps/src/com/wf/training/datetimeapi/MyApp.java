package com.wf.training.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LocalDate date = LocalDate.now();
		LocalDateTime dateTime1 = LocalDateTime.now();
		LocalDateTime dateTime2 = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		// LocalDateTime.
		// factory methods
		// instance
		
	}

}
