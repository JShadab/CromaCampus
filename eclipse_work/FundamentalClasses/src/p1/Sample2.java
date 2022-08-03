package p1;

public class Sample2 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("Abc");
		e1.setAge(21);
		e1.setSalary(123.56);

		System.out.println(e1.toString()); // p1.Employee@6f2b958e

		System.out.println("-----------------------------------");

		Employee e2 = new Employee("Pqr", 25, 456.34);
		System.out.println(e2); // p1.Employee@5e91993f
	}

}
