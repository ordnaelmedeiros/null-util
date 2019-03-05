package com.github.ordnaelmedeiros.nullutil.validation;

import com.github.ordnaelmedeiros.nullutil.Consumer;

public class NullIs<T> {

	public boolean execute(Consumer<T> action) {
		try {
			T obj = action.accept();
			return obj==null;
		} catch (NullPointerException e) {
			return true;
		}
	}
	
}
