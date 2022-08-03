package p1;

public class Sample5 {

	public static void main(String[] args) throws Exception {

		// First way of creating object in Java
		Employee e1 = new Employee("Papa", 22, 123.56);

		// Second way of creating object in Java
		Class clazz = e1.getClass();
		Employee e2 = (Employee) clazz.newInstance();

		// Third way of creating object in Java
		Employee e3 = e1.clone();
		
		System.out.println(e1);
		System.out.println(e3);

	}

}
