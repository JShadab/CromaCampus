package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Orange", "Grapes", "Apple", "Mango", "Banana", "Guava");

		System.out.println("Before Sorting: " + fruits);

		// Sorting
		Collections.sort(fruits);

		System.out.println("After Sorting: " + fruits);
	}

}
