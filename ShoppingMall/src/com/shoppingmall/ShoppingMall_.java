package com.shoppingmall;
import java.util.*;

class Constumer extends Thread
{
	String sname,address,mobileno;
	
	public Constumer(String sname, String address, String mobileno) {
		super();
		this.sname = sname;
		this.address = address;
		this.mobileno = mobileno;
	}

	public String getSName() {
		return sname;
	}

	public void setSName(String name) {
		this.sname = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public void run()
	{
		getDetails();
	}

	 private void getDetails() {
		// TODO Auto-generated method stub
		 synchronized(this)
		 {
			 	Scanner sc=new Scanner(System.in);
			 	System.out.println(Thread.currentThread().getName());
				System.out.println("Please Enter Name");
				sname=sc.next();
				System.out.println("Please Enter Address");
				address=sc.next();
				System.out.println("Please Enter mobile Number");
				mobileno=sc.next();
		 }
		
	}

	@Override
	public String toString() {
		return "Constumer Deatils \n Name :" + sname + " \n Address is " + address + " \n Mobile Number Is " + mobileno + "";
	}
	
}

abstract class Store
{
	abstract String product();
	abstract int bill(int c);
}

class Levis extends Store
{
	ArrayList a=new ArrayList();
	ArrayList a1=new ArrayList();
	Constumer con;
	public Levis(Constumer con) {
		super();
		this.con= con;
	}

	Scanner sc=new Scanner(System.in);
	int op;
	
	@Override
	String product() {
		// TODO Auto-generated method stub
		a.add("Denium Shirt Black Colour Size L");a.add("Cotton Shirt Black Colour Size L");a.add("Trouser Black Colour Size 32");a.add("Jeanes Black Colour Size 34");
		a1.add("2220");a1.add("1220");a1.add("3220");a1.add("4220");
		System.out.println("Select From Below");
		for(int i=0;i<a.size();i++)
		{
			System.out.println("Select "+i+" For Product  "+a.get(i)+" Price is "+a1.get(i));
		}
		System.out.println("Enter Option");
		op=sc.nextInt();
		bill(op);
		return null;
	}

	@Override
	int bill(int c) {
		// TODO Auto-generated method stub		
		System.out.println(" "+con.toString());
		System.out.println("Product Name is "+a.get(c)+" \n Price is "+a1.get(c));
		return c;
	}
}

class Dmart extends Store
{
	ArrayList a=new ArrayList();
	ArrayList a1=new ArrayList();
	Scanner sc=new Scanner(System.in);
	Constumer con;
	public Dmart(Constumer con) {
		super();
		this.con = con;
	}

	int op;
	
	@Override
	String product() {
		// TODO Auto-generated method stub
		a.add("Washing Liquid");a.add("Detergent");a.add("Oil");a.add("Rice bag");
		a1.add("220");a1.add("220");a1.add("920");a1.add("1500");
		
		System.out.println("Select From Below");
		for(int i=0;i<a.size();i++)
		{
			System.out.println("Select "+i+" For Product  "+a.get(i)+" Price is "+a1.get(i));
		}
		
		System.out.println("Enter Option");
		op=sc.nextInt();
		bill(op);
		return null;
	}

	@Override
	int bill(int c) {
		// TODO Auto-generated method stub
		System.out.println(" "+con.toString());
		System.out.println("Product Name is "+a.get(c)+" \n Total Price is "+a1.get(c));
		return c;
	}
	
}

class Leecopper extends Store
{
	ArrayList a=new ArrayList();
	ArrayList a1=new ArrayList();
	Constumer con;
	Scanner sc=new Scanner(System.in);
	int op;
	public Leecopper(Constumer con) {
		super();
		this.con = con;
	}
	
	@Override
	String product() {
		// TODO Auto-generated method stub
		a.add("Brown Shoes");a.add("Black Shoes");a.add("Fliplops");a.add("Slippers");
		a1.add("2500");a1.add("2220");a1.add("1020");a1.add("1220");
		
		System.out.println("Select From Below");
		for(int i=0;i<a.size();i++)
		{
			System.out.println("Select "+i+" For Product  "+a.get(i)+" Price is "+a1.get(i));
		}
		
		System.out.println("Enter Option");
		op=sc.nextInt();
		bill(op);
		return null;
	}

	@Override
	int bill(int c) {
		// TODO Auto-generated method stub
		System.out.println(" "+con.toString());
		System.out.println("Product Name is "+a.get(c)+" \n Price is "+a1.get(c));
		return c;
	}	
}
class Parking extends Thread
{
	public void run()
	{
		getpraking();
	}

	synchronized private void getpraking() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Getting Into Parking Bay");
		System.out.println("Vechile Parked");
	}
}
public class ShoppingMall_ {

	public static void main(String[] args) {
		
		Store s;
		Scanner sc=new Scanner(System.in);		
		Parking p=new Parking();
		Parking p1=new Parking();
		p.setName("Xuv car");
		p1.setName("Sedan Class");
		p.start();
		p1.start();
	
		Constumer c=new Constumer(null,null,null);
		c.setName("Person 1");
		c.start();
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Following Are Stores In Mall ");
		System.out.println("Select  1.Levis 2.Dmart 3.Leecopper");
		int op=sc.nextInt();
		
		if(op==1)
		{
			s=new Levis(c);
			s.product();
		}
		else if(op==2)
		{
			s=new Dmart(c);
			s.product();
		}
		else if(op==3)
		{
			s=new Leecopper(c);
			s.product();
		}
		else
		{
			System.err.println("In Valid Option Selected");
			
		}
		
	}
}
