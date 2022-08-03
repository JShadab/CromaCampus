package p1;

import p2.Engine;

public class Car {

	private String brand;

	private Engine engine;

	// Constructor injection
	public Car(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.startWorking();
	}

	public String getBrand() {
		return brand;
	}

	// Setter Injection
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	// Setter Injection
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
