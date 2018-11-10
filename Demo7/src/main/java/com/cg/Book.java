package com.cg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book
{
	private String isbn;
	private int year;
	Author auth;
	
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	


	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", year=" + year + ", auth=" + auth + "]";
	}
	@PostConstruct
	void init()
	{
		System.out.println("In init() - called thru @PostContruct");
	}
	
	@PreDestroy
	void destroy()
	{
		System.out.println("In destroy() - called thru @PreDestroy");
	}
	
	void setUp()
	{
		System.out.println("setUp()");
	}
	
	void tearDown()
	{
		System.out.println("tearDown()");
	}
	
	
	
	
}
