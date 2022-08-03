package sorting;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		String[] fruits = { "Orange", "Grapes", "Apple", "Mango", "Banana", "Guava" };

		System.out.println("Before Sorting: " + Arrays.toString(fruits));

		// Sorting
		Arrays.sort(fruits);

		System.out.println("After Sorting: " + Arrays.toString(fruits));
	}

}
