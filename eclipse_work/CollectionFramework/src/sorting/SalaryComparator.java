package sorting;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		double sal1 = e1.getSalary();
		double sal2 = e2.getSalary();

		if (sal1 > sal2) {
			return 1;
		} else if (sal1 < sal2) {
			return -1;
		} else {
			return 0;
		}

	}

}
