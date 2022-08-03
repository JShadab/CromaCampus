package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {

		Set fruits = new HashSet();

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Banana");
		fruits.add("Mango");

		System.out.println(fruits);

		System.out.println("----------------------------");

		System.out.println("Way #1 by using toArray(): NOT RECOMMENDED");
		Object[] arr = fruits.toArray();

		for (int i = 0; i < arr.length; i++) {
			Object element = arr[i];
			System.out.println(element);
		}
		System.out.println("----------------------------");

		System.out.println("Way #2 by using forEach loop");

		for (Object element : fruits) {
			System.out.println(element);
		}
		System.out.println("----------------------------");
		System.out.println("Way #3 by using iterator");

		Iterator it = fruits.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
		System.out.println("----------------------------");
		System.out.println("Way #4 by using Java ForEach()");

		fruits.stream().forEach(System.out::println);

	}

}
