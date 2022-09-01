package com.employee_management;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@TestInstance(Lifecycle.PER_CLASS)
class Employee_Test {

	@Mock
	Employee e;
	Registration r;
	Login l;
	
	@BeforeAll
	void setUpBeforeClass() throws Exception {
		MockitoAnnotations.initMocks(this);
		r=new Registration();
		l=new Login();
	}

	@Test
	@DisplayName("Testing registration null")
	void test1()
	{
		assertNull(r);
	}
	@Test
	@DisplayName("Testing login null")
	void test2()
	{
		assertNull(l);
	}
	@Test
	@DisplayName("Testing registration and login ")
	void test3()
	{
		assertSame(l, r);
	}
	@Test
	@DisplayName("Testing registration and employee ")
	void test4()
	{
		assertSame(l, e);
	}
	@Test
	@DisplayName("Testing Name")
	void test() {
		when(r.getName()).thenReturn("sai");
		assertEquals("sai",r.getName());
	}
	@Test
	@DisplayName("Testing Address")
	void test5()
	{
		when(r.getAddress()).thenReturn("hyderabad");
		assertEquals("hyderabad", r.getAddress());
	}
	@Test
	@DisplayName("Testing Mobile No Length")
	void test6()
	{
		when(r.getMobile()).thenReturn(849999999);
		assertTrue(r.getMobile()==849999999);
	}
//	@Test
//	@DisplayName("Testing mailid is null")
//	void test7()
//	{
//		when(r.getMailid()).thenReturn(null);
//		assertNull(r.getMailid());
//	}
//	@Test
//	@DisplayName("Testing mail id length")
//	void test8()
//	{
//		when(r.getMailid()).thenReturn("abc@gmail.com");
//		assertTrue(r.getMailid().length()>0);
//	}
//	
	@Test
	@DisplayName("Testing deptid")
	void test9()
	{
		when(e.getDeptid()).thenReturn(10);
		assertTrue(e.getDeptid()>0);
	}
	@Test
	@DisplayName("Testing empid")
	void test10()
	{
		when(e.getEmpid()).thenReturn(1001);
		assertTrue(e.getEmpid()>0);
	}
	@Test
	@DisplayName("Testing empid")
	void test12()
	{
		when(e.getEmpid()).thenReturn(1001);
		assertTrue(e.getEmpid()>0);
	}
	
	@Test
	@DisplayName("Testing ")
	void test11()
	{
		when(e.getEmpid()).thenReturn(1001);
		assertTrue(e.getEmpid()>0);
	}
	
	@Test
	@DisplayName("Testing verify on empid")
	void test13()
	{
		when(e.getEmpid()).thenReturn(1002);
		assertEquals(1002,e.getEmpid());
	}
	
	@Test
	@DisplayName("testing the times")
	void test14()
	{
		when(e.getDeptid()).thenReturn(10);
		assertTrue(e.getDeptid()==10);
		verify(e,times(1)).getDeptid();
	}
	
	@Test
	@DisplayName("testing the 2 times")
	void test15()
	{
		when(e.getDeptid()).thenReturn(10);
		assertTrue(e.getDeptid()==10);
		verify(e,times(2)).getDeptid();
	}
	
	@Test
	@DisplayName("testing the atleast Once")
	void test16()
	{
		when(e.getDeptid()).thenReturn(10);
		assertTrue(e.getDeptid()==10);
		verify(e,atLeastOnce()).getDeptid();
	}
	@Test
	@DisplayName("testing the atmost")
	void test17()
	{
		when(e.getDeptid()).thenReturn(10);
		assertTrue(e.getDeptid()==10);
		verify(e,atMost(1)).getDeptid();
	}
	@AfterAll
	void destroy()
	{
		r=null;
		l=null;
		e=null;
	}

}
