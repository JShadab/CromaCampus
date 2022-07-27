package p1;

/** From the another class */
public class B {

	void f2() {
		A obj = new A();
		System.out.println(obj.a); // OK
		System.out.println(obj.b); // OK
		System.out.println(obj.c); // OK
		System.out.println(obj.d); // ERROR
	}

}
