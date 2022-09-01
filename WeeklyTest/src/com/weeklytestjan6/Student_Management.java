package com.weeklytestjan6;

public class Student_Management {

	int id;
	String name;
	String course;
	int mobileno;
	int year;
	public Student_Management(int id, String name, String course, int mobileno, int year) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.mobileno = mobileno;
		this.year = year;
	}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
