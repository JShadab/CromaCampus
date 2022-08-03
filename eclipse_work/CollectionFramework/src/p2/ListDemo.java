package p2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List fruits = new ArrayList();

		System.out.println("Size: " + fruits.size()); // 0
		System.out.println("isEmpty: " + fruits.isEmpty()); // true

		System.out.println("----------------------");

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Banana");

		System.out.println("Size: " + fruits.size()); // 6
		System.out.println("isEmpty: " + fruits.isEmpty()); // false

		System.out.println(fruits);

		System.out.println("----------------------");

		System.out.println("Contains: " + fruits.contains("Guava")); // true
		System.out.println("Contains: " + fruits.contains("Pineapple")); // false

		System.out.println("----------------------");

		System.out.println("remove: " + fruits.remove("Guava"));
		System.out.println(fruits);

		System.out.println("remove: " + fruits.remove("Pineapple"));
		System.out.println(fruits);

		System.out.println("----------------------");

		fruits.clear();
		System.out.println("Size: " + fruits.size()); // 0
		System.out.println("isEmpty: " + fruits.isEmpty()); // true

		System.out.println(fruits);//[]

	}

}
