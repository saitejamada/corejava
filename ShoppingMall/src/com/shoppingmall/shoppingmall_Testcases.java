
package com.shoppingmall;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.*;
import org.mockito.Mockito;

@TestInstance(Lifecycle.PER_CLASS)
class shoppingmall_Testcases {

	Store s=Mockito.mock(Store.class);
	Constumer c;
	ShoppingMall_ sm;
	
	
	@BeforeAll
	void init()
	{
		c=new Constumer("saiteja","nzb","797878979");
		
	}
	
	@Test
	void testStore()
	{
		when(s.bill(1)).thenReturn(150);
		assertEquals(150,s.bill(anyInt()));
		verify(s).bill(1);
	}
	
	@Test
	void testNullOfShoppingmall()
	{
		assertNotNull(c);
	}
	@Test
	void testNullOfStore()
	{
		assertNotNull(s);
	}
	@Test
	void testtimes()
	{
		verify(s,times(1)).bill(anyInt());
	}
	
	@Test
	void testNever()
	{
		verify(s,never()).bill(anyInt());
	}
	
	@Test
	void testatLeastOnce()
	{
		verify(s,atLeastOnce()).bill(anyInt());
	}
	
	@Test
	@DisplayName("verifying products")
	void verifyProduct()
	{
		when(s.product()).thenReturn("bag");
		assertEquals("bag", s.product());
		verify(s).product();
	}
	
	@Test
	@DisplayName("verify times for products")
	void testTimesProducts()
	{
		//when(s.product()).thenReturn("Shirt");
		//assertEquals("Shirt",s.product());
		verify(s,times(1));
	}
	
	@Test
	@DisplayName("Verify AtLeast For Products")
	void testatLeastProdudct()
	{
		when(s.product()).thenReturn("tshirt");
		assertEquals("tshirt",s.product());
		verify(s,atLeastOnce()).product();
	}
	
	@Test
	@DisplayName("verify never for products")
	void testNeverProducts()
	{
		assertEquals("tshirt",s.product());
		verify(s,never()).product();
	}
	@Test
	@DisplayName("Testing the name")
	void testname()
	{
		String s=c.getName();
		assertTrue(s.length()>0);
	}
	@Test
	void testatLeast()
	{
		assertEquals("tshirt",s.product());
		verify(s,atLeast(1)).product();
	}
	@Test
	@DisplayName("do when on bill")
	void test()
	{
		doReturn(150).when(s).bill(anyInt());
		assertEquals(150,s.bill(anyInt()));
	}
	@Test
	@DisplayName("almost on bill")
	void tesetAlmostBill()
	{
		doReturn(150).when(s).bill(anyInt());
		assertEquals(150,s.bill(anyInt()));
		assertEquals(150,s.bill(anyInt()));
		assertEquals(150,s.bill(anyInt()));
		verify(s,atMost(3));
		
	}
	@Test
	@DisplayName("do when on product")
	void test1()
	{
		//SdoReturn("short").when(s).product();
		assertTrue("short".equals(s.product()));
		
	}
	@Test
	void testLengthOfName()
	{
		assertTrue(c.getSName().length()>5);
	}
	@Test
	void testConsumerName()
	{
		assertTrue(c.getSName().equals("saiteja"));
	}
	
	@Test
	void testConsumerAddress()
	{
		assertTrue(c.getAddress().equals("nzb"));
	}
	
	@Test
	void testConsumerMobileNumber()
	{
		assertTrue(c.getMobileno().equals("6876879789"));
	}	
	@Test
	void testMobileNoLength()
	{
		assertTrue(c.getMobileno().length()>0);
	}
	@AfterAll
	void destroy()
	{
		s=null;
		c=null;
	}
	

}
