package com.github.ordnaelmedeiros.nullutil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.github.ordnaelmedeiros.nullutil.base.Address;
import com.github.ordnaelmedeiros.nullutil.base.People;

public class NullReturnTest {

	@Test
	public void returnSameName() {
		
		People people = new People();
		people.setName("Test");
		
		String name = Null.get(() -> people.getName());
		assertNotNull(name);
		assertEquals("Test", name);
		
	}
	
	@Test
	public void returnSameAddress() {
		
		Address address = new Address();
		address.setName("Test");
		People people = new People();
		people.setAdress(address);
		
		Address test = Null.get(() -> people.getAdress());
		assertNotNull(test);
		assertEquals("Test", test.getName());
		
	}
	
	@Test
	public void returnNullIfRootNull() {
		
		People people = null;
		
		String name = Null.get(() -> people.getName());
		assertNull(name);
		
	}
	
	@Test
	public void returnNullIfFinalNull() {
		
		People people = new People();
		
		String name = Null.get(() -> people.getName());
		assertNull(name);
		
	}
	
	@Test
	public void returnNullIfPathNull() {
		
		People people = new People();
		
		String name = Null.get(() -> people.getAdress().getName());
		assertNull(name);
		
	}
	

	@Test
	public void returnDefaultStringIfPathNull() {
		
		People people = new People();
		
		String name = Null.get("Default", () -> people.getAdress().getName());
		assertNotNull(name);
		assertEquals("Default", name);
		
	}
	
	@Test
	public void returnDefaultAddressIfNull() {
		
		Address address = new Address();
		address.setName("Test");
		
		People people = new People();
		
		Address test = Null.get(address, () -> people.getAdress());
		assertNotNull(test);
		assertEquals("Test", test.getName());
		
	}
	
	
}
