package com.coforge.java;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BookServiceTest {
	BookService service = new BookService();
	
	@Test
	public void testaddbook() {
		Book bookcreated = service.addbook(101, "Java", "Mani", "Programming", true);
		assertNotNull(bookcreated);
	}
	
	@Test
	public void testsearchbook() {
		service.addbook(101, "Java", "Mani", "Programming", true);
		String result = service.searchbook(101, "Java", "Mani");
		assertEquals("Hurray!! You found the book", result);
	}

}
