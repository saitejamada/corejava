package com.assignments13jan;

import java.util.ArrayList;
import java.util.Scanner;

class Platform extends Thread
{
	public void run()
	{
		try {
			getPlatform();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	synchronized void getPlatform() throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+"Arrived to platform ");
		System.out.println(Thread.currentThread().getName()+"Waiting For Passengers To Board ");
		Thread.sleep(5000);
		System.out.println("Boarding Completed Waiting For Clearance");
		System.out.println(Thread.currentThread().getName()+"Leaving to platform ");
	}
}
class Passenger
{                       
	String name;
	String address;
	int mobileno;
	
	
	public Passenger(String name, String address, int mobileno) {
		super();
		this.name = name;
		this.address = address;
		this.mobileno = mobileno;
		
	}
	@Override
	public String toString() {
		return "Passenger name =" + name + ", \n address is =" + address + ", \n mobileno=" + mobileno +" ";
	}	
}
abstract class Bus
{
	 int id;
	 String depature;
	 String destination;
	 String route;
	
	 public Bus(int id, String depature, String destination, String route) {
		super();
		this.id = id;
		this.depature = depature;
		this.destination = destination;
		this.route = route;
	} 
}
class PandurangaBus extends Bus
{
public PandurangaBus(int id, String depature, String destination, String route) {
		super(id, depature, destination, route);
		// TODO Auto-generated constructor stub
	}

@Override
public String toString() {
	return "Bus Name : Panduranga Travels  bus id is  =" + id + ", depature at =" + depature + ",  destination=" + destination + ",  route via =" + route
			+ " ";
}	
}

class OrangeBus extends Bus
{

	public OrangeBus(int id, String depature, String destination, String route) {
		super(id, depature, destination, route);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bus Name : OrangeTravels  bus id is  =" + id + ", depature at =" + depature + ",  destination=" + destination + ",  route via =" + route
				+ " ";
	}
}


public class Ticket_Booking_System {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Bus bus[]=new Bus[5];
		bus[0]=new PandurangaBus(112,"hyd","goa","via nzb");
		bus[1]=new PandurangaBus(113,"goa","mumbai","via hyd");
		bus[2]=new PandurangaBus(114,"delhi","goa","via punjab");
		bus[3]=new OrangeBus(1,"Hyd","goa","nzb");
		bus[4]=new OrangeBus(2,"goa","hyd","nzb");
		
		for(int i=0;i<bus.length;i++)
		{
			System.out.println(" Select "+i+" For "+bus[i]);
		}
		
		System.out.println("Enter The Choice ");
		int ch=sc.nextInt();
		
		System.out.println("Enter The No Of Passengers");
		int n=sc.nextInt();
		ArrayList a=new ArrayList();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter address");
			String add=sc.next();
			System.out.println("Enter The Mobile");
			int mob=sc.nextInt();
			a.add(new Passenger(name,add,mob));
		}
		System.out.println("*******************************");
		System.out.println(" Bus details "+bus[ch]);
		System.out.println("********************************");
		System.out.println("Passenger Details ");
		System.out.println(" "+a);
		
		System.out.println(" Waiting For Bus");
		Platform p=new Platform();
		p.setName("Panduranga");
		Platform p1=new Platform();
		p1.setName("Orange");
		p.start();
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.start();
		
	}
}
