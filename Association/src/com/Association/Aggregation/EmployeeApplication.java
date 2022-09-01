package com.Association.Aggregation;

class Mydate1
{
	int date,month,year;

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Mydate1(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
}

class Employee 
{
	int eid;
	String ename,address;
	Mydate1 dateOfJoining;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Mydate1 getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Mydate1 dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int eid, String ename, Mydate1 dateOfJoining, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
	}

}
class EmployeeApplication 
{
public static void main(String[] args) 
{
	int date=10;
	int month=12;
	int year=2021;
	
	Mydate1 mydate=new Mydate1(date,month,year);
	
	Employee e=new Employee(1121,"Saiteja",mydate,"Hyedrabad");
	
	System.out.println("Emp Name is"+e.getEname());
	System.out.println("Emp Id is"+e.getEid());
	System.out.println("Emp Address is"+e.getAddress());
	System.out.println("Emp Joining Date is"+e.getDateOfJoining().getDate()+"-"+e.getDateOfJoining().getMonth()+"-"+e.getDateOfJoining().getYear());
	
	
}
}
