package p2;

import p1.A;

/** From the sub class of another package */
public class D extends A {

	void f4() {

		System.out.println(a); // OK
		System.out.println(b); // OK (Through inheritance)
		System.out.println(c); // ERROR
		System.out.println(d); // ERROR
	}

}
