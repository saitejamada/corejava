package arraylist;

import java.util.ArrayList;

public class ElementInFirstIndex {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(12);
		a.add('M');
		a.add("Sai");
		a.add(1.2);
		a.add("teja");
		a.add(19);
		a.add(96);
		
		System.out.println("Before Updation "+a);
		a.add(0, "mada");
		System.out.println("Afer Adding first Element "+a);
		
		
		
	}
}
