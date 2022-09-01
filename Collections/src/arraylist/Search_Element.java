package arraylist;

import java.util.ArrayList;

public class Search_Element {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("nasdnl");
		al.add(115);
		al.add('M');
		al.add("Sai");
		al.add(54);
		al.add("Teja");
		
		System.out.println("Does ArrayList Contains Mada = "+al.contains("Mada"));
		System.out.println("Does ArrayList Contains M ="+al.contains('M'));
		System.out.println("Elements In Array List Are "+al);
	}
}
