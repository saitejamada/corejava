package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass_Example 
{

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(2027);
		v.add("sai");
		v.add("Teja");
		v.add('M');
		v.add(84);
		v.add(96);
		
		v.insertElementAt(55, 4);
		v.removeElementAt(5);
		Enumeration e=v.elements();
		System.out.println("Enumeration is "+e);
		System.out.println(" Index Of 2 Is "+v.get(2));
		
		Iterator it=v.iterator();
		System.out.println(""+it.getClass().getName());
		
		while(it.hasNext())
		{
			System.out.println(" "+it.next());
		}
	}
}
