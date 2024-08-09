package com.sonata.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
	@Autowired
	@Qualifier("car2")
	private Car myCar;
	
	public User(){}

		public void printName() {
			System.out.println("My car is"+myCar.getCarName());
			System.out.println("My car is"+myCar.getCarYear());
		}
	
}
