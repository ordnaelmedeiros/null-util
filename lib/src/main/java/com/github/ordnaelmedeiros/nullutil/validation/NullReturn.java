package com.github.ordnaelmedeiros.nullutil.validation;

import com.github.ordnaelmedeiros.nullutil.Consumer;

public class NullReturn<T> {

	private T r;

	public NullReturn(T r) {
		this.r = r;
	}
	
	public T execute(Consumer<T> action) {
		try {
			T obj = action.accept();
			if (obj==null) {
				return r;
			} else {
				return obj;
			}
		} catch (NullPointerException e) {
			return r;
		}
	}
	
}
