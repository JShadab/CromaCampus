package p3;

public class Sample2 {
	public static void main(String[] args) {

		int x = 10;

		String s1 = String.valueOf(x);

		System.out.println(s1);

		System.out.println("---------------------");

		String s2 = "101";

		int y = Integer.parseInt(s2);
		System.out.println(y);
		
		float z = Float.parseFloat(s2);
		System.out.println(z);
		
		char s3 = "a";
		float a = Float.parseFloat(s3);
		System.out.println(a);
	}

}
