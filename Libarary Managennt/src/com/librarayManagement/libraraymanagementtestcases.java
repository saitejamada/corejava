package com.librarayManagement;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.*;
import org.mockito.*;

@TestInstance(Lifecycle.PER_CLASS)
class libraraymanagementtestcases {

	Books b;
	Books b1;
	
	@Mock
	Librarymember lm;
	
	@BeforeAll
	 void setUpBeforeClass() throws Exception {
		b=new Books("GameOfThrones",112,250,"george rr matin","version 1");
		b1=new Books("HarryPotter",123,450,"jkrowling","chamber of sectrets");
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testName() {
		
		assertTrue(b.getBname().length()>0);
	}
	@Test
	void testId()
	{
		assertTrue(b.getBid()==112);
	}
	@Test
	void testPrice()
	{
		assertTrue(b.getBookprice()<500);
	}
	
	@Test
	void testAuthour()
	{
		assertTrue(b.getAuthour()!=null);
	}
	@Test
	void testBookversion()
	{
		assertTrue(b.getBookedition()!=null);
	}
	@Test
	void testBook2Name() {
		
		assertTrue(b1.getBname().length()>0);
	}
	@Test
	void testSame()
	{
		assertSame(b1, b);
	}
	@Test
	void testNotSame()
	{
		assertNotSame(b1,b);
	}
	@Test
	void testBook2Id()
	{
		assertTrue(b1.getBid()==123);
	}
	@Test
	void testBook2Price()
	{
		assertTrue(b1.getBookprice()<500);
	}
	
	@Test
	void testBook2Authour()
	{
		assertTrue(b1.getAuthour()!=null);
	}
	@Test
	void testBook2version()
	{
		assertTrue(b1.getBookedition()!=null);
	}
	
	@Test
	@DisplayName("Testing reader")
	void test()
	{
		when(lm.bookTaken()).thenReturn(0);
		verify(lm);
	}
	
	@Test
	@DisplayName("Testing  Book Taken ")
	void test1()
	{
		when(lm.bookTaken()).thenReturn(2);
		assertTrue(2==lm.bookTaken());
		verify(lm);
	}
	
	@Test
	@DisplayName("Testing Book")
	void test2()
	{
		when(lm.Memebershipdetails()).thenReturn("saiteja");
		assertEquals("saiteja",lm.Memebershipdetails());
		
	}
	@Test
	@DisplayName("Testing Order")
	void tets3()
	{
		InOrder or=Mockito.inOrder(lm);
		when(lm.bookTaken()).thenReturn(1);
		when(lm.Memebershipdetails()).thenReturn("public library");
		assertTrue(lm.bookTaken()==1);
		assertFalse(lm.Memebershipdetails().equals("sflkn"));
		or.verify(lm).bookTaken();
		or.verify(lm).Memebershipdetails();
	}
	
	@Test
	@DisplayName("Testing atmost")
	void test4()
	{
		when(lm.Memebershipdetails()).thenReturn("library");
		assertFalse(lm.Memebershipdetails().equals("sflkn"));
		assertTrue(lm.Memebershipdetails().equals("library"));
		verify(lm,atMost(3)).Memebershipdetails();
	}
	
	@Test
	@DisplayName("Testing atleast")
	void test5()
	{
		when(lm.bookTaken()).thenReturn(1);
		verify(lm,atLeast(2)).bookTaken();
	}
	
	@Test
	@DisplayName("Testing never")
	void testNever() 
	{
		verify(lm,never()).bookTaken();
	}
	
	@Test
	@DisplayName("Testing times")
	void testTimes()
	{
		verify(lm,times(0)).Memebershipdetails();
	}
	
	@AfterAll
	void destroy()
	{
		b=null;
		b1=null;
		lm=null;
	}
    
}
