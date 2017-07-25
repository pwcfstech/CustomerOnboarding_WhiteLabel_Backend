package com.afrAsia;


import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import com.afrAsia.entities.jpa.MsgHeader;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonUtils 
{
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static ObjectMapper mapper = new ObjectMapper();
	
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
		com.afrAsia.entities.jpa.MsgHeader.Error error = msgHeader.getError();
		error.setCd("404");
		error.setRsn("invaild Request");	
	}
	
	/**
	 * Method that deserialises a json string into it's corresponding object.
	 * 
	 * @param jsonString
	 * @param classType
	 * @return
	 * @throws JsonParseException
	 * @throws IOException
	 * @throws JsonMappingException
	 */
	public static <T> T jsonStringToObject(String jsonString, Class<T> classType) throws JsonParseException, IOException, JsonMappingException
	{
		if (jsonString == null || classType == null)
		{
			return null;
		}
		return mapper.readValue(jsonString, classType);
	}
	
	/**
	 * Method that serialises an object into a json string.
	 * 
	 * @param o
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String objectToJsonString(Object o) throws JsonProcessingException
	{
		if (o == null)
		{
			return null;
		}
		return mapper.writeValueAsString(o);
	}

}
