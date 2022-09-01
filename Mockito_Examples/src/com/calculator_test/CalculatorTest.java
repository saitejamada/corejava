package com.calculator_test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.mokito_examples.Calculator;
import com.mokito_examples.CalculatorService;

class CalculatorTest {

	Calculator c;
	CalculatorService service=Mockito.mock(CalculatorService.class);
	
	@BeforeEach
	void setup() throws Exception
	{
		c=new Calculator(service);
	}
	@Test
	void testAdd()
	{
		when(service.add(20, 5)).thenReturn(30);
		assertTrue(service.add(20, 5)==30);
	}
	@Test
	void testSub()
	{
		when(service.sub(20, 5)).thenReturn(15);
		assertTrue(service.sub(20, 5)==15);
	}
	@Test
	void testMul()
	{
		when(service.mul(20, 5)).thenReturn(100);
		assertTrue(service.mul(20, 5)==100);
	}
	@Test
	void testDiv()
	{
		when(service.div(20, 5)).thenReturn(4);
		assertTrue(service.div(20, 5)==4);
	}

}
