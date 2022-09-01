package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseOfLinkedList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add(122);
		ll.add(444);
		ll.add("Sai");
		ll.add(2021);
		ll.add("Teja");
		ll.add('M');
	
		ListIterator li=ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(""+li.next());
		}
		while(li.hasPrevious())
		{
			System.out.println(" "+li.previous());
		}
		
		
	}
}
