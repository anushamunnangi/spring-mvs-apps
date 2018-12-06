package com.ojas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test {
	public void m()
	{
		Calendar calendar = DateFormat.getDateInstance().getCalendar();
		calendar.setTime(new Date());		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = calendar.getTime();
		
		System.out.println(new java.sql.Date(date.getTime()));
	}
	public void m1()
	{
		SimpleDateFormat formatter =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String s = formatter.format(date);
		java.sql.Date sDate = new java.sql.Date(date.getTime());
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Test().m1();
	}
}
