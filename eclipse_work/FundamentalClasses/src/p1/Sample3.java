package p1;

public class Sample3 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("Papa");
		e1.setAge(21);
		e1.setSalary(123.56);

		Employee e2 = new Employee("Papa", 22, 123.56);

		System.out.println("e1 == e2 : " + (e1 == e2)); // false -> It will compare references or addresses.

		System.out.println("e1.equals(e2) : " + e1.equals(e2)); // false -> It will compare content wise.

	}

}
