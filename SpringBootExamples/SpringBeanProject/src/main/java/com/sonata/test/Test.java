package com.sonata.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonata.HelloScope;
import com.sonata.Employee.Employee;
import com.sonata.Student.Student;
import com.sonata.car.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		HelloScope x =(HelloScope)context.getBean("hello");
		x.setData("noor");
		System.out.print(x.getData());
		
//		User u1=(User)context.getBean("user");
//		u1.printName();
	}

}
