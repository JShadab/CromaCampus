package p1;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("Main Before");
		f1();
		System.out.println("Main After");
	}

	private static void f1() {
		System.out.println("F1 Before");
		f2();
		System.out.println("F1 Aafter");

	}

	private static void f2() {
		System.out.println("F2 Before");

		int a = 10;
		int b = 3;

		try {
			System.out.println("TRY BLOCK");
			int c = a / b;
			System.out.println("Result = " + c);
		} catch (Exception e) {
			System.out.println("CATCH BLOCK");
		} finally {
			System.out.println("FINALLY BLOCK");
		}

		System.out.println("F2 Aafter");

	}

}
