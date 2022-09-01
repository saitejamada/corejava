package com.Association.Aggregation;

class Authour
{
	int authourId;
	String authourName;
	public int getAuthourId() {
		return authourId;
	}
	public void setAuthourId(int authourId) {
		this.authourId = authourId;
	}
	public String getAuthourName() {
		return authourName;
	}
	public void setAuthourName(String authourName) {
		this.authourName = authourName;
	}
	public Authour(int authourId, String authourName) {
		super();
		this.authourId = authourId;
		this.authourName = authourName;
	}
	@Override
	public String toString() {
		return "Authour [authourId=" + authourId + ", authourName=" + authourName + "]";
	}

}
class Book
{
	int bookId,price;
	String bookName;
	Authour authourdetails;
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public int getPrice() {
		return price;
	}

public void setPrice(int price) {
		this.price = price;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Authour getAuthourdetails() {
		return authourdetails;
	}

	public void setAuthourdetails(Authour authourdetails) {
		this.authourdetails = authourdetails;
	}
	
	public Book(int bookId, int price, String bookName, Authour authourdetails) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.bookName = bookName;
		this.authourdetails = authourdetails;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", price=" + price + ", bookName=" + bookName + ", authourdetails="
				+ authourdetails + "]";
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Authour a=new Authour(98,"GeorgeRRMartin");
		
		Book b=new Book(112,250,"GameOfThrones",a);
		//System.out.println("HexaDecimal"+b);
		//System.out.println("decimal"+b.hashCode());//implicit call to toString() Method
		
		System.out.println("To String IS="+b.toString());
	}
}


