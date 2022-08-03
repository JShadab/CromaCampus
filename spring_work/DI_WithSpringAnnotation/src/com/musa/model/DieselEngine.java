package com.musa.model;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements Engine {

	@Override
	public void startWorking() {

		System.out.println("Diesel Engine is working...");

	}

}
