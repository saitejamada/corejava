package linkedlist;

import java.util.LinkedList;

public class Retrive_Remove_FirstElement {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add(122);
		ll.add(444);
		ll.add("Sai");
		ll.add(2021);
		ll.add("Teja");
		ll.add('M');
		
		System.out.println("Before removing First Element  "+ll);
		
		System.out.println("First Element Is "+ll.getFirst());
		ll.remove(ll.getFirst());
		System.out.println("After removing First Element  "+ll);
		
	}
}
