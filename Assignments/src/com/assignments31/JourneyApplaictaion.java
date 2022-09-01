package com.assignments31;

import java.util.*;

class Passenger
{
	String name;
	int pan_number;
	int contact_nuber;
	int passport_number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPan_number() {
		return pan_number;
	}
	public void setPan_number(int pan_number) {
		this.pan_number = pan_number;
	}
	public int getContact_nuber() {
		return contact_nuber;
	}
	public void setContact_nuber(int contact_nuber) {
		this.contact_nuber = contact_nuber;
	}
	public int getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(int passport_number) {
		this.passport_number = passport_number;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", pan_number=" + pan_number + ", contact_nuber=" + contact_nuber
				+ ", passport_number=" + passport_number + "]";
	}
	public Passenger(String name, int pan_number, int contact_nuber, int passport_number) {
		super();
		this.name = name;
		this.pan_number = pan_number;
		this.contact_nuber = contact_nuber;
		this.passport_number = passport_number;
	}
	
}

class Planep
{
	int plane_id;
	String date_arrival;
	String arrival_time;
	String departure_date;
	String departure_time;
	String from;
	String to;
	int rate_ticket;
	public int getPlane_id() {
		return plane_id;
	}
	public void setPlane_id(int plane_id) {
		this.plane_id = plane_id;
	}
	public String getDate_arrival() {
		return date_arrival;
	}
	public void setDate_arrival(String date_arrival) {
		this.date_arrival = date_arrival;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getRate_ticket() {
		return rate_ticket;
	}
	public void setRate_ticket(int rate_ticket) {
		this.rate_ticket = rate_ticket;
	}
	@Override
	public String toString() {
		return "Plane [plane_id=" + plane_id + ", date_arrival=" + date_arrival + ", arrival_time=" + arrival_time
				+ ", departure_date=" + departure_date + ", departure_time=" + departure_time + ", from=" + from
				+ ", to=" + to + ", rate_ticket=" + rate_ticket + "]";
	}
	public Planep(int plane_id, String date_arrival, String arrival_time, String departure_date, String departure_time,
			String from, String to, int rate_ticket) {
		super();
		this.plane_id = plane_id;
		this.date_arrival = date_arrival;
		this.arrival_time = arrival_time;
		this.departure_date = departure_date;
		this.departure_time = departure_time;
		this.from = from;
		this.to = to;
		this.rate_ticket = rate_ticket;
	}
	
	public void displayTicket()
	{
		System.out.println("Ticket Details:");
		System.out.println("Plane Id:"+plane_id);
		System.out.println("From:"+from);
		System.out.println("TO:"+to);
		System.out.println("Plane Departure Date:"+departure_date);
		System.out.println("Plane Departure Time:"+departure_time);
	}
	
	int rate()
	{
		return rate_ticket;
	}
	
}
class Ticket extends Planep
{
	int no_of_seats;
	public Ticket(int plane_id, String date_arrival, String arrival_time, String departure_date, String departure_time,
			String from, String to, int rate_ticket,int no_of_seats) {
		super(plane_id, date_arrival, arrival_time, departure_date, departure_time, from, to, rate_ticket);
		this.no_of_seats=no_of_seats;
	}
	
	public void displayTicket()
	{
		System.out.println("Ticket Details:");
		System.out.println("************************************");
		System.out.println("Plane Id	:"+plane_id);
		System.out.println("**********************************");
		System.out.println("From	:"+from);
		System.out.println("TO	:"+to);
		System.out.println("*****************************************");
		System.out.println("Plane Departure Date	:"+departure_date);
		System.out.println("Plane Departure Time	:"+departure_time);
		System.out.println("**********************************************");
		System.out.println("Ticket rate           :"+rate_ticket);
		System.out.println("**************************************");
	}
	
