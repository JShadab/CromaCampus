package p1;

public class Employee implements Cloneable{

	private String name;
	private int age;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
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
	public boolean equals(Object obj) {
		Employee x = this;
		Employee y = (Employee) obj;

		boolean isName= x.getName().equals(y.getName());
		boolean isAge= x.getAge() == y.getAge();

		 return isAge && isName;
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee) super.clone();
	}

}
