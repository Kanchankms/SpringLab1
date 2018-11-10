package com.cg;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CurrencyListClient {

	public static void main(String[] args)
	{
		ApplicationContext fact=new ClassPathXmlApplicationContext("currencylist.xml");
		CurrencyList curr = (CurrencyList) fact.getBean("currencyList");
		ArrayList<String> list=curr.getCurrList();
		System.out.println(list);
		

	}

}
