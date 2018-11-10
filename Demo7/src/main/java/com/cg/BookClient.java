package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookClient {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx=
					new AnnotationConfigApplicationContext(BookConfig.class);
		Book book1=(Book)ctx.getBean("book");
		System.out.println("Book HashCode : "+book1.hashCode());
		System.out.println("Book Info : "+book1);
		try
		{
			book1.tearDown();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ctx.close();
	}

}
