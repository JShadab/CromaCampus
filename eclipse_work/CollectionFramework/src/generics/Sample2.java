package generics;

import java.util.ArrayList;
import java.util.List;

import sorting.Employee;

public class Sample2 {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Ryan");
		names.add("John");
		names.add(101);
		names.add(new Employee(null, 0, 0));
		names.add(false);
	}
}
