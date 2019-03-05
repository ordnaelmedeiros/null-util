package com.github.ordnaelmedeiros.nullutil;

@FunctionalInterface
public interface Consumer<T> {

	T accept() throws NullPointerException;
	
}
