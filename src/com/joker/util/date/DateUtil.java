package com.joker.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.joker.util.string.StringUtil;


public class DateUtil {

	public static Date getDateFromStr(String dateStr,String format){
		if(StringUtil.isNullOrEmpty(dateStr))
			return null;
		try {
			Date date = new SimpleDateFormat(format).parse(dateStr);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getDateFormat(Date date,String format){
		return new SimpleDateFormat(format).format(date);
	}
	
	public static Date getDateSubDay(Date date,int day){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, day);
		return calendar.getTime();
	}
	
	
	public static String getDateFormat(long time,String format){
		
		Date d = new Date(time);
		return new SimpleDateFormat(format).format(d);
		
		
	}
	
}
