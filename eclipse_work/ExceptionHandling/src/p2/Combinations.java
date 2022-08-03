package p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combinations {

	public static void main(String[] args) {

		// a)
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// b)
		try {
		} catch (Exception e) {
		}

//	c) 
		try {
		} catch (ArithmeticException e) {
		} catch (Exception e) {
		}

//	d) 
		try {
		} catch (NullPointerException e) {
		} catch (Exception e) {
		} finally {
		}

		// e)
		try {
		} finally {
		}

		// f) TRY-With-Resources
		try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
		} catch (IOException e) {
			e.printStackTrace();
		}

		// g) Multi-Exception Catch Block
		try {
		} catch (NullPointerException | ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
