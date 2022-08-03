package com.musa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.musa.model.Car;
import com.musa.model.DieselEngine;
import com.musa.model.Engine;
import com.musa.model.PetrolEngine;

@Configuration
@ComponentScan(basePackages = "com.musa")
public class SpringConfig {

	@Bean(name = "car")
	public Car getCar() {

		Car car = new Car();
		return car;
	}

	@Bean(name = "petrol")
	public Engine getEngine() {
		Engine engine = new PetrolEngine();
		return engine;
	}
	

	@Bean(name = "diesel")
	public Engine getEngine2() {
		Engine engine = new DieselEngine();
		return engine;
	}

}
