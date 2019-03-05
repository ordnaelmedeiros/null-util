package com.github.ordnaelmedeiros.nullutil;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NullTestList {

	@Test
	public void teste1() {
		
		People people = new People();
		Address address = new Address();
		
		assertTrue(Null.one(() -> people.getAdress().getName(), () -> address));
		
	}
	
	@Test
	public void teste2() {
		
		People people = new People();
		Address address = new Address();
		
		assertTrue(Null.all(() -> people, () -> address));
		
	}
	
}
