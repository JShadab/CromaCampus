package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.musa.SpringConfig;
import com.musa.model.Car;

public class Main {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);

		Car c1 = (Car) spring.getBean("car");
		c1.start();

		System.out.println("--------------------------");

//		Engine engine1 = (Engine) spring.getBean("petrol");
//		engine1.startWorking();
//
//		System.out.println("--------------------------");
//
//		Engine engine2 =  spring.getBean("diesel", Engine.class);
//		engine2.startWorking();
	}

}
