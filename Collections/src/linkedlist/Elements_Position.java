package linkedlist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

public class Elements_Position {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add(122);
		ll.add(444);
		ll.add("Sai");
		ll.add(2021);
		ll.add("Teja");
		ll.add('M');
	
		/*Iterator i=ll.iterator()
				
				while(i.hasNext())
				{
					System.out.println(i.next()+" "+ll.indexOf(i));
				}*/
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("["+ll.get(i)+"] The Element Present In Index [ "+i+" ]");
		}
		
	}
}
