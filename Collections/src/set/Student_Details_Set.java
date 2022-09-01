package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

class Student
{
	int sid;
	String name;
	String course;
	String year;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Student(int sid, String name, String course, String year) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sid == other.sid;
	}	
	
		
}


public class Student_Details_Set {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char c='n';
		HashSet hs=new HashSet();
		
		do
		{
		
			System.out.println("Enter The Student Id");
			int sid=sc.nextInt();
			System.out.println("Enter The Student Name");
			String sname=sc.next();
			System.out.println("Enter Student Course");
			String course=sc.next();
			System.out.println("Enter The Student year");
			String year=sc.next();
			hs.add(new Student(sid,sname,course,year));
			System.out.println("Do You Wish to Add More Elements y / n");
			c=sc.next().charAt(0);
	}while(c=='y' || c=='Y');
	
		Iterator it=hs.iterator();
	
		while(it.hasNext())
		{
			System.out.println(" "+it.next());
		}
		
//	System.out.println(" "+hs);
	}
}
