package com.coforge.java;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LibrarienServiceTest {
	LibrarienService lservice = new LibrarienService();

	@Test
	public void testaddcustomer() {
		Customer cus = lservice.addcustomer(1, "manikanta", -1);
		assertNotNull(cus);
	}
	
	@Test
	public void testPenalty() {
	    String ans = lservice.calculatedue(13);
	    assertEquals("you had penalty for 3 please pay 300", ans);
	}


}
