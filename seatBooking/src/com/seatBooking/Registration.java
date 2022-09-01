package com.seatBooking;

import java.util.Scanner;

class Registration 
{
	String name;
	int mobileno;
	String address;
	Scanner sc=new Scanner(System.in);

	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Mobile No");
		mobileno=sc.nextInt();
		System.out.println("Enter The Address");
		address=sc.next();
	}

	public String getcName() {
		return name;
	}

	public void setcName(String name) {
		this.name = name;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Registration [name=" + name + ", mobileno=" + mobileno + ", address=" + address + ", sc=" + sc + "]";
	}
	
}