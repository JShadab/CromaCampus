package p1;

public class A {

	int i = 10; // instance variable
	static int j = 15; // static variable

	// instance method
	void m1() {
	}

	// static method
	static void m2() {
	}

	// No-Args or default Constructor
	public A() {
	}

	// Parameterized Constructor
	public A(int x) {
	}

	public static void main(String[] args) {

		A v1 = new A();
		A v2 = new A(10);

	}

}
