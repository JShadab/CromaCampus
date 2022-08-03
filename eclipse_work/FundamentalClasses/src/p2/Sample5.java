package p2;

public class Sample5 {

	public static void main(String[] args) {

		StringBuilder num = new StringBuilder("0");

		for (int i = 1; i < 10000000; i++) {
			num.append(i);
		}
		System.out.println(num); // "012345678910"
	}
	
	// "012345678910"

}
