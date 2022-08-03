package sorting;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private double salary;

	Employee() {
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee emp) {

		// return this.getName().compareTo(emp.getName());

		// return this.getAge() - emp.getAge();

		double sal1 = this.getSalary();
		double sal2 = emp.getSalary();

		if (sal1 > sal2) {
			return 1;
		} else if (sal1 < sal2) {
			return -1;
		} else {
			return 0;
		}

	}

}
