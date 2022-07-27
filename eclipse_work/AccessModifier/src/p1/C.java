package p1;

/** From the sub class */
public class C extends A {

	void f3() {

		System.out.println(a); // OK
		System.out.println(b); // OK
		System.out.println(c); // OK
		System.out.println(d); // ERROR
	}

}
