package com.Book;

import java.util.Scanner;

class Book 
{
  String bookname,authour,publisher;
 int isbn;
 
 
 public Book(String bookname, String authour, String publisher, int isbn)
 {
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
	 return "Book Name is : "+getBookname()+" , Authour is : "+getAuthour()+" , Publisher is : "+getPublisher()+" , ISBN Number Is : "+getIsbn();
 }
 
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 
	 String name,authour,publisher;
	 int bsin;
	 Book b[]=new Book[5];
	
	 for(int i=0;i<5;i++)
	{
		System.out.println("Enter The Book Name");
		name=sc.next();
		System.out.println("Enter The Authour");
		authour=sc.next();
		System.out.println("Enter The Publisher");
		publisher=sc.next();
		System.out.println("Enter The bsin");
		bsin=sc.nextInt();
		b[i]=new Book(name,authour,publisher,bsin);
	}
	 
	 
	for(int j=0;j<5;j++)
	{
		System.out.println("Book Details Are = "+b[j].getBookInfo());
		System.out.println();
	}
	
	
	
	
	/*b[0]=new Book("GAME OF THRONES","George RR Matrin","Fantacy Publichers",11111);
	b[1]=new Book("HarryPotter","J.K Rowling","Aspara Publichers",110121);
	b[2]=new Book("The Secret","Rhonda Byrne","PaperCut Publichers",11221);
	b[3]=new Book("Core Java","R Nageshwar Rao","Elite Publichers",1425);
	b[4]=new Book("Head First java","Kathy Sieera","Shrada Publichers",9221);*/
	
	
	
}
 
}

