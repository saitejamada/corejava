package com.streams_examples;
import java.util.*;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	int sal;
	int age;
	public Employee(int id, String name, int sal, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + "]";
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Object compareTo(Employee i1) {
		// TODO Auto-generated method stub
		return null;
	}	
}

public class Employee_Main {

	public static void main(String[] args) {
		
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(112,"sai",25000,21));
		al.add(new Employee(113,"teja",25000,18));
		al.add(new Employee(114,"vijay",22000,25));
		al.add(new Employee(115,"suhas",27000,19));
		al.add(new Employee(116,"vinny",25000,25));
		al.add(new Employee(117,"mary",35000,19));
		al.add(new Employee(119,"sony",15000,22));
		al.add(new Employee(118,"Pavan",25000,28));
		
		System.out.println("Before Sorting");
		al.forEach(a->System.out.println(a));
		
		List<Employee> sort=al.stream().sorted((s,s1)-> s.getAge()>s1.getAge()?1:s.getAge()<s1.getAge()?-1:0).collect(Collectors.toList());
		System.out.println("After Sorting ");
		
		sort.forEach(a->System.out.println(a));
		
		List<Employee> al1=al.stream().filter(e->e.getAge()>20).collect(Collectors.toList());
		System.out.println("Employees Having Age greater than 20 "+al1);
		
		Integer c=(int) al.stream().filter(e->e.getAge()==25).count();
		System.out.println("Employees Having Age  25 is  "+c);
		
		List<Employee> e1=al.stream().filter(e->e.getName().equals("mary")).collect(Collectors.toList());
		System.out.println(" Employee Found  "+e1);
		
		Employee max=al.stream().max((em,emp)->em.getAge()>emp.getAge()?1:em.getAge()<emp.getAge()?-1:0).get();
		System.out.println("Maximum Age is "+max);
		
		
	}
}
