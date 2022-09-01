package linkedlist;

import java.util.LinkedList;

public class Replace_Element 
{

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add(122);
		ll.add(444);
		ll.add("Sai");
		ll.add(2021);
		ll.add("Teja");
		ll.add('M');
		
		System.out.println("Before Replacing An  Element  "+ll);
		int i=ll.indexOf(2021);
		ll.remove(i);
		ll.add(i, 2022);
		System.out.println("After Replacing An Element "+ll);
	}
}
