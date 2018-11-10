package com.cg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Author
{
	private String authorName;
	private String address;
	
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", address=" + address
				+ "]";
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
	
	public Author(String authorName, String address) {
		super();
		this.authorName = authorName;
		this.address = address;
	}
	
	
}
