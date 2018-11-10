package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig
{
	@Bean
	public Author author()
	{
		return new Author("kanchan","India");
		
	}
	
	@Bean(initMethod="setUp",destroyMethod="tearDown")
	public Book book()
	{
		Book book = new Book();
		book.setIsbn("ABC123");
		book.setYear(2001);
		book.setAuth(author());
		return book;
	}
}
