package com.nyal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConversion {

	public static void main(String[] args) {

		String dateString="Wed Aug 23 05:30:00 IST 2017";
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		
		Date date=null;
		try {
			date=simpleDateFormat.parse(dateString);
			System.out.println("date is : "+date);
		} catch (ParseException e) {
			System.out.println("can not convert");
		}
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		String result = format.format(date);
		System.out.println("result : "+result);
		Date date2=null;
		try {
			date2=format.parse(result);
			System.out.println("date2 is : "+date2);
			System.out.println(date2.getTime());
			
		} catch (ParseException e) {
			System.out.println("can not convert");
		}
		
		Long newMiliSecs=date2.getTime();
		System.out.println(newMiliSecs);
		System.out.println(newMiliSecs+86399000L);
		Date currentDate = new Date(newMiliSecs+86399000L);
		System.out.println("currentDate : "+currentDate);
		
	}

}
