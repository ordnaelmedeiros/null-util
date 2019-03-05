package com.github.ordnaelmedeiros.nullutil.validation;

import com.github.ordnaelmedeiros.nullutil.Consumer;

public class NotNullOne {

	@SuppressWarnings("unchecked")
	public boolean execute(Consumer<Object> ...consumers) {
		
		NullIs<Object> isNull = new NullIs<>();
		for (Consumer<Object> consumer : consumers) {
			if (!isNull.execute(consumer)) {
				return true;
			}
		}
		
		return false;
		
	}
	
}
