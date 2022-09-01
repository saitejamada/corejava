package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example {

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		
		h.add(2027);
		h.add("sai");
		h.add("Teja");
		h.add('M');
		h.add(84);
		h.add(96);
		System.out.println("Elements in HashSet is "+h);
		h.remove(84);
		System.out.println("After Removing Element");
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(" "+it.next());
		}
	}
}

