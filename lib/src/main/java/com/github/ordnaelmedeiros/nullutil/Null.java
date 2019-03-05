package com.github.ordnaelmedeiros.nullutil;

import com.github.ordnaelmedeiros.nullutil.validation.NullIsNull;
import com.github.ordnaelmedeiros.nullutil.validation.NullOneList;

public class Null {

	public static <T> boolean isNot(Consumer<T> action) {
		return !is(action);
	}
	
	public static <T> boolean is(Consumer<T> action) {
		return new NullIsNull<T>().execute(action);
	}
	
	public static boolean one(Consumer<Object> ...consumers) {
		return new NullOneList().execute(consumers);
	}

	public static boolean all(Consumer<Object> ...consumers) {
		return !new NullOneList().execute(consumers);
	}
	
}
