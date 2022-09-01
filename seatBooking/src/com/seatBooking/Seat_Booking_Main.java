package com.seatBooking;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Start
{
	Scanner sc=new Scanner(System.in);
	ArrayList planelist;
	List passenger_arraylist;
	Login login;
	Registration registration;
	Ticket ticket;
	Journey journey;
	Plane selected_plane;
	int no_of_passengers;
	
	private void getPassengerDetails(){
		//Fetching no of passengers and details 
		System.out.println("Enter Number Of passenegers");
		no_of_passengers=sc.nextInt();passenger_arraylist=new ArrayList();
		if(no_of_passengers>selected_plane.getSeatsavailale()){
			System.err.println("Sorry Seats Are Full ");
		}
		else{
			for(int i=0;i<no_of_passengers;i++){
				System.out.println("Enter Name ");
				String name=sc.next();
				System.out.println("Enter Age");
				int age=sc.nextInt();
				System.out.println("Enter gender");
				String gen=sc.next();
				passenger_arraylist.add(new Customer(login,registration,ticket,name,gen,age));
			}
			getTicket();
			}	
	}
	private void getTicket() {
		ticket=new Ticket(registration,journey,selected_plane,no_of_passengers,passenger_arraylist);ticket.printDetails();
	}

	private void getJourneyDetails() {
		// fetching journey details 
		System.out.println("Enter Boarding City ");
		String board=sc.next();
		System.out.println("Enter Destination");
		String des=sc.next();
		System.out.println("Enter The Date");
		int date=sc.nextInt();
		System.out.println("Enter Month ");
		int month=sc.nextInt();
		journey=new Journey(board,des,date,month);
		getPlane();
	}
	private void getPlane() {
		// Displaying planes for selection and fetching user choice
		Plane p=new Jetairways("Boeign","jetAirways",200,"hyd","goa",3500,10);
		Plane p1=new Jetairways("Boeign","jetairwyas",100,"goa","hyd",4500,15);
		Plane p2=new Jetairways("airbus","jetairways",150,"hyd","chennai",3000,10);
		Plane p3=new Indigo("Boeign","indigo",200,"hyd","goa",4000,12);
		Plane p4=new Indigo("Boeign","indigo",100,"goa","hyd",4500,13);
		Plane p5=new Indigo("airbus","indigo",150,"hyd","chennai",4500,16);
		planelist=new ArrayList<>();
		planelist.add(p);planelist.add(p1);planelist.add(p2);planelist.add(p3);planelist.add(p4);planelist.add(p5);

		for(int i=0;i<planelist.size();i++)
		{
			System.out.println("select "+i+" For "+planelist.get(i));
		}
		System.out.println("Enter choice ");
		int choice=sc.nextInt();
		selected_plane=(Plane) planelist.get(choice);
		getPassengerDetails();
	}

	public void getUserChoice() {// user choice for log in or registration 		
		System.out.println("Welcome press 1 for login 2 for registration");
		int ch=sc.nextInt();
		if(ch==1){
			login=new Login();login.getLogin();
		}
		else if(ch==2){
			 registration=new Registration();registration.getDetails();
		}
		getJourneyDetails();
	}
}
public class Seat_Booking_Main  
{
	public static void main(String[] args) 
	{
		Start start=new Start();
		start.getUserChoice();		
	}
}
