package com.junit_examples;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Employee_junitTest {

	
	Employee_junit e;
	
	@Test
	void Nulltest() {
		assertNull(e);
		//assertNotNull(e);
	}
	
	@Test
	void SameTest()
	{
		e=new Employee_junit(121,"teja");
		Employee_junit e1=new Employee_junit(113,"tj");
		//assertSame(e, e1);
		assertNotSame(e, e1);
	}
}
