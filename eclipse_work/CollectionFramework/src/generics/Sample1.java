package generics;

import sorting.Employee;

public class Sample1 {
	public static void main(String[] args) {

		String[] names= new String[5];
		names[0]= "Ryan";
		names[1]= "John";
		names[2]= 101;
		names[3]= new Employee(null, 0, 0);
		names[4]= false;
	}
}
