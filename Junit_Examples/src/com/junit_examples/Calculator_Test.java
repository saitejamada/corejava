package com.junit_examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator_Test {

	@Test
	void test() {
		assertEquals(Calculator.add(10, 20), 30);
		assertEquals(Calculator.sub(20, 10), 10);
		assertEquals(Calculator.mul(2, 20), 40);
		assertEquals(Calculator.div(10, 2), 5);
	}

}
