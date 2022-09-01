package com.employee_test_cases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.employee.manager.Manager;
import com.employee.marketingexecutive.MarketingExecutive;

@TestInstance(Lifecycle.PER_CLASS)
class Employee_TestCases {

	Manager m;
	MarketingExecutive e;
	
	@BeforeAll
	void init()
	{
		m=new Manager(112,"sai",25000);
		e= new MarketingExecutive(113,"teja",30000);
	}
	@Test
	void testSal() {
		int msal=m.getBsal();
		int mesal=e.getBsal();
		assertEquals(msal, mesal);
	}
	@Test
	void testComm() {
		m.calculateComm();
		e.calculateComm();
		double mcom=m.getComm();
		double mecom=e.getComm();
		assertEquals(mcom, mecom);
	}
	@Test
	void testTa()
	{
		m.calculateTa();
		e.calculateTa();
		double mta=m.getTa();
		double meta=e.getTa();
		assertTrue(mta==meta);
	}
	
	@Test
	void testGross()
	{
		m.calculategrosssalary();
		e.calculategrosssalary();
		double mgs=m.getGrosssal();
		double megs=e.getGrosssal();
		assertTrue(mgs==megs);
	}
	@Test
	void testEid()
	{
		assertTrue(e.getEid()==m.getEid());
	}
	@Test
	void testMa()
	{
		assertTrue(m.getMa()==200);
	}
	@Test
	void testName()
	{
		assertTrue(m.getEname().equals(e.getEname()));
	}
	@Test
	void testNetSal()
	{
		e.calculateNetsal();
		m.calculateNetsal();
		assertEquals(e.getNetsal(),m.getNetsal());
	}
	@Test
	void testIncentive()
	{
		m.calculateIncentive();
		assertTrue(m.getIncentive()==500);
	}
//	@ParameterizedTest
//	@MethodSource("calculategrosssalary")
//	void test()
//	{
//		e.calculategrosssalary();
//		double esal=e.getGrosssal();
//		System.out.println(esal);
//	}
	
	@AfterAll
	void clos()
	{
		m=null;
		e=null;
	}
}
