package comparator_Examples;

import java.util.Comparator;
import java.util.TreeSet;

class Employee
{
	int eid;
	String ename;
	int sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(int eid, String ename, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
		
}

class EmpComparatorById implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Employee e=(Employee)o1;
		Employee e1=(Employee)o2;
		if(e.eid<e1.eid)
			return -1;
		else if(e.eid>e1.eid)
			return 1;
		else
		return 0;
	}
	
}

class EmpComparatorByName implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e=(Employee)o1;
		Employee e1=(Employee)o2;
		
		return e.ename.compareTo(e1.ename);
	}
	
}

class EmpComparatorBySal implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Employee e=(Employee)o1;
		Employee e1=(Employee)o2;
		if(e.sal<e1.sal)
			return -1;
		else if(e.sal>e1.sal)
			return 1;
		else
		return 0;
	}
	
}
public class Employee_Comparator {

	public static void main(String[] args) {
		
//		EmpComparatorById empid=new EmpComparatorById();
//		TreeSet ts=new TreeSet(empid);
//		ts.add(new Employee(12,"Sai"));
//		ts.add(new Employee(1,"Teja"));
//		ts.add(new Employee(10,"Krish"));
//		ts.add(new Employee(2,"Sona"));
		
//		Employee e=new Employee(12,"Sai");
//		Employee e1=new Employee(1,"Teja");
//		Employee e2=new Employee(22,"Sona");
//		Employee e3=new Employee(32,"abhi");
//		Employee e4=new Employee(5,"Karn");
//		
//		EmpComparatorById empid=new EmpComparatorById();
//		TreeSet ts=new TreeSet(empid);
//		ts.add(e);
//		ts.add(e1);
//		ts.add(e2);
//		ts.add(e3);
//		ts.add(e4);
//	System.out.println(""+ts);
		
		EmpComparatorByName empid=new EmpComparatorByName();
		TreeSet ts=new TreeSet(empid);
		ts.add(new Employee(12,"A",900));
		ts.add(new Employee(1,"B",800));
		ts.add(new Employee(10,"F",1000));
		ts.add(new Employee(2,"Z",2000));
		
		System.out.println("Based On Name"+ts);
		
		EmpComparatorBySal empid1=new EmpComparatorBySal();
		TreeSet ts1=new TreeSet(empid1);
		ts1.add(new Employee(12,"A",900));
		ts1.add(new Employee(1,"B",800));
		ts1.add(new Employee(10,"F",1000));
		ts1.add(new Employee(2,"Z",2000));
		
		System.out.println("Based On Sal"+ts1);
		
		
		
	}
}
