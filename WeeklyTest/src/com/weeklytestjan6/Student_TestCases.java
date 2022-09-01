package com.weeklytestjan6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class Student_TestCases {

	Student_Management sm;
	Student_Management sm1;
	
	@BeforeAll
	void initail()
	{
		sm=new Student_Management(112,"Sai","mca",849999999,2);
		sm1=new Student_Management(113,"Teja","cse",966576079,1);
	}
	
	@Test
	@DisplayName("testing name")
	void test()
	{
		assertNotEquals(sm.getName(), sm1.getName());
		
	}
	@Test
	@DisplayName("testing Id")
	void testId()
	{
		assertNotEquals(sm.getId(), sm1.getId());
	}
	
	@Test
	@DisplayName("testing Course")
	void testCourse()
	{
		assertNotEquals(sm.getCourse(), sm1.getCourse());
	}
	
	@Test
	@DisplayName("testing  Student 1 Year")
	void testStudent1Year()
	{
		assertTrue(sm.getYear()==2);
	}
	
	@Test
	@DisplayName("testing Student 2 Year")
	void testStudent2Year()
	{
		assertTrue(sm1.getYear()==1);
	}

	@Test
	@DisplayName("testing Student Mobile no")
	void testStudentMobileno()
	{
		assertTrue(sm.getMobileno()==849999999);
	}
	
	@Test
	@DisplayName("testing Student 2 Mobile no")
	void testStudent2Mobileno()
	{
		assertTrue(sm1.getMobileno()==966576079);
	}
	
	@Test
	@DisplayName("testing Student 1 course")
	void testStudentCourse()
	{
		assertFalse(sm.course=="cse");
	}
	@Test
	@DisplayName("testing Student 2 course")
	void testStudent2Course()
	{
		assertFalse(sm1.course=="mca");
	}
	@Test
	@DisplayName("testing Student 1 gretaer than Student 2 course")
	void testGreaterYear()
	{
		assertTrue(sm.year>sm1.year);
	}
	
	@AfterAll
	void destroy()
	{
		sm=null;
		sm1=null;
	}

}
