package com.MethodOverrididng.Car;

public class Book 
{
  String bookname,authour,publisher;
 int isbn;
 
 
 public Book(String bookname, String authour, String publisher, int isbn)
 {
	super();
	this.bookname = bookname;
	this.authour = authour;
	this.publisher = publisher;
	this.isbn = isbn;
 }


public String getBookname() {
	return bookname;
}


public void setBookname(String bookname) {
	this.bookname = bookname;
}


public String getAuthour() {
	return authour;
}


public void setAuthour(String authour) {
	this.authour = authour;
}


public String getPublisher() {
	return publisher;
}


public void setPublisher(String publisher) {
	this.publisher = publisher;
}


public int getIsbn() {
	return isbn;
}


public void setIsbn(int isbn) {
	this.isbn = isbn;
}
 
 String getBookInfo()
 {
	 return "Book Name is : "+bookname+"Authour is : "+authour+"Publisher is : "+publisher+"ISBN Number Is : "+isbn;
 }
 
}

class BookTest extends Book
{
	 String bookname,authour,publisher;
	 int isbn;
	
	 
	 public BookTest(String bookname, String authour, String publisher, int isbn) 
	{
		super(bookname, authour, publisher, isbn);
		this.bookname = bookname;
		this.authour = authour;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	 
	 public static void main(String[] args) 
	 {
		// int a[]=new int[5];
		 
		 BookTest b=new BookTest("GAME OF THRONES","George RR Matrin","Fantacy Publichers",11111);
		 b.getBookInfo();
		 
		 BookTest b1=new BookTest("HarryPotter","J.K Rowling","Aspara Publichers",110121);
		 b1.getBookInfo();
		 
		 BookTest b2=new BookTest("The Secret","Rhonda Byrne","PaperCut Publichers",11221);
		 b2.getBookInfo();
		 
		 BookTest b3=new BookTest("Core Java","R Nageshwar Rao","Elite Publichers",1425);
		 b3.getBookInfo();
		 
		 BookTest b4=new BookTest("Head First java","Kathy Sieera","Shrada Publichers",9221);
		 b4.getBookInfo();
	}
	 
	 
	 
	 

	 
	 
	
}
