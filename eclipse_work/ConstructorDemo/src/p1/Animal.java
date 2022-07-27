package p1;

public class Animal {
	
	private Animal() {
		System.out.println("I will eat you...");
	}
	
	void foo() {
		Animal a1 = new Animal();
		Animal a4 = new Animal();
		Animal a3 = new Animal();
		Animal a2 = new Animal();
	}

}