	int rate()
	{
		return rate_ticket;
	}
	
	
}
public class JourneyApplaictaion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList al=new ArrayList();
		int total_amount=0;
		Passenger p[];
		p=new Passenger[10];
		p[0]=new Passenger("Rakesh",125547,2874569,00210045);
		p[1]=new Passenger("Raju",8595147,85967125,00247125);
		p[2]=new Passenger("Ravinder",74592514,8547125,002472155);
		p[3]=new Passenger("Somesh",965742,42585584,2145845);
		p[4]=new Passenger("Amar",725416,965874,30145896);
		p[5]=new Passenger("Zahir",2096742,95874256,254963);
		System.out.println("Choose Your Plane with Appropriate arrival Time");
		System.out.println("1.GoaJet at 9:00AM");
		System.out.println("2.GoaAirline at 2:30PM");
		System.out.println("3.MumbaiJet at 10:00AM");
		System.out.println("4.PuneAirline at 1:00PM");
		System.out.println("5.BangloreKing at 3:00PM");
		int option=scan.nextInt();
		if(option==1)
		{
			System.out.println("Your selected PLane is GoaJet Arrival at 9:00AM");
			Planep GoaJet=new Ticket(102001,"31-12-2021","9:00AM","01-01-2022","5:00AM","Hyderabad","Goa",4500,15);
			System.out.println("How many passengers");
			int pas1=scan.nextInt();
			for(int i=0;i<pas1;i++)
			{
				al.add(p[i]);
			}
			GoaJet.displayTicket();
			System.out.println("List Of Passengers:");
			System.out.println("**************************************");
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			total_amount=GoaJet.rate();
			total_amount=total_amount*pas1;
			System.out.println("*******************************");
			System.out.println("Total Amount:"+total_amount);
			
		}
		else if(option==2)
		{
			System.out.println("Your selected PLane is GoaAirline Arrival at 2:30PM");
			Planep GoaAirline=new Ticket(108541,"31-12-2021","2:30PM","01-01-2022","11:30AM","Hyderabad","Goa",4500,30);
			System.out.println("How many passengers");
			int pas1=scan.nextInt();
			for(int i=0;i<pas1;i++)
			{
				al.add(p[i]);
			}
			GoaAirline.displayTicket();
			System.out.println("List Of Passengers:");
			System.out.println("**************************************");
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			total_amount=GoaAirline.rate();
			total_amount=total_amount*pas1;
			System.out.println("**************************************");
			System.out.println("Total Amount:"+total_amount);
			
		}
		else if(option==3)
		{
			System.out.println("Your selected PLane is MumbaiJet Arrival at 10:00AM");
			Planep MumbaiJet=new Ticket(450254,"31-12-2021","10:00PM","31-12-2021","3:30PM","Hyderabad","Mumbai",2500,10);
			System.out.println("How many passengers");
			int pas1=scan.nextInt();
			for(int i=0;i<pas1;i++)
			{
				al.add(p[i]);
			}
			MumbaiJet.displayTicket();
			System.out.println("List Of Passengers:");
			System.out.println("**************************************");
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			total_amount=MumbaiJet.rate();
			total_amount=total_amount*pas1;
			System.out.println("**************************************");
			System.out.println("Total Amount:"+total_amount);
			
		}
		else if(option==4)
		{
			System.out.println("Your selected PLane is PuneAirline Arrival at 1:00PM");
			Planep PuneAirline=new Ticket(250965,"31-12-2021","1:00PM","1-01-2022","3:30AM","Hyderabad","Pune",3500,35);
			System.out.println("How many passengers");
			int pas1=scan.nextInt();
			for(int i=0;i<pas1;i++)
			{
				al.add(p[i]);
			}
			PuneAirline.displayTicket();
			System.out.println("List Of Passengers:");
			System.out.println("**************************************");
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			total_amount=PuneAirline.rate();
			total_amount=total_amount*pas1;
			System.out.println("**************************************");
			System.out.println("Total Amount:"+total_amount);
			
		}
		else if(option==5)
		{
			System.out.println("Your selected PLane is BangloreKing Arrival at 3:00PM");
			Planep BangloreKing=new Ticket(301468,"31-12-2021","3:00PM","1-01-2022","7:00AM","Hyderabad","Banglore",7500,30);
			System.out.println("How many passengers");
			int pas1=scan.nextInt();
			for(int i=0;i<pas1;i++)
			{
				al.add(p[i]);
			}
			BangloreKing.displayTicket();
			System.out.println("List Of Passengers:");
			System.out.println("**************************************");
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			total_amount=BangloreKing.rate();
			total_amount=total_amount*pas1;
			System.out.println("**************************************");
			System.out.println("Total Amount:"+total_amount);
			
		}
		else
		{
			System.out.println("Invalid option");
		}


	}
}
