package p1;

public class Sample4 {

	public static void main(String[] args) throws Exception {

		// First way of creating object in Java
		Employee e1 = new Employee("Papa", 22, 123.56);

		// Second way of creating object in Java
		Class clazz = e1.getClass();
		Employee e2 = (Employee) clazz.newInstance();
		
		System.out.println(e1.hashCode() == e2.hashCode());
		System.out.println(e1  == e2);
		System.out.println(e1);
		System.out.println(e2);

	}

}
