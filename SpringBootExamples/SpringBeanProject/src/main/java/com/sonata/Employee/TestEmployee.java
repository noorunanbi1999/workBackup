package com.sonata.Employee;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonata.Student.Student;


public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Employee x =(Employee)context.getBean("Employee1");
		System.out.print(x.getAddress().getCountry());
		
		Student d1=(Student)context.getBean("studentData");
		 d1.display();
		
	}

}
