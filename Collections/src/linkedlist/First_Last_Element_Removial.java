package linkedlist;

import java.util.LinkedList;

public class First_Last_Element_Removial {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add(122);
		ll.add(444);
		ll.add("Sai");
		ll.add(2021);
		ll.add("Teja");
		ll.add('M');
		
		System.out.println("Before Remove Elements "+ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("After Removing Elements "+ll);
	}
}
