package p1;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Main Before");
		f1();
		System.out.println("Main After");
	}

	private static void f1() {
		System.out.println("F1 Before");
		f2();
		System.out.println("F1 After");

	}

	private static void f2() {
		System.out.println("F2 Before");

		int a = 10;
		int b = 0;

		int c = a / b;

		System.out.println("Result = " + c);

		System.out.println("F2 After");

	}

}
