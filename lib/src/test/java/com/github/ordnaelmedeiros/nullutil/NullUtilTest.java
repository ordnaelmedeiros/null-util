package com.github.ordnaelmedeiros.nullutil;

import static com.github.ordnaelmedeiros.nullutil.NullUtil.isNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NullUtilTest {

	@Test
	public void objNotNull() {
		People people = new People();
		assertTrue(isNotNull(() -> people));
	}
	
	@Test
	public void objNotNullPath1() {
		People people = new People();
		people.setAdress(new Address());
		assertTrue(isNotNull(() -> people.getAdress()));
	}
	
	@Test
	public void objNotNullPath2() {
		People people = new People();
		people.setAdress(new Address());
		people.getAdress().setName("Test");
		assertTrue(isNotNull(() -> people.getAdress().getName()));
	}
	
	
	@Test
	public void objNull() {
		People people = null; 
		assertFalse(isNotNull(() -> people));
	}
	
	@Test
	public void objNullPath1() {
		People people = new People();
		assertFalse(isNotNull(() -> people.getAdress().getName()));
	}
	
	@Test
	public void objNullPath2() {
		People people = new People();
		people.setAdress(new Address());
		assertFalse(isNotNull(() -> people.getAdress().getName()));
	}
	
}
