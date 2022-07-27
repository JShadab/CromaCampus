package p1;

/** From the same class */
public class A {

	public int a;
	protected int b;
	int c;
	private int d;

	void f1() {
		System.out.println(a); // OK
		System.out.println(b); // OK
		System.out.println(c); // OK
		System.out.println(d); // OK
	}

}
