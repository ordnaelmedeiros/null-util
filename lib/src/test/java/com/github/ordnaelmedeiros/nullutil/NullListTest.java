package com.github.ordnaelmedeiros.nullutil;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.ordnaelmedeiros.nullutil.base.Address;
import com.github.ordnaelmedeiros.nullutil.base.People;

public class NullListTest {

	@Test
	public void oneReturnTrueIfOneIsNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertTrue(Null.one(() -> people.getAdress().getName(), () -> address));
		
	}
	
	@Test
	public void oneReturnTrueIfAllIsNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertTrue(Null.one(() -> people.getAdress().getName(), () -> address.getName()));
		
	}
	
	@Test
	public void oneReturnFalseIfAllIsNotNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertFalse(Null.one(() -> people, () -> address));
		
	}
	
	@Test
	public void oneNotReturnTrueIfOneIsNotNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertTrue(Null.oneNot(() -> people.getAdress().getName(), () -> address));
		
	}
	
	@Test
	public void oneNotReturnFalseIfAllIsNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertFalse(Null.oneNot(() -> people.getAdress().getName(), () -> address.getName()));
		
	}
	
	@Test
	public void oneNotReturnTrueIfAllIsNotNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertTrue(Null.oneNot(() -> people, () -> address));
		
	}
	
	@Test
	public void allReturnTrueIfAllIsNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertTrue(Null.all(() -> people.getAdress().getName(), () -> address.getName()));
		
	}
	
	@Test
	public void allReturnFalseIfOneIsNotNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertFalse(Null.all(() -> people.getAdress().getName(), () -> address));
		
	}
	
	@Test
	public void allReturnFalseIfAllIsNotNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertFalse(Null.all(() -> people, () -> address));
		
	}
	
	

	@Test
	public void allNotReturnFalseIfAllIsNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertFalse(Null.allNot(() -> people.getAdress().getName(), () -> address.getName()));
		
	}
	
	@Test
	public void allNotReturnFalseIfOneIsNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertFalse(Null.allNot(() -> people.getAdress().getName(), () -> address));
		
	}
	
	@Test
	public void allNotReturnTrueIfAllIsNotNull() {
		
		People people = new People();
		Address address = new Address();
		
		assertTrue(Null.allNot(() -> people, () -> address));
		
	}
	
}
