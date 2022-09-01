package com.seatBooking;

import java.util.List;

class Ticket
{
	Registration registration;
	Journey journey;
	Plane plane;
	List list;
	int no_of_passengers;
	
	public Ticket(Registration registration, Journey journey,Plane plane,int no_of_passengers,List list)
	{
		super();
		this.registration = registration;
		this.journey = journey;
		this.plane=plane;
		this.no_of_passengers=no_of_passengers;
		this.list=list;
	}
	
	public void printDetails() 
	{
		// TODO Auto-generated method stub
		System.out.println("---------Ticket------------");
		System.out.println("From : "+ plane.getDepature());
		System.out.println("To   : "+ plane.getDestination());
		System.out.println(" Date "+journey.date+" Month Is "+journey.month);
		System.out.println(" Carrier Name "+plane.getName());
		System.out.println("Plane Model "+plane.getModel());
		System.out.println(" Ticket Price including gst "+(plane.getFair()+1000));
		System.out.println(" Number Of Passengers "+no_of_passengers);
		System.out.println("Passengers details "+list);
		System.out.println("Total Amount Payable == "+((plane.getFair()+1000)*no_of_passengers));
	}
	
}
