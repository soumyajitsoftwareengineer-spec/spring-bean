package com.spring.beansproject;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	@Autowired
	Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student(Book book) {
		super();
		this.book = book;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
