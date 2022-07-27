package test;

import p2.B; // FullyQualifiedTypeNameImport

import p3.*; // FullyQualifiedPackageImport means all public classes from this package

import static p4.E.MAX;

public class Test {

	public static void main(String[] args) {
		p1.A objA = new p1.A(); // fullyQualifiedTypeName

		B objB = new B();

		C objC = new C();
		D objD = new D();
		
		System.out.println(MAX);
	}

}
