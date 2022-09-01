package com.assignments14dec;

class Teacher
{
	String name;
	int age, numberOfStudents;
	
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

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public Teacher(String name, int age, int numberOfStudents) 
	{
		super();
		this.name = name;
		this.age = age;
		this.numberOfStudents = numberOfStudents;
	}
	void printDetails()
	{
		System.out.println("Name OF Teacher Is : "+name);
		System.out.println("Age Is : "+age);
		System.out.println("Number  OF Students Is : "+numberOfStudents);
	}
}

class Principal extends Teacher
{
	String schoolName;
	int numberOfTeachers;
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public int getNumberOfTeachers() {
		return numberOfTeachers;
	}
	
	public void setNumberOfTeachers(int numberOfTeachers) {
		this.numberOfTeachers = numberOfTeachers;
	}

	public Principal(String name, int age, int numberOfStudents, String schoolName, int numberOfTeachers) {
		super(name, age, numberOfStudents);
		this.schoolName = schoolName;
		this.numberOfTeachers = numberOfTeachers;
	}
	
	void printDetailsOfprincipal()
	{
		printDetails();
		System.out.println("School Name Is : "+schoolName);
		System.out.println("Number Of Teachers in School Are : "+numberOfTeachers);
	}
}
public class School
{
	public static void main(String[] args) 
	{
		Teacher t=new Principal("Mrs.SoumyaRani",35,60,"St.Francis Desales High School",15);
		((Principal) t).printDetailsOfprincipal();
	}
}
