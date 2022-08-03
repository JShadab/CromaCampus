package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {

	public static void main(String[] args) {

		List fruits = new ArrayList();

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

		//Forward 
		Iterator it = fruits.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
		System.out.println("----------------------------");
		System.out.println("Way #4 by using index for loop");

		for (int i = 0; i < fruits.size(); i++) {
			Object element = fruits.get(i);
			System.out.println(element);
		}

		System.out.println("----------------------------");
		System.out.println("Way #5 by using List Iterator");

		// Forward as well as Backward
		ListIterator lit = fruits.listIterator();

		while (lit.hasNext()) {
			Object element = lit.next();
			System.out.println(element);
		}
		System.out.println("----------------------------");
		
		while (lit.hasPrevious()) {
			Object element = lit.previous();
			System.out.println(element);
		}
		System.out.println("----------------------------");
		System.out.println("Way #4 by using Java ForEach()");

		fruits.stream().forEach(System.out::println);
	}

}
