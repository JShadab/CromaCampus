package p1;

import p2.Engine;

public class Car {

	private String brand;
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void start() {

		System.out.println(brand + " Car is moving....");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
