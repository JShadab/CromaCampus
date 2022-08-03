package p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		f1();
	}

	private static void f1() throws IOException	{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter your name");
		
		String name = br.readLine(); // 0.000000001% 

	}

}
