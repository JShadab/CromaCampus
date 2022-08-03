package com.musa.model;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements Engine {

	@Override
	public void startWorking() {
		
		System.out.println("Petrol Engine is working...");

	}
	
	@Override
	public String toString() {
		
		return "Petrol Engine";
	}

}
