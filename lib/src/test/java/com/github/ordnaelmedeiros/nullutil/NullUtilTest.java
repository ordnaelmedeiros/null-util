package com.github.ordnaelmedeiros.nullutil;

import static com.github.ordnaelmedeiros.nullutil.NullUtil.isNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NullUtilTest {

	@Test
	public void objNotNull() {
		Object obj = new Object();
		assertTrue(isNotNull(() -> obj));
	}
	
	@Test
	public void objNull() {
		Object obj = null; 
		assertFalse(isNotNull(() -> obj));
	}
	
	@Test
	public void objPathNotNull() {
		Object obj = new Object();
		assertTrue(isNotNull(() -> obj.getClass()));
	}
	
	@Test
	public void objPathNull() {
		Object obj = null; 
		assertFalse(isNotNull(() -> obj.getClass()));
	}
	
}
