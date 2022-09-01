package com.junit_examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assertion_Test_Cases {

	@Test
	void test() {
		assertArrayEquals(Assertion_All_Methods.array1(), Assertion_All_Methods.array2());
	}

	@Test
	void positiveNumberTest()
	{
		assertFalse(Assertion_All_Methods.ispositive()>0);
	}
	
} 
