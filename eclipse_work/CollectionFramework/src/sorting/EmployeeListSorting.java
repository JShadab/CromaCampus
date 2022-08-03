package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeListSorting {

	public static void main(String[] args) {

		Employee e1 = new Employee("Suresh", 25, 1234);
		Employee e2 = new Employee("Ramesh", 27, 6754);
		Employee e3 = new Employee("Paresh", 22, 2436);

		List<Employee> employees = Arrays.asList(e1, e2, e3);

		System.out.println("Before Sorting: " + employees);

		// Sorting On the basis of salary
		System.out.println("Sorting On the basis of salary");
		Collections.sort(employees); // default way
		System.out.println("After Sorting: " + employees);

		System.out.println("----------------------------");

		// Sorting On the basis of salary
		System.out.println("Sorting On the basis of name");
		Collections.sort(employees, new NameComparator());
		System.out.println("After Sorting: " + employees);

		System.out.println("----------------------------");
		// Sorting On the basis of salary
		System.out.println("Sorting On the basis of age");
		Collections.sort(employees, new AgeComparator());
		System.out.println("After Sorting: " + employees);
	}

}
