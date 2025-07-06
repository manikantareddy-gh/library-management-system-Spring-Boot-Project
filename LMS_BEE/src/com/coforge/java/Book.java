package com.coforge.java;

public class Book {
	private int book_id;
	private String book_title;
	private String book_author;
	private String book_category;
	private boolean isAvilable;

	public Book(int book_id, String book_title, String book_author, String book_category, boolean isAvilable) {
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_author = book_author;
		this.book_category = book_category;
		this.isAvilable = isAvilable;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_category() {
		return book_category;
	}

	public void setBook_category(String book_category) {
		this.book_category = book_category;
	}

	public boolean isAvilable() {
		return isAvilable;
	}

	public void setAvilable(boolean isAvilable) {
		this.isAvilable = isAvilable;
	}

}
