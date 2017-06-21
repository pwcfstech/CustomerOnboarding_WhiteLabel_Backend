package com.afrAsia;


import java.util.Calendar;
import java.util.Date;

import com.afrAsia.entities.MsgHeader;

public class CommonUtils {
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


	/**
	 * Adjust Database Equivalent of boolean value
	 * @param value
	 * @return
	 */
	public static String dbEqBoolean(Boolean value) {
		String valueStr = "0";
		if (value != null) {
			valueStr = value ? "1" : "0";
		}
		return valueStr;
	}

	/**
	 * To check value is null or blank
	 * @param value
	 * @return
	 */
	
	public static boolean checkNullorBlank(String value) {
		if (value != null && !value.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Convert object to String type
	 * @param obj
	 * @return
	 */
	
	public static String objToString(Object obj) {
		if (obj != null) {
			return obj.toString();
		} else {
			return null;
		}
	}
	
	/**
	 * Use this method to add number of days to date
	 * @param date
	 * @param number
	 * @return
	 */
	public static Date addDay(Date date, Integer number) {
		final Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, number);
		Date addedDate = cal.getTime();
		return addedDate;
	}
	
	public static void invalidReqErrorMsg(MsgHeader msgHeader) {
		com.afrAsia.entities.MsgHeader.Error error = msgHeader.getError();
		error.setCd("404");
		error.setRsn("invaild Request");
		
		
	}

}
