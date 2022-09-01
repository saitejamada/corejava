package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		
		ArrayList al=new ArrayList();
		al.add("indu");
		al.add("sai");
		al.add("teja");
		al.add("mada");
		al.add(2027);
		al.add(63.3);
		
		System.out.println("Array list before removal "+al);
		al.remove(63.3);
		System.out.println("After Removal is "+al);
		
		Iterator it=al.iterator();
		System.out.println(""+it.getClass().getName());
		
		while(it.hasNext())
		{
			System.out.println(" "+it.next());
		}
	}
}
