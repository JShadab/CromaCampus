package p2;

public class Sample4 {

	public static void main(String[] args) {

		String num = "0";

		for (int i = 1; i < 11; i++) {
			num += i;
		}
		System.out.println(num); // "012345678910"
	}
	// "0"
	// "01"
	// "012"
	// "0123"
	// "01234"
	// "012345"
	// "0123456"
	// "01234567"
	// "012345678"
	// "0123456789"
	// "012345678910"

}
