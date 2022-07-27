package demo;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int i = 10;

		// int j = ++i; // pre-increment
		int j = i++; // post-increment

		System.out.println(i); // 11 
		System.out.println(j); // 10
		
		int x = ++5;
	}

}
