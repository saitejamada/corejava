package com.junit_examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class String_ex_test {

	String_ex str;
	@Test
	void test() {
		assertEquals(String_ex.con("sai", "Teja"),"saiTeja");
		assertEquals(str.pass("asdasd12"), 8);
	}
	
	@BeforeEach
	 void in()
	{
		 str=new String_ex();
		 System.out.println("object allocated");
	}
	
	@Test
	void evenTest()
	{
		int r=str.even(5);
		assertTrue(r==0);
	}
	
	@Test
	void primeTest()
	{
		int r=str.prime(7);
		assertTrue(r==1);
	}
	
	@Test
	void armstrongTest()
	{
		int r=str.armstrong(153);
		assertTrue(r==153);
	}
	
}
