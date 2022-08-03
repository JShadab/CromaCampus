package test;

import p1.Car;
import p2.DieselEngine;
import p2.Engine;

public class Main {

	public static void main(String[] args) {

		Engine engine = new DieselEngine();

		Car c1 = new Car(engine);

		c1.setBrand("BMW");

		c1.start();
	}

}
