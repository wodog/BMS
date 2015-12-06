package com.wodog.it.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String getPatternString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = format.format(date);
		return str;
	}

}
