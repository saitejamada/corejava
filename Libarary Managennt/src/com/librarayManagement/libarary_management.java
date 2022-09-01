package com.librarayManagement;

class Books
{
	String bname;
	int bid;
	int bookprice;
	String authour;
	String bookedition;
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public String getBookedition() {
		return bookedition;
	}
	public void setBookedition(String bookedition) {
		this.bookedition = bookedition;
	}
	public Books(String bname, int bid, int bookprice, String authour, String bookedition) {
		super();
		this.bname = bname;
		this.bid = bid;
		this.bookprice = bookprice;
		this.authour = authour;
		this.bookedition = bookedition;
	}
	
}
interface Librarymember
{
	 String Memebershipdetails();
	 int bookTaken();
	 
}
public class libarary_management {

	public static void main(String[] args) {
		
		
	}
}
