package com.github.ordnaelmedeiros.nullutil;


public class NullUtil {

	public static boolean isNotNull(Consumer action) {
		try {
			Object obj = action.accept();
			return obj!=null;
		} catch (NullPointerException e) {
			return false;
		}
	}
	
	
	
}
