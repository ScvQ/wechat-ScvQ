package com.joker.util.string;

public class StringUtil {

	public static boolean isNullOrEmpty(String obj) {
		return obj == null || "".equals(obj.toString().trim());
	}

}
