package arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Reverse_Order_ArrayList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("indu");
		al.add("sai");
		al.add("teja");
		al.add("mada");
		al.add(2027);
		al.add(63.3);
		
		ListIterator it=al.listIterator();
		System.out.println("Elements In Forward");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Elements In Reverse");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}
}
