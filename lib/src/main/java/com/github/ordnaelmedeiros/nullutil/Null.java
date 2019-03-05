package com.github.ordnaelmedeiros.nullutil;

import com.github.ordnaelmedeiros.nullutil.validation.NotNullOne;
import com.github.ordnaelmedeiros.nullutil.validation.NullIs;
import com.github.ordnaelmedeiros.nullutil.validation.NullOne;
import com.github.ordnaelmedeiros.nullutil.validation.NullReturn;

public class Null {

	public static <T> T get(Consumer<T> action) {
		return get(null, action);
	}
	
	public static <T> T get(T r, Consumer<T> action) {
		return new NullReturn<T>(r).execute(action);
	}
	
	public static <T> boolean is(Consumer<T> action) {
		return new NullIs<T>().execute(action);
	}
	
	public static <T> boolean isNot(Consumer<T> action) {
		return !is(action);
	}
	
	@SafeVarargs	
	public static boolean one(Consumer<Object> ...consumers) {
		return new NullOne().execute(consumers);
	}

	@SafeVarargs
	public static boolean oneNot(Consumer<Object> ...consumers) {
		return new NotNullOne().execute(consumers);
	}
	
	@SafeVarargs
	public static boolean all(Consumer<Object> ...consumers) {
		return !oneNot(consumers);
	}
	
	@SafeVarargs
	public static boolean allNot(Consumer<Object> ...consumers) {
		return !one(consumers);
	}
	
}
