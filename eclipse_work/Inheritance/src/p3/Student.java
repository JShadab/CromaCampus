package p3;

abstract public class Student {

	void greet() {
		System.out.println("Good Morning...");
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.greet();
	}

}
