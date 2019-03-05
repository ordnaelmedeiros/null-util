package com.github.ordnaelmedeiros.nullutil;

import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.github.ordnaelmedeiros.nullutil.base.People;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NullPerformTryTest {

	private final int total = 100000;
	
	@Test
	public void use0Nothing() {
		assertTrue(true);
	}
	
	@Test
	public void useIf() {
		
		People people = new People();
		
		for (int i = 0; i < total; i++) {
			String name = null;
			if (people!=null && people.getAdress()!=null && people.getAdress().getName()!=null) {
				name = people.getAdress().getName();
			}
		}
		
		assertTrue(true);
	}
	
	@Test
	public void useTry() {
		
		People people = new People();
		
		for (int i = 0; i < total; i++) {
			String name;
			try {
				name = people.getAdress().getName();
			} catch (NullPointerException e) {
				name = null;
			}
		}
		
		assertTrue(true);
	}
	
	@Test
	public void useNullGet() {
		
		People people = new People();
		
		for (int i = 0; i < total; i++) {
			String name = Null.get(() -> people.getAdress().getName());
		}
		
		assertTrue(true);
	}
	
}
