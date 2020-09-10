package com.example.bookstore.model;

public class Book {
	private String title;
	private String Author;
	private int year;
	private String isbn;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String title, String author, int year, String isbn, double price) {
		super();
		this.title = title;
		Author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}

	
	
	}


