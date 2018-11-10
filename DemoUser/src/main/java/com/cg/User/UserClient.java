package com.cg.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("user.xml");
		User user = (User) ctx.getBean("user");
		String name=user.getUsername();
		String pswrd=user.getPassword();
		System.out.println("username and password is");
		System.out.println(name);
		System.out.println(pswrd);
		

	}

}
