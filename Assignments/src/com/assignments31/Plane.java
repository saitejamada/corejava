package com.assignments31;

import java.util.*;

class PlainDetails
{
	int id;
	String name;
	String depature;
	String destination;
	int rate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepature() {
		return depature;
	}
	public void setDepature(String depature) {
		this.depature = depature;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public PlainDetails(int id, String name, String depature, String destination, int rate) {
		super();
		this.id = id;
		this.name = name;
		this.depature = depature;
		this.destination = destination;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", Carrier name=" + name + ", From=" + depature + ", To=" + destination
				+ ", rate=" + rate + "]";
	}
	
}
class ComparatorByDestination implements Comparator<PlainDetails>
{

	@Override
	public int compare(PlainDetails o1, PlainDetails o2) {
		// TODO Auto-generated method stub
		return o1.destination.compareTo(o2.destination);
	}	
}
class ComparatorByDepature implements Comparator<PlainDetails>
{

	@Override
	public int compare(PlainDetails o1, PlainDetails o2) {
		// TODO Auto-generated method stub
		return o1.depature.compareTo(o2.depature);
	}
	
}

class PassengerPlane
{
	String name;
	int age;
	String gender;
	int addharno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAddharno() {
		return addharno;
	}
	public void setAddharno(int addharno) {
		this.addharno = addharno;
	}
	public PassengerPlane(String name, int age, String gender, int addharno) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addharno = addharno;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + ", addharno=" + addharno + "]";
	}
}


public class Plane  {
	

	void printTicket(int id, String name, String depature, String destination, int rate,int date,int month,int hour,int minutes)
	{
		System.out.println("Ticket Details : ");
		System.out.println("From : "+depature);
		System.out.println("To : "+destination);
		System.out.println("Travel Date is : "+date+" And Month is : "+month);
		System.out.println("Depature Time is "+hour+" : "+minutes);
		System.out.println("*****************************************`");
		System.out.println("Carrier : "+name);
		System.out.println("Plane  Id is : "+id);
		System.out.println("Ticket Fair Is "+rate);
		
	}
	


	public static void main(String[] args) {
		
		PlainDetails p=new PlainDetails(1112, "SpiceJet", "hyderabad","goa", 3000);
		PlainDetails p1=new PlainDetails(1122, "JetAirways", "hyderabad","goa", 4500);
		PlainDetails p2=new PlainDetails(412, "AirIndia", "hyderabad","goa", 3500);
		PlainDetails p4=new PlainDetails(1212, "Indigo", "hyderabad","goa", 5500);
		PlainDetails p3=new PlainDetails(987, "AirIndia", "mumbai","hyderabad", 6500);
		PlainDetails p5=new PlainDetails(897, "JetAirways", "mumbai","hyderabad", 9500);
		PlainDetails p6=new PlainDetails(357, "Indigo", "mumbai","hyderabad", 8500);
		
		ArrayList<PlainDetails> al=new ArrayList<>();
		ArrayList<PlainDetails> al1=new ArrayList<>();
		ArrayList<PassengerPlane>	ap=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		
		Date d1=new  Date();
		Plane plane=new Plane();
		
		al.add(p);al.add(p1);al.add(p2);al.add(p3);al.add(p4);al.add(p5);al.add(p6);
		
		
		System.out.println("Enter The Borading");
		String s=sc.next();
		System.out.println("Enter the Destination");
		String b=sc.next();
		
		System.out.println(" Today's Date is "+d1.getDate()+" And Month is "+d1.getMonth());
		System.out.println(" Do You Want to Change The Travel Date And Month  y/n ");
		
		char c=sc.next().charAt(0);
		if(c=='y'||c=='Y')
		{
			System.out.println("Enter The Date");
			int date=sc.nextInt();
			d1.setDate(date);
			System.out.println("Enter Month ");
			int month=sc.nextInt();
			d1.setMonth(month);
		}
		
		System.out.println("Enter The Number Of Passengers ");
		int pass=sc.nextInt();
		
		for(int i=0;i<pass;i++)
		{
			System.out.println("Enter Name ");
			String n=sc.next();
			System.out.println("Enter Age");
			int age=sc.nextInt();
			System.out.println("Enter gender");
			String gen=sc.next();
			System.out.println("Enter Aadhar number");
			int aa=sc.nextInt();
			ap.add(new PassengerPlane(n,age,gen,aa));
		}
		
		Collections.sort(al,new  ComparatorByDepature());
		
		for(int i=0;i<al.size();i++)
		{
			String d=al.get(i).depature;
			if(d.equals(s))
			{
				
				String des=al.get(i).destination;
				if(des.equals(b))
				{
					al1.add(al.get(i));	
				}
			}
		}
		
		System.out.println("Select From Below ");
		for(int i=0;i<al1.size();i++)
		{
			System.out.println("Select "+i+" For "+al1.get(i));
		}
		
		
		System.out.println("Enter The Option");
		int option=sc.nextInt();
		
		if(option<al1.size() && option>=0)
		{
			
			plane.printTicket(al1.get(option).getId(),al1.get(option).getName() , al1.get(option).getDepature(), al1.get(option).getDestination(),al1.get(option).getRate(),d1.getDate(), d1.getMonth(),d1.getHours(),d1.getMinutes());
			System.out.println("******************************************");
			System.out.println("Number Of Passengers "+pass);
			Iterator<PassengerPlane> it=ap.iterator();
			while(it.hasNext())
			{
				System.out.println(" "+it.next());
			}
			System.out.println("***************************************************");
			System.out.println("Total Fair Is "+al1.get(option).rate*pass);
		}
		else
		{
			System.err.println("In Vaild Option Selected");
		}
	
	}
			
}
		
		


	

