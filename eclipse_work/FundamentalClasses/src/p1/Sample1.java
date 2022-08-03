package p1;

public class Sample1 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		int h1 = e1.hashCode();
		System.out.println(h1);

		int h2 = e2.hashCode();
		System.out.println(h2);
	}

}
