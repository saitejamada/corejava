package comparator_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmpComparatorBySalary implements Comparator
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

public class ArrayList_Comparator {

	public static void main(String[] args) {
		
		EmpComparatorBySalary ed=new EmpComparatorBySalary();
		//TreeSet ts=new TreeSet(ed);//Customized Sorting order
		
		ArrayList al=new ArrayList();
		
		al.add(new Employee(80,"Mona",900));
		al.add(new Employee(100,"Sona",400));
		al.add(new Employee(12,"Komal",78));
		al.add(new Employee(120,"Monal",800));
		System.out.println("before sorting"+al);
		
		Collections.sort(al,ed);
		
		System.out.println("after sorting"+al);
	}
}
