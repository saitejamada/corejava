package com.Association.Aggregation;

class MyDate
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
	

	public MyDate(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

	
}
public class Employee1 
{
  int empid,salary;
  String name;
  MyDate dateOfJoining,birthDate;
  
public int getEmpid() {
	return empid;
}


public void setEmpid(int empid) {
	this.empid = empid;
}


public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public MyDate getBirthDate() {
	return birthDate;
}


public void setBirthDate(MyDate birthDate) {
	this.birthDate = birthDate;
}


public MyDate getDateOfJoining() {
	return dateOfJoining;
}


public void setDateOfJoining(MyDate dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}


public Employee1(int empid, int salary, String name, MyDate dateOfJoining,MyDate birthDate) {
	super();
	this.empid = empid;
	this.salary = salary;
	this.name = name;
	this.dateOfJoining=dateOfJoining;
	this.birthDate=birthDate;
}
  @Override
public String toString() {
	return "Employee1 [empid=" + empid + ", salary=" + salary + ", name=" + name + ", dateOfJoining=" + dateOfJoining
			+ ", birthDate=" + birthDate + "]";
}


public static void main(String[] args) 
  {
	int jdate=10;
	int jmonth=12;
	int jyear=2021;
	int bdate=12;
	int bmonth=10;
	int byear=1996;
	
	MyDate m=new MyDate(jdate,jmonth,jyear);
	MyDate m1=new MyDate(bdate,bmonth,byear);
	
	Employee1 e1=new Employee1(33,25000,"Teja",m,m1);
	System.out.println("Employee Details Are "+e1.toString());
  }
  
}
