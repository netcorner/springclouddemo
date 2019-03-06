package com.netcorner.webui.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTools {
	/**
	 * 字符转日期
	 * @param dateStr
	 * @param pattern
	 * @return
	 */
	public static Date string2Date(String dateStr,String pattern){
		DateFormat dateFormat=new SimpleDateFormat(pattern); 
		Date date=null;
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	/**
	 * 字符转日期
	 * @param dateStr
	 * @return
	 */
	public static Date string2Date(String dateStr){
		return string2Date(dateStr,"yyyy-MM-dd HH:mm:ss");
	}
	/**
	 * 字符转日期并格式化
	 * @param dateStr
	 * @param pattern
	 * @return
	 */
	public static String string2DateByFormat(String dateStr,String pattern){
		DateFormat dateFormat=new SimpleDateFormat(pattern); 
		Date date=null;
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dateFormat.format(date);
	}
	/**
	 * 字符转日期并格式化
	 * @param dateStr
	 * @return
	 */
	public static String string2DateByFormat(String dateStr){
		return string2DateByFormat(dateStr,"yyyy-MM-dd HH:mm:ss");
	}
	/**
	 * date转Calendar
	 * @param date
	 * @return
	 */
	public static Calendar date2Calendar(Date date){
		Calendar calendar=Calendar.getInstance();  
		calendar.setTime(date); 
		return calendar;
	}
	/**
	 * Calendar转date
	 * @param calendar
	 * @return
	 */
	public static Date calendar2Date(Calendar calendar){
		Calendar ca=Calendar.getInstance();    
		Date d =(Date) ca.getTime(); 
		return d;
	}
	/**
	 * 字符转Calendar
	 * @param str
	 * @return
	 */
	public static Calendar string2Calendar(String str){
		return date2Calendar(string2Date(str));
	}
	
	/**
	 * 
	 * @category 获取格式化后的当前日期
	 * @return
	 * @CreateDate 2010-8-30 下午03:48:53
	 */
	public static String getNowDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(System.currentTimeMillis());
	}
	/**
	 * 得到当前时间
	 * @return
	 */
	public static String getNowDate() {
		return getNowDate("yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 时间加（周）
	 * @param d
	 * @param week
	 * @return
	 */
	 public static Date addWeek(Date d,long week){
		  long time = d.getTime(); 
		  time+= week*7*24*60*60*1000; 
		  return new Date(time);
	 }
	/**
	 * 时间加（天）
	 * @param d
	 * @param day
	 * @return
	 */
	 public static Date addDay(Date d,long day){
		  long time = d.getTime(); 
		  time+= day*24*60*60*1000; 
		  return new Date(time);
	 }
	/**
	 * 时间加（小时）
	 * @param d
	 * @param hour
	 * @return
	 */
	 public static Date addHour(Date d,long hour){
		  long time = d.getTime(); 
		  time+= hour*60*60*1000; 
		  return new Date(time);
	 }
	 /**
	  * 时间加（分钟）
	  * @param d
	  * @param minute
	  * @return
	  */
	 public static Date addMinute(Date d,long minute){
		  long time = d.getTime(); 
		  time+= minute*60*1000; 
		  return new Date(time);
	 }
	 /**
	  * 时间加（秒）
	  * @param d
	  * @param second
	  * @return
	  */
	 public static Date addSecond(Date d,long second){
		  long time = d.getTime(); 
		  time+= second*1000; 
		  return new Date(time);
	 }
	 /**
	  * 得到农历 
	  * @param cal
	  * @return
	  */
	 public static Lunar getLunar(Calendar cal) {
	        return Lunar.getLunar(cal);
	 }
	 /**
	  * 得到农历 
	  * @param date
	  * @return
	  */
	 public static Lunar getLunar(Date date) {
	        return Lunar.getLunar(date2Calendar(date));
	 }
}
