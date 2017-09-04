package com.nyal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToTimeStamp {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
		Date date=new Date();
		String dateString=date.toString();
		
		Calendar c = Calendar.getInstance();
	    c.setTime(date);
	    System.out.println(c.getTime());
	    
	    Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date.getTime());
		
		System.out.println(calendar.getTimeInMillis());
		int mYear = calendar.get(Calendar.YEAR);
		System.out.println(mYear);
		int mMonth = calendar.get(Calendar.MONTH);
		System.out.println(mMonth);
		int mDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(mDay);
	}

}
