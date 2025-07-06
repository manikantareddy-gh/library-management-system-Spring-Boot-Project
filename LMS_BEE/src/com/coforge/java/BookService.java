package com.coforge.java;

import java.util.ArrayList;
import java.util.List;

public class BookService {

	List<Book> books = new ArrayList<>();

	public Book addbook(int book_id, String book_title, String book_author, String book_category, boolean isAvilable) {
		Book book = new Book(book_id, book_title, book_author, book_category, isAvilable);
		books.add(book);
		return book;
	}

	public String searchbook(int book_id, String book_title, String book_author) {
		int flag = 0;
		for (Book x : books) {
			if (x.getBook_id() == book_id || x.getBook_title().equalsIgnoreCase(book_title)
					|| x.getBook_author().equalsIgnoreCase(book_author)) {
				flag = 1;
			}
		}
		if (flag == 1)
			return "Hurray!! You found the book";
		else
			return "Book not found!!!";
	}

}
