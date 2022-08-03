package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.Car;

public class Main {

	public static void main(String[] args) {

		ApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");

		Car c1 = (Car) spring.getBean("car");
		
		System.out.println(c1.getEngine());

		c1.start();
	}

}
