package methods;

public class Sample1 {

	// instance method
	void foo() {
		System.out.println("Hello from foo");
	}

	// static method
	static int sum(int a, int b) {
		// 1K line
		return a + b;
	}

	public static void main(String[] args) {

		int x = Sample1.sum(5, 10);
		System.out.println(x);

		Sample1 obj = new Sample1();
		obj.foo();

	}
}
