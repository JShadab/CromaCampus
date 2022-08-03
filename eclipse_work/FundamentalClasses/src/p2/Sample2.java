package p2;

public class Sample2 {

	public static void main(String[] args) {

		// String object creation by String literal
		String s1 = "Java";
		String s2 = "Java";

		// String object creation by new Operator

		String s4 = new String("Python");
		String s3 = "Python";

		System.out.println("s1 == s2 : " + (s1 == s2)); // true => Both denote same object, so both have same address
		System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true

		System.out.println("---------------------");

		System.out.println("s3 == s4 : " + (s3 == s4)); // false : Different addresses
		System.out.println("s3.equals(s4) : " + s3.equals(s4)); // true

	}

}
