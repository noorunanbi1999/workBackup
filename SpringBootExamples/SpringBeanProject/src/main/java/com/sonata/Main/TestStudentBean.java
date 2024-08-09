package com.sonata.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonata.Car;

public class TestStudentBean {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Car c1=(Car)context.getBean("car2");
		System.out.print(c1.getCarName()); 
	}

}
