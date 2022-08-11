package com.croma;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

static	private Calculator calculator;

	@BeforeAll
	static public void setUp() {
		System.out.println("setUp() called");
		calculator = new Calculator();
	}

	@Test
	public void test_TwoPositiveNums() {

		int actual = calculator.sum(5, 10);

		int expected = 15;

		assertTrue(actual == expected);

	}

	@Test
	public void test_TwoNegativeNums() {

		int actual = calculator.sum(-5, -10);

		int expected = -25;

		assertTrue(actual == expected);

	}

	@Test
	public void test_OneNegativeAndOnePositiveNums() {

		int actual = calculator.sum(5, -10);

		int expected = -5;

		assertTrue(actual == expected);

	}

}
