package p1;

public class Employee extends Person {
	
	Dog dog;
	
	public Employee() {
		dog = new Dog();
	}
	
	void doWork() {
		System.out.println("Employee is doing his work");
	}

}
