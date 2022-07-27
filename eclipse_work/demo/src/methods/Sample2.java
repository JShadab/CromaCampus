package methods;

public class Sample2 {

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	void sum(float a, float b) {
		System.out.println(a + b);
	}
	
	

	public static void main(String[] args) {

		Sample2 obj = new Sample2();
		
		obj.sum(8, 3);
		obj.sum(5, 6, 7);

	}
}
