package com.sonata.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonata.Employee.Employee;

public class TestProduct {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Product p =(Product)context.getBean("Product1");
		System.out.println("The rice of the Product: "+p);

	}

}
