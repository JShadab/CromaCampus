package p2;

import zoo.Cow;

public class Child extends Parent {

	// Its not a overriding because private method of super class cannot be
	// overridden
	public void foo() {
		System.out.println("Hello from Child");
	}

	// Its not a overriding because static method cannot be overridden
	public static void blaah() {
		System.out.println("Hello from Parent");
	}

	@Override
	Cow sum(int a, int b) {
		return null;
	}

}
