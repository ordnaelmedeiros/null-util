package com.github.ordnaelmedeiros.nullutil;

@FunctionalInterface
public interface Consumer {

	Object accept() throws NullPointerException;
	
}
