package p1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {

		Set fruits = new HashSet();

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Banana");
		fruits.add("Mango");

		Set vegies = new HashSet();

		vegies.add("Brokali");
		vegies.add("Redish");
		vegies.add("Carot");
		vegies.add("Guava");
		vegies.add("Potato");

		/**
		 * 
		 * // Add all vegies into the fruits UNION
		 * 
		 * fruits.addAll(vegies); System.out.println(fruits); // [Brokali, Guava,
		 * Potato, Apple, Carot, Redish, Mango, Orange, Banana]
		 * 
		 */

		/**
		 * 
		// Remove all vegies from the fruits MINUS

		fruits.removeAll(vegies);
		System.out.println(fruits); // [Apple, Mango, Orange, Banana]
		
		*/
		
		// Retain all vegies from the fruits INTERSECTION

		fruits.retainAll(vegies);
		System.out.println(fruits); // [Guava]

	}

}
