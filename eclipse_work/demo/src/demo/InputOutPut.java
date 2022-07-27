package demo;

import java.util.Scanner;

public class InputOutPut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name: ");
		String name = sc.next();

		System.out.println("Enter your Age: ");
		int age = sc.nextInt();

		System.out.println("Enter your Salary: ");
		double salary = sc.nextDouble();

		System.out.println("Hello " + name + " your age is " + age + " and salary is " + salary);

		sc.close();
	}

}
