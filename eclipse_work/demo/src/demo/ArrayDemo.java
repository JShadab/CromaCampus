package demo;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("==================================");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("==================================");
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
