package com.github.ordnaelmedeiros.nullutil;

import static com.github.ordnaelmedeiros.nullutil.Null.is;
import static com.github.ordnaelmedeiros.nullutil.Null.isNot;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NullTestIs {

	@Test
	public void objNotNull() {
		People people = new People();
		assertTrue(isNot(() -> people));
	}
	
	@Test
	public void objNotNullPath1() {
		People people = new People();
		people.setAdress(new Address());
		assertTrue(isNot(() -> people.getAdress()));
	}
	
	@Test
	public void objNotNullPath2() {
		People people = new People();
		people.setAdress(new Address());
		people.getAdress().setName("Test");
		assertTrue(isNot(() -> people.getAdress().getName()));
	}
	
	@Test
	public void objNull() {
		People people = null; 
		assertTrue(is(() -> people));
	}
	
	@Test
	public void objNullPath1() {
		People people = new People();
		assertTrue(is(() -> people.getAdress().getName()));
	}
	
	@Test
	public void objNullPath2() {
		People people = new People();
		people.setAdress(new Address());
		assertTrue(is(() -> people.getAdress().getName()));
	}
	
}
