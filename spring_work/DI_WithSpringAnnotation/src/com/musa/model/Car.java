package com.musa.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Car {

	@Autowired
	@Qualifier("diesel")
	private Engine engine;

	public void start() {
		
		engine.startWorking();
		System.out.println(" Car is moving....");
	}

}
