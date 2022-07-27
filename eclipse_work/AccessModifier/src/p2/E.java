package p2;

import p1.A;

/** From the other class of another package */
public class E {

	void f5() {

		A obj = new A();
		
		System.out.println(obj.a); // OK
		System.out.println(obj.b); // ERROR
		System.out.println(obj.c); // ERROR
		System.out.println(obj.d); // ERROR
	}

}
