package linkedlist;

import java.util.LinkedList;

public class First_Last_Insertion {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add(122);
		ll.add(444);
		ll.add("Sai");
		ll.add(2021);
		ll.add("Teja");
		ll.add('M');
		
		System.out.println("Before Adding Elements "+ll);
		ll.addFirst("NZB");
		ll.addLast("TS");
		System.out.println("After Adding Elements "+ll);
	}
}
