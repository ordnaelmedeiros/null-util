package com.github.ordnaelmedeiros.nullutil.validation;

import com.github.ordnaelmedeiros.nullutil.Consumer;

public class NullOneList {

	public boolean execute(Consumer<Object> ...consumers) {
		
		NullIsNull<Object> isNull = new NullIsNull<>();
		for (Consumer<Object> consumer : consumers) {
			if (isNull.execute(consumer)) {
				return true;
			}
		}
		
		return false;
		
	}
	
}
